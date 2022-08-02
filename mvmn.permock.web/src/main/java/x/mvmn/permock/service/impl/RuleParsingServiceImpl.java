package x.mvmn.permock.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import x.mvmn.permock.dsl.dsl.AndCondition;
import x.mvmn.permock.dsl.dsl.Condition;
import x.mvmn.permock.dsl.dsl.Constant;
import x.mvmn.permock.dsl.dsl.Expression;
import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.ListOperation;
import x.mvmn.permock.dsl.dsl.Negation;
import x.mvmn.permock.dsl.dsl.Operand;
import x.mvmn.permock.dsl.dsl.Operator;
import x.mvmn.permock.dsl.dsl.OrCondition;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.ProxyConf;
import x.mvmn.permock.dsl.dsl.Reference;
import x.mvmn.permock.dsl.dsl.ResponseConf;
import x.mvmn.permock.dsl.dsl.Rule;
import x.mvmn.permock.model.rules.MockResponseConfig;
import x.mvmn.permock.model.rules.MockResponseConfig.MockResponseConfigHeader;
import x.mvmn.permock.model.rules.MockRule;
import x.mvmn.permock.model.rules.MockRuleBiLogicalCondition;
import x.mvmn.permock.model.rules.MockRuleCondition;
import x.mvmn.permock.model.rules.MockRuleConstant;
import x.mvmn.permock.model.rules.MockRuleDictionaryAccess;
import x.mvmn.permock.model.rules.MockRuleExpression;
import x.mvmn.permock.model.rules.MockRuleExpression.Type;
import x.mvmn.permock.model.rules.MockRuleFunctionCall;
import x.mvmn.permock.model.rules.MockRuleListAccess;
import x.mvmn.permock.model.rules.MockRuleListElementReference;
import x.mvmn.permock.model.rules.MockRuleListFunction;
import x.mvmn.permock.model.rules.MockRuleOperand;
import x.mvmn.permock.model.rules.MockRulePropertyAccess;
import x.mvmn.permock.model.rules.MockRulePropertyReference;
import x.mvmn.permock.model.rules.MockRuleReference;
import x.mvmn.permock.model.rules.MockRuleUnaryCondition;
import x.mvmn.permock.service.RuleParsingService;
import x.mvmn.permock.xtext.service.XtextService;

@Service
public class RuleParsingServiceImpl implements RuleParsingService {

	@Autowired
	private XtextService xtextService;

	@Override
	public MockRule parse(String text) {
		EObject parseResult = xtextService.parse(text);
		if (!(parseResult instanceof Rule)) {
			return null;
		}
		Rule parsedRule = (Rule) parseResult;

		return map(parsedRule);
	}

	private MockRule map(Rule parsedRule) {
		return MockRule.builder()
				.responseConfig(
						parsedRule.getProxy() == null ? map(parsedRule.getResponse()) : map(parsedRule.getProxy()))
				.conditions(map(parsedRule.getConditions())).build();
	}

	private MockResponseConfig map(ProxyConf proxy) {
		return MockResponseConfig.builder().proxy(true).proxyUrl(proxy.getProxyUrl()).build();
	}

	private MockResponseConfig map(ResponseConf response) {
		MockResponseConfig result = new MockResponseConfig();
		result.setProxy(false);
		result.setResponseStatus(200);
		if (response != null) {
			result.setResposeBody(response.getContent());
			if (response.getHttpStatus() != null) {
				result.setResponseStatus(response.getHttpStatus().intValue());
			}
			if (response.getHeaders() != null && response.getHeaders().getHeaders() != null) {
				List<MockResponseConfigHeader> headers = response.getHeaders().getHeaders().stream()
						.map(header -> new MockResponseConfigHeader(header.getHeaderName(), header.getHeaderValue()))
						.collect(Collectors.toList());
				result.setResponseHeaders(headers);
			}
		}
		return result;
	}

	private MockRuleCondition map(Condition condition) {
		if (condition.getExpression() != null) {
			Expression expression = condition.getExpression();
			return MockRuleExpression.builder().type(mapExpressionType(expression.getOp()))
					.left(map(expression.getLeft()))
					.right(expression.getRight() != null ? map(expression.getRight())
							: MockRuleConstant.builder().type(MockRuleConstant.Type.BOOL).boolVal(true).build())
					.build();
		} else {
			if (condition instanceof Negation) {
				Negation negation = (Negation) condition;
				return MockRuleUnaryCondition.builder().wrappedCondition(map(negation.getNegated())).negate(true)
						.build();
			} else if (condition instanceof AndCondition) {
				AndCondition andCondition = (AndCondition) condition;
				return MockRuleBiLogicalCondition.builder().type(MockRuleBiLogicalCondition.Type.AND)
						.left(map(andCondition.getLeft())).right(map(andCondition.getRight())).build();
			} else if (condition instanceof OrCondition) {
				OrCondition orCondition = (OrCondition) condition;
				return MockRuleBiLogicalCondition.builder().type(MockRuleBiLogicalCondition.Type.OR)
						.left(map(orCondition.getLeft())).right(map(orCondition.getRight())).build();
			} else {
				return map(condition.getCondition());
			}
		}
	}

	private MockRuleOperand map(Operand operand) {
		if (operand.getConst() != null) {
			return map(operand.getConst());
		} else if (operand.getRef() != null) {
			return map(operand.getRef());
		} else {
			return map(operand.getListElementRef());
		}
	}

	private MockRuleOperand map(ListElementReference listElementRef) {
		return MockRuleListElementReference.builder().listElementAlias(listElementRef.getName().getName())
				.propRef(map(listElementRef.getProp())).build();
	}

	private MockRuleOperand map(Reference ref) {
		return MockRuleReference.builder().entity(ref.getName().getName()).propRef(map(ref.getProp())).build();
	}

	private MockRulePropertyReference map(PropertyRef prop) {
		if (prop == null) {
			return null;
		}
		MockRulePropertyReference result;
		if (prop.getCollectionAccess() != null && prop.getCollectionAccess().getIndex() != null) {
			result = MockRuleListAccess.builder().index(prop.getCollectionAccess().getIndex().intValue()).build();
		} else if (prop.getCollectionAccess() != null && prop.getCollectionAccess().getKey() != null) {
			result = MockRuleDictionaryAccess.builder().key(prop.getCollectionAccess().getKey()).build();
		} else if (prop.getPropAccess() != null) {
			result = MockRulePropertyAccess.builder().property(prop.getPropAccess().getName()).build();
		} else if (prop.getFunctionCall() != null) {
			List<Operand> params = prop.getFunctionCall().getFunctionParameters();
			if (params == null) {
				params = Collections.emptyList();
			}
			result = MockRuleFunctionCall.builder().name(prop.getFunctionCall().getName())
					.args(params.stream().map(this::map).collect(Collectors.toList())).build();
		} else {
			ListFunction listFunct = prop.getListFunc();
			result = MockRuleListFunction.builder().type(map(listFunct.getOp()))
					.listElementAlias(listFunct.getAlias().getName()).condition(map(listFunct.getCondition())).build();
		}

		if (prop.getSubPropery() != null) {
			result.setSubProp(map(prop.getSubPropery()));
		}

		return result;
	}

	private MockRuleListFunction.Type map(ListOperation op) {
		switch (op) {
		case FILTER:
			return MockRuleListFunction.Type.WHERE;
		case ALL:
			return MockRuleListFunction.Type.ALL;
		case ANY:
			return MockRuleListFunction.Type.ANY;
		default:
		}
		throw new IllegalArgumentException();
	}

	private MockRuleOperand map(Constant constant) {
		MockRulePropertyReference propRef = null;
		if (constant.getSubPropery() != null) {
			propRef = map(constant.getSubPropery());
		}

		if (constant.getBoolVal() != null) {
			return MockRuleConstant.builder().type(MockRuleConstant.Type.BOOL).boolVal(constant.getBoolVal())
					.subProp(propRef).build();
		} else if (constant.getIntVal() != null) {
			return MockRuleConstant.builder().type(MockRuleConstant.Type.INT).intVal(constant.getIntVal())
					.subProp(propRef).build();

		} else if (constant.getFloatVal() != null) {
			return MockRuleConstant.builder().type(MockRuleConstant.Type.FLOAT).floatVal(constant.getFloatVal())
					.subProp(propRef).build();
		} else {
			return MockRuleConstant.builder().type(MockRuleConstant.Type.STR).strVal(constant.getStrVal())
					.subProp(propRef).build();
		}
	}

	private Type mapExpressionType(Operator op) {
		return op == null ? Type.EQ : Type.valueOf(op.name());
	}
}
