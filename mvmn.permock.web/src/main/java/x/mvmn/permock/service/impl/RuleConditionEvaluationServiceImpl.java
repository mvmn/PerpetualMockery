package x.mvmn.permock.service.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.functions.PerpetualMockeryFunctions;
import x.mvmn.permock.model.Dictionary;
import x.mvmn.permock.model.HttpRequestModel;
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
import x.mvmn.permock.model.rules.Tuple2;
import x.mvmn.permock.service.RuleConditionEvaluationService;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.Property;

@Service
public class RuleConditionEvaluationServiceImpl implements RuleConditionEvaluationService {

	@Autowired
	private ModelHelper modelHelper;

	@Autowired
	private PerpetualMockeryFunctions functions;

	@Value("${mock.eval.debug:false}")
	private boolean debug;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	private static class EvaluationContext {
		private HttpRequestModel requestModel;
		private EvaluationContext parent;
		private String listElementAlias;
		private Property listElementType;
		private Object listElementValue;

		public Tuple2<Object, Property> getListElementForAlias(String alias) {
			if (alias.equals(listElementAlias)) {
				return new Tuple2<>(listElementValue, listElementType);
			} else {
				if (parent != null) {
					return parent.getListElementForAlias(alias);
				} else {
					return null;
				}
			}
		}

		public HttpRequestModel getRequestModel() {
			if (requestModel == null && parent != null) {
				return parent.getRequestModel();
			}
			return requestModel;
		}
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	private static class EvaluationResult {
		private Property type;
		private Object value;

		public boolean isNull() {
			return value == null;
		}
	}

	@Override
	public String evaluate(MockRuleOperand operand, HttpRequestModel requestModel) {
		EvaluationResult evalResult = evaluate(operand, EvaluationContext.builder().requestModel(requestModel).build());
		return evalResult.isNull() ? null : evalResult.getValue().toString();
	}

	@Override
	public boolean evaluate(MockRuleCondition conditions, HttpRequestModel requestModel) {
		long startTime = System.currentTimeMillis();
		Object result = evaluate(conditions, EvaluationContext.builder().requestModel(requestModel).build());
		if (debug) {
			System.out.println("Evaluated to " + result + " conditions:\n" + conditions + " - took "
					+ (System.currentTimeMillis() - startTime) + " millisec.");
		}
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	protected boolean evaluate(MockRuleCondition condition, EvaluationContext context) {
		if (condition.isBinaryLogicalCondition()) {
			MockRuleBiLogicalCondition biCondition = (MockRuleBiLogicalCondition) condition;
			boolean left = evaluate(biCondition.getLeft(), context);
			if (debug) {
				System.err.println("Evaluated to " + left + " left operand of " + biCondition.getType() + ":\n"
						+ biCondition.getLeft());
			}

			switch (biCondition.getType()) {
			case AND:
				if (!left) {
					return false;
				}
				break;
			case OR:
			default:
				if (left) {
					return true;
				}
			}
			boolean right = evaluate(biCondition.getRight(), context);
			if (debug) {
				System.err.println("Evaluated to " + right + " right operand of " + biCondition.getType() + ":\n"
						+ biCondition.getRight());
			}
			return right;
		} else if (condition.isUnaryLogicalCondition()) {
			MockRuleUnaryCondition uc = (MockRuleUnaryCondition) condition;
			boolean result = evaluate(uc.getWrappedCondition(), context);

			if (debug) {
				System.err.println("Evaluated to " + result + " operand of " + (uc.isNegate() ? "not " : "")
						+ " condition:\n" + uc.getWrappedCondition());
			}
			if (uc.isNegate()) {
				return !result;
			} else {
				return result;
			}
		} else if (condition.isExpression()) {
			boolean result = evaluateExpression((MockRuleExpression) condition, context);

			if (debug) {
				System.err.println("Evaluated to " + result + " expression " + condition);
			}

			return result;
		} else {
			throw new IllegalArgumentException("Incorrect condition type");
		}
	}

	private boolean evaluateExpression(MockRuleExpression expression, EvaluationContext context) {
		EvaluationResult left = evaluate(expression.getLeft(), context);
		if (left == null || left.isNull() || !left.getType().isPrimitive()) {
			System.err.println("Left side of evaluation is null or not a primitive: " + left + ". " + expression);
			return false;
		}

		EvaluationResult right = evaluate(expression.getRight(), context);

		if (debug) {
			System.err.println("Evaluating expression " + left + " " + expression.getType().name() + " " + right);
		}

		switch (expression.getType()) {
		default:
		case EQ:
		case NEQ:
			boolean result = left.getValue() == right.getValue() // will return true of both are null
					|| left.getValue() != null && left.getValue().equals(right.getValue()); // left not null - compare,
																							// else for sure not equal
			if (expression.getType() == Type.NEQ) {
				result = !result;
			}
			return result;
		case REGEX:
			return Pattern.matches(!right.isNull() ? right.getValue().toString() : "",
					!left.isNull() ? left.getValue().toString() : "");
		case GT:
		case GTEQ:
		case LT:
		case LTEQ:
			if (!left.getType().isNumber() || right.isNull()) {
				System.err.println("Left side of evaluation is not a number or right side is null: left = " + left
						+ ". expression = " + expression);
				return false;
			}
			Number leftNum = (Number) left.getValue();
			Number rightNum = (Number) right.getValue();
			if (left.getType().isInteger() && right.getType().isInteger()) {
				switch (expression.getType()) {
				case GT:
					return leftNum.longValue() > rightNum.longValue();
				case GTEQ:
					return leftNum.longValue() >= rightNum.longValue();
				case LT:
					return leftNum.longValue() < rightNum.longValue();
				case LTEQ:
					return leftNum.longValue() <= rightNum.longValue();
				default:
					throw new IllegalStateException();
				}
			} else {
				switch (expression.getType()) {
				case GT:
					return leftNum.doubleValue() > rightNum.doubleValue();
				case GTEQ:
					return leftNum.doubleValue() >= rightNum.doubleValue();
				case LT:
					return leftNum.doubleValue() < rightNum.doubleValue();
				case LTEQ:
					return leftNum.doubleValue() <= rightNum.doubleValue();
				default:
					throw new IllegalStateException();
				}
			}
		}
	}

	private EvaluationResult evaluate(MockRuleOperand operand, EvaluationContext context) {
		if (operand.isConstant()) {
			MockRuleConstant constant = (MockRuleConstant) operand;

			if (constant.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(constant.getValue(), constant.getType().getType()),
						constant.getSubProp(), context);
			} else {
				return EvaluationResult.builder().type(constant.getType().getType()).value(constant.getValue()).build();
			}
		} else if (operand.isListElementRef()) {
			MockRuleListElementReference listElemRef = (MockRuleListElementReference) operand;
			String alias = listElemRef.getListElementAlias();
			Tuple2<Object, Property> listElement = context.getListElementForAlias(alias);
			if (listElemRef.getPropRef() != null) {
				return evaluatePropertyRef(listElement, listElemRef.getPropRef(), context);
			} else {
				if (debug) {
					System.err.println("Evaluated list element ref " + alias + " to " + listElement);
				}
				return EvaluationResult.builder().type(listElement.getB()).value(listElement.getA()).build();
			}
		} else {
			MockRuleReference ref = (MockRuleReference) operand;
			String entityName = ref.getEntity();

			try {
				Property entityType = modelHelper.entities().stream().filter(e -> e.getName().equals(entityName))
						.findAny().orElseThrow(IllegalStateException::new);
				Object entityValue = HttpRequestModel.class
						.getDeclaredMethod(BeanUtil.propertyNameToGetterName(entityName))
						.invoke(context.getRequestModel());
				if (ref.getPropRef() != null) {
					return evaluatePropertyRef(new Tuple2<>(entityValue, entityType), ref.getPropRef(), context);
				} else {
					if (debug) {
						System.err.println("Evaluated entity " + entityName + " to " + entityValue);
					}
					return EvaluationResult.builder().type(entityType).value(entityValue).build();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	private EvaluationResult evaluatePropertyRef(Tuple2<Object, Property> parentValue,
			MockRulePropertyReference propRef, EvaluationContext context) {
		EvaluationResult result = doEvaluatePropertyRef(parentValue, propRef, context);
		return normalizeTypes(result);
	}

	private EvaluationResult normalizeTypes(EvaluationResult param) {
		if (param.getValue() instanceof Integer) {
			param.setValue(Long.valueOf((Integer) param.getValue()));
		}
		if (param.getValue() instanceof Float) {
			param.setValue(Double.valueOf((Float) param.getValue()));
		}

		return param;
	}

	private EvaluationResult doEvaluatePropertyRef(Tuple2<Object, Property> parentValue,
			MockRulePropertyReference propRef, EvaluationContext context) {
		if (propRef.isListFunction()) {
			MockRuleListFunction listFunct = (MockRuleListFunction) propRef;

			List<?> parentList = (List<?>) parentValue.getA();
			boolean parentListNullOrEmpty = parentList == null || parentList.isEmpty();

			Object value = null;
			Property expectedType;
			switch (listFunct.getType()) {
			case ALL:
				if (parentListNullOrEmpty) {
					value = true;
				}
				expectedType = new Property(listFunct.getType().name().toLowerCase(), Boolean.class, false);
				break;
			case ANY:
				if (parentListNullOrEmpty) {
					value = false;
				}
				expectedType = new Property(listFunct.getType().name().toLowerCase(), Boolean.class, false);
				break;
			default:
			case WHERE:
				if (parentListNullOrEmpty) {
					value = Collections.emptyList();
				}
				expectedType = parentValue.getB(); // Same type as parent collection - we're just filtering some
													// elements
				break;
			}

			if (value == null) { // true if not parentListNullOrEmpty
				Property listElementType = new Property(listFunct.getListElementAlias(), parentValue.getB().getType(),
						BeanUtil.isCollection(parentValue.getB().getType()));

				List<Object> filteredList = new ArrayList<>(parentList.size());

				switch (listFunct.getType()) {
				case ALL:
					// By default set to true. Set to false if at least one non-matching element
					// found
					value = true;
					break;
				case ANY:
					// By default set to false. Set to true if at least one matching element found
					value = false;
					break;
				case WHERE:
					value = filteredList;
					break;
				default:
				}

				// Evaluate
				loop: for (Object element : parentList) {
					EvaluationContext subContext = EvaluationContext.builder().parent(context)
							.listElementAlias(listFunct.getListElementAlias()).listElementType(listElementType)
							.listElementValue(element).build();
					boolean evalResult = evaluate(listFunct.getCondition(), subContext);

					if (debug) {
						System.err.println("Evaluated to " + evalResult + " list element " + element + " condition "
								+ listFunct.getCondition() + " in list function " + listFunct.getListElementAlias()
								+ " " + listFunct.getType());
					}

					switch (listFunct.getType()) {
					case ALL:
						if (!evalResult) {
							value = false;
							break loop;
						}
						break;
					case ANY:
						if (evalResult) {
							value = true;
							break loop;
						}
						break;
					case WHERE:
						if (evalResult) {
							filteredList.add(element);
						}
						break;
					}
				}
			}

			if (debug) {
				System.err.println("Evaluated list function to " + value + " for " + listFunct);
			}
			if (listFunct.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, expectedType), listFunct.getSubProp(), context);
			} else {
				return EvaluationResult.builder().value(value).type(expectedType).build();
			}
		} else if (propRef.isDictionaryAccess()) {
			MockRuleDictionaryAccess dictAccess = (MockRuleDictionaryAccess) propRef;
			Property elementType = modelHelper.getDictionaryValueType(parentValue.getB());

			@SuppressWarnings("unchecked")
			Dictionary<String, ?> parentDictionary = (Dictionary<String, ?>) parentValue.getA();
			Object value = null;
			if (parentDictionary != null) {
				value = parentDictionary.get(dictAccess.getKey());
			}

			if (debug) {
				System.err.println("Evaluated dict access to " + value + " for key " + dictAccess.getKey()
						+ " on dictionary " + parentDictionary);
			}
			if (dictAccess.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, elementType), dictAccess.getSubProp(), context);
			} else {
				return EvaluationResult.builder().value(value).type(elementType).build();
			}
		} else if (propRef.isListAccess()) {
			MockRuleListAccess listAccess = (MockRuleListAccess) propRef;
			if (!parentValue.getB().isCollection()) {
				throw new IllegalStateException("List access for a non-list value " + parentValue);
			}
			List<?> parentList = (List<?>) parentValue.getA();
			Object value = null;
			if (parentList != null && parentList.size() > listAccess.getIndex()) {
				value = parentList.get(listAccess.getIndex());
			}
			Property type = new Property(parentValue.getB().getName(), parentValue.getB().getType(),
					BeanUtil.isCollection(parentValue.getB().getType()));
			if (debug) {
				System.err.println("Evaluated list access to " + value + " for index " + listAccess.getIndex()
						+ " on list " + parentList);
			}
			if (listAccess.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, type), listAccess.getSubProp(), context);
			} else {
				return EvaluationResult.builder().value(value).type(type).build();
			}
		} else if (propRef.isFunctionCall()) {
			MockRuleFunctionCall functCall = (MockRuleFunctionCall) propRef;
			Method funct = modelHelper.getFunction(functCall.getName(), functCall.getArgs().size())
					.orElseThrow(() -> new IllegalStateException("Can't resolve function " + functCall.getName()
							+ " with args " + (functCall.getArgs().size() + 1)));
			Object[] args = new Object[funct.getParameterCount()];
			args[0] = parentValue.getA();
			Iterator<MockRuleOperand> functArgIterator = functCall.getArgs().iterator();
			for (int i = 1; i < args.length; i++) {
				MockRuleOperand operand = functArgIterator.next();
				args[i] = normalizeTypes(evaluate(operand, context)).getValue();
				if (debug) {
					System.err.println("Evaluated function parameter " + operand + " to " + args[i]);
				}
			}
			try {
				Property expectedType = BeanUtil.fromMethod(funct, parentValue.getB());
				Object result = funct.invoke(functions, args);

				if (debug) {
					System.err.println(
							"Evaluated function " + functCall.getName() + " with " + (functCall.getArgs().size() + 1)
									+ " args to " + result + ". Args = " + Arrays.toString(args));
				}
				if (functCall.getSubProp() != null) {
					return evaluatePropertyRef(new Tuple2<>(result, expectedType), functCall.getSubProp(), context);
				} else {
					return EvaluationResult.builder().value(result).type(expectedType).build();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		} else {
			MockRulePropertyAccess propAccess = (MockRulePropertyAccess) propRef;
			// Property access. Can be a primitive function or collection function
			String propertyName = propAccess.getProperty();
			if (parentValue.getA() == null) {
				if (debug) {
					System.err.println("Evaluated null value of property " + propAccess);
				}
				return EvaluationResult.builder().value(null)
						.type(modelHelper.typeOfProperty(parentValue.getB(), propertyName)).build();
			} else {
				// Parent val is not null
				Property expectedType = modelHelper.typeOfProperty(parentValue.getB(), propertyName);

				// Get property
				try {
					Object value = parentValue.getB().getType()
							.getDeclaredMethod(BeanUtil.propertyNameToGetterName(propertyName))
							.invoke(parentValue.getA());
					if (propAccess.getSubProp() != null) {
						return evaluatePropertyRef(new Tuple2<>(value, expectedType), propAccess.getSubProp(), context);
					} else {
						if (debug) {
							System.err.println("Evaluated to " + value + " value of property " + propAccess);
						}
						return EvaluationResult.builder().value(value).type(expectedType).build();
					}
				} catch (Exception e) {
					throw new RuntimeException(
							"Failed to obtain property " + propertyName + " from " + parentValue.getA() + " ", e);
				}
			}
		}
	}
}
