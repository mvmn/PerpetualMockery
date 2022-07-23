package x.mvmn.permock.service.impl;

import java.util.ArrayList;
import java.util.Collections;
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
import x.mvmn.permock.model.Dictionary;
import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.model.rules.MockRuleBiLogicalCondition;
import x.mvmn.permock.model.rules.MockRuleCondition;
import x.mvmn.permock.model.rules.MockRuleConstant;
import x.mvmn.permock.model.rules.MockRuleDictionaryAccess;
import x.mvmn.permock.model.rules.MockRuleExpression;
import x.mvmn.permock.model.rules.MockRuleExpression.Type;
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
import x.mvmn.permock.util.BeanUtil.Property;

@Service
public class RuleConditionEvaluationServiceImpl implements RuleConditionEvaluationService {

	@Autowired
	private ModelHelper modelHelper;

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
			boolean result = left.getValue().equals(right.getValue());
			if (expression.getType() == Type.NEQ) {
				result = !result;
			}
			return result;
		case REGEX:
			return Pattern.matches(right.getValue().toString(), left.getValue().toString());
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
			return EvaluationResult.builder().type(constant.getType().getType()).value(constant.getValue()).build();
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

			Object value = null;
			Property expectedType;
			switch (listFunct.getType()) {
			case ALL:
				if (parentList == null) {
					value = true;
				}
			case ANY:
				if (parentList == null) {
					value = false;
				}
				expectedType = new Property(listFunct.getType().name().toLowerCase(), Boolean.class, false);
				break;
			default:
			case WHERE:
				if (parentList == null) {
					value = Collections.emptyList();
				}
				expectedType = parentValue.getB(); // Same type as parent collection - we're just filtering some
													// elements
				break;
			}

			if (value == null) {
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

			if (listFunct.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, expectedType), listFunct.getSubProp(), context);
			} else {
				if (debug) {
					System.err.println("Evaluated list function to " + value + " for " + listFunct);
				}
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

			if (dictAccess.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, elementType), dictAccess.getSubProp(), context);
			} else {
				if (debug) {
					System.err.println("Evaluated dict access to " + value + " for key " + dictAccess.getKey()
							+ " on dictionary " + parentDictionary);
				}
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
			if (listAccess.getSubProp() != null) {
				return evaluatePropertyRef(new Tuple2<>(value, type), listAccess.getSubProp(), context);
			} else {
				if (debug) {
					System.err.println("Evaluated list access to " + value + " for index " + listAccess.getIndex()
							+ " on list " + parentList);
				}
				return EvaluationResult.builder().value(value).type(type).build();
			}
		} else {
			MockRulePropertyAccess propAccess = (MockRulePropertyAccess) propRef;
			// Property access. Can be a primitive function or collection function
			String propertyName = propAccess.getProperty();
			if (parentValue.getA() == null) {
				// Parent val is null
				// For null strings or null collections - isEmpty return true, isNotEmpty return
				// false
				if (parentValue.getB().isCollection() || parentValue.getB().isString()) {
					if ("isEmpty".equals(propertyName)) {
						if (debug) {
							System.err.println(
									"Evaluated isEmpty to true for null value of String/Collection " + propAccess);
						}
						return EvaluationResult.builder().value(true).type(new Property("isEmpty", Boolean.class))
								.build();
					} else if ("isNotEmpty".equals(propertyName)) {
						if (debug) {
							System.err.println(
									"Evaluated isNotEmpty to false for null value of String/Collection " + propAccess);
						}
						return EvaluationResult.builder().value(false).type(new Property("isNotEmpty", Boolean.class))
								.build();
					} else if (parentValue.getB().isCollection() && "size".equals(propertyName)
							|| "length".equals(propertyName)) {
						// For null list return 0 for size
						if (debug) {
							System.err.println(
									"Evaluated size/length to 0 for null value of String/Collection " + propAccess);
						}
						return EvaluationResult.builder().value(Long.valueOf(0L)).type(new Property("size", Long.class))
								.build();
					}
				}
				if (debug) {
					System.err.println("Evaluated null value of property " + propAccess);
				}
				return EvaluationResult.builder().value(null)
						.type(modelHelper.typeOfProperty(parentValue.getB(), propertyName)).build();
			} else {
				// Parent val is not null
				Property expectedType = modelHelper.typeOfProperty(parentValue.getB(), propertyName);
				if (parentValue.getB().isPrimitive()) {
					Object value;
					// Try primitive functions
					if (parentValue.getB().isString()) {
						String parentVal = parentValue.getA().toString();

						// We have functions for strings: length, isEmpty, isBlank
						if ("length".equals(propertyName)) {
							value = Long.valueOf(parentVal.length());
						} else if ("isEmpty".equals(propertyName)) {
							value = parentVal.isEmpty();
						} else if ("isBlank".equals(propertyName)) {
							value = parentVal.isBlank();
						} else {
							throw new IllegalStateException(
									"No function " + propertyName + " for primitive type " + parentValue.getB());
						}
					} else if (parentValue.getB().isNumber() && !parentValue.getB().isInteger()) {
						Double parentVal = ((Number) parentValue.getA()).doubleValue();
						// We have functions for floats: round, ceil, floor
						if ("round".equals(propertyName)) {
							value = Math.round(parentVal);
						} else if ("ceil".equals(propertyName)) {
							value = Double.valueOf(Math.ceil(parentVal)).longValue();
						} else if ("floor".equals(propertyName)) {
							value = Double.valueOf(Math.floor(parentVal)).longValue();
						} else {
							throw new IllegalStateException(
									"No function " + propertyName + " for primitive type " + parentValue.getB());
						}
					} else {
						throw new IllegalStateException(
								"No function " + propertyName + " for primitive type " + parentValue.getB());
					}
					if (debug) {
						System.err.println("Evaluated to " + value + " value of property " + propAccess);
					}
					return EvaluationResult.builder().value(value).type(expectedType).build();
				} else if (parentValue.getB().isCollection()) {
					// Try collection functions
					List<?> parentVal = (List<?>) parentValue.getA();
					Object value;
					// We have functions for strings: length, isEmpty, isBlank
					if ("size".equals(propertyName)) {
						value = parentVal.size();
					} else if ("isEmpty".equals(propertyName)) {
						value = parentVal.isEmpty();
					} else if ("isNotEmpty".equals(propertyName)) {
						value = !parentVal.isEmpty();
					} else if ("first".equals(propertyName)) {
						value = parentVal.size() > 0 ? parentVal.get(0) : null;
					} else if ("last".equals(propertyName)) {
						value = parentVal.size() > 0 ? parentVal.get(parentVal.size() - 1) : null;
					} else {
						throw new IllegalStateException(
								"No function " + propertyName + " for List type " + parentValue.getB());
					}
					if (debug) {
						System.err.println("Evaluated to " + value + " value of property " + propAccess);
					}
					return EvaluationResult.builder().value(value).type(expectedType).build();
				} else {
					// Get property
					try {
						Object value = parentValue.getB().getType()
								.getDeclaredMethod(BeanUtil.propertyNameToGetterName(propertyName))
								.invoke(parentValue.getA());
						if (propAccess.getSubProp() != null) {
							return evaluatePropertyRef(new Tuple2<>(value, expectedType), propAccess.getSubProp(),
									context);
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
}
