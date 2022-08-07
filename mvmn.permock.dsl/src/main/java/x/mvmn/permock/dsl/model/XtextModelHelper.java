package x.mvmn.permock.dsl.model;

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

import lombok.Setter;
import lombok.experimental.Accessors;
import x.mvmn.permock.dsl.dsl.CollectionAccess;
import x.mvmn.permock.dsl.dsl.Constant;
import x.mvmn.permock.dsl.dsl.FunctionCall;
import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.ListOperation;
import x.mvmn.permock.dsl.dsl.Operand;
import x.mvmn.permock.dsl.dsl.PropertyAccess;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.Reference;
import x.mvmn.permock.dsl.model.ModelHelper.FunctionDescriptor;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.Property;

@Setter
@Accessors(chain = true)
public class XtextModelHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(XtextModelHelper.class);

	@Inject
	private ModelHelper modelHelper;

	public Property resolveType(EObject currentModel) {
		if (currentModel instanceof Operand) {
			Operand op = (Operand) currentModel;
			if (op.getConst() != null) {
				return resolveType(getDeepestNode(op.getConst()));
			} else if (op.getRef() != null) {
				return resolveType(getDeepestNode(op.getRef()));
			} else if (op.getListElementRef() != null) {
				return resolveType(getDeepestNode(op.getListElementRef()));
			}
		} else if (currentModel instanceof Reference) {
			return getReferenceType((Reference) currentModel);
		} else if (currentModel instanceof PropertyAccess) {
			return getPropertyType((PropertyAccess) currentModel);
		} else if (currentModel instanceof CollectionAccess) {
			return getCollectionType((CollectionAccess) currentModel);
		} else if (currentModel instanceof PropertyRef) {
			PropertyRef propertyRef = (PropertyRef) currentModel;
			if (propertyRef.getCollectionAccess() != null) {
				return getCollectionType(propertyRef.getCollectionAccess());
			} else if (propertyRef.getPropAccess() != null) {
				return getPropertyType(propertyRef.getPropAccess());
			} else if (propertyRef.getListFunc() != null) {
				ListFunction listFunction = propertyRef.getListFunc();
				return resolveType(listFunction);
			} else if (propertyRef.getFunctionCall() != null) {
				FunctionCall functionCall = propertyRef.getFunctionCall();
				return getFunctionResultType(functionCall);
			}
		} else if (currentModel instanceof ListElementReference) {
			ListElementReference listElRef = (ListElementReference) currentModel;
			String alias = listElRef.getName() != null ? listElRef.getName().getName() : null;
			return resolveListElementRefType(listElRef, alias);
		} else if (currentModel instanceof ListFunction) {
			ListFunction listFunction = (ListFunction) currentModel;
			if (listFunction.getOperand() != null) {
				Property elementType = resolveType(listFunction.getOperand());
				return elementType != null ? Property.of("list", elementType.getType(), true) : null;
			} else if (listFunction.getOp() == ListOperation.FILTER) {
				return resolveType(currentModel.eContainer().eContainer());
			} else { // ALL, ANY - boolean result
				return Property.of("list", Boolean.class, false);
			}
		} else if (currentModel instanceof FunctionCall) {
			return getFunctionResultType((FunctionCall) currentModel);
		} else if (currentModel instanceof PropertyAccess) {
			return getPropertyType((PropertyAccess) currentModel);
		} else if (currentModel instanceof ListFunction) {
			return resolveType((ListFunction) currentModel);
		} else if (currentModel instanceof Constant) {
			Constant constant = (Constant) currentModel;
			if (constant.getBoolVal() != null) {
				return Property.of("constant", Boolean.class, false);
			} else if (constant.getStrVal() != null) {
				return Property.of("constant", String.class, false);
			} else if (constant.getIntVal() != null) {
				return Property.of("constant", Long.class, false);
			} else if (constant.getFloatVal() != null) {
				return Property.of("constant", Double.class, false);
			} else {
				LOGGER.error("Unknown constant type: " + constant);
			}
		} else {
			LOGGER.error("Not covered in resolveType: " + currentModel);
		}
		return null;
	}

	private Property getFunctionResultType(FunctionCall functionCall) {
		FunctionDescriptor function = getFunctionDescriptor(functionCall);
		return function != null ? function.getReturnType() : null;
	}

	public FunctionDescriptor getFunctionDescriptor(FunctionCall functionCall) {
		Property parentType = resolveType(functionCall.eContainer().eContainer());

		if (parentType != null) {
			String functionName = functionCall.getName();

			return modelHelper.getFunctionDescriptors(parentType).stream()
					.filter(func -> func.getName().equals(functionName))
					.filter(func -> func.getArgs().size() == functionCall.getFunctionParameters().size() + 1)
					.findFirst().orElse(null);
		}
		return null;
	}

	public Property resolveListElementRefType(ListElementReference listElRef, String alias) {
		if (alias != null) {
			ListFunction parentListFunction = findMatchingContainerOfType(listElRef, ListFunction.class,
					lf -> lf.getAlias().getName().equals(alias));
			if (parentListFunction != null) {
				Property parentCollection = resolveType(parentListFunction.eContainer().eContainer());
				if (parentCollection != null) {
					return new Property(alias, parentCollection.getType(),
							BeanUtil.isCollection(parentCollection.getType()));
				}
			}
		}
		return null;
	}

	private Property getReferenceType(Reference reference) {
		String entityName = reference.getName().getName();
		return modelHelper.entityType(entityName);
	}

	private Property getPropertyType(PropertyAccess propertyRef) {
		Property parentType = resolveType(propertyRef.eContainer().eContainer());
		if (parentType == null) {
			return null;
		}
		return propertyRef.getName() != null ? modelHelper.typeOfProperty(parentType, propertyRef.getName()) : null;
	}

	private Property getCollectionType(CollectionAccess collectionAccess) {
		Property parentType = resolveType(collectionAccess.eContainer().eContainer());
		if (collectionAccess.getKey() != null) {
			return modelHelper.getDictionaryValueType(parentType);
		}
		if (parentType == null) {
			return null;
		}
		if (collectionAccess.getIndex() == null) {
			return null;
		}
		if (!parentType.isCollection()) {
			return null;
		} else {
			return new Property(collectionAccess.getIndex().toString(), parentType.getType(), false);
		}
	}

	private <T extends EObject> T findMatchingContainerOfType(EObject currentModel, Class<T> clazz,
			Predicate<T> check) {
		T candidate = EcoreUtil2.getContainerOfType(currentModel, clazz);
		while (candidate != null) {
			if (check.test(candidate)) {
				return candidate;
			} else {
				if (candidate.eContainer() != null) {
					candidate = EcoreUtil2.getContainerOfType(candidate.eContainer(), clazz);
				} else {
					return null;
				}
			}
		}
		return null;
	}

	public EObject getDeepestNode(ListElementReference listElementRef) {
		if (listElementRef.getProp() != null) {
			return getDeepestNode(listElementRef.getProp());
		}
		return listElementRef;
	}

	public EObject getDeepestNode(Operand operand) {
		if (operand.getRef() != null) {
			return getDeepestNode(operand.getRef());
		} else if (operand.getListElementRef() != null) {
			return getDeepestNode(operand.getListElementRef());
		} else {
			return getDeepestNode(operand.getConst());
		}
	}

	public EObject getDeepestNode(Reference ref) {
		if (ref.getProp() != null) {
			return getDeepestNode(ref.getProp());
		}
		return ref;
	}

	public EObject getDeepestNode(Constant constant) {
		if (constant.getSubPropery() != null) {
			return getDeepestNode(constant.getSubPropery());
		}
		return constant;
	}

	public EObject getDeepestNode(PropertyRef prop) {
		if (prop.getSubPropery() != null) {
			return getDeepestNode(prop.getSubPropery());
		} else if (prop.getCollectionAccess() != null) {
			return prop.getCollectionAccess();
		} else if (prop.getListFunc() != null) {
			return prop.getListFunc();
		} else if (prop.getCollectionAccess() != null) {
			return prop.getCollectionAccess();
		} else if (prop.getFunctionCall() != null) {
			return prop.getFunctionCall();
		}
		return prop;
	}
}
