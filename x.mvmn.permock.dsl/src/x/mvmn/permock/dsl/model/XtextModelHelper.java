package x.mvmn.permock.dsl.model;

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.CollectionAccess;
import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.PropertyAccess;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.Reference;
import x.mvmn.permock.dsl.services.DslGrammarAccess;
import x.mvmn.permock.util.BeanUtil;

public class XtextModelHelper {

	@Inject
	private ModelHelper modelHelper;

	@Inject
	private DslGrammarAccess grammarAccess;

	public BeanUtil.Property resolveType(EObject currentModel) {
		if (currentModel instanceof Reference) {
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
			}
		} else if (currentModel instanceof ListElementReference) {
			ListElementReference listElRef = (ListElementReference) currentModel;
			String alias = listElRef.getName() != null ? listElRef.getName().getName() : null;
			if (alias != null) {
				ListFunction parentListFunction = findMatchingContainerOfType(currentModel, ListFunction.class,
						lf -> lf.getAlias().getName().equals(alias));
				if (parentListFunction != null) {
					BeanUtil.Property parentCollection = resolveType(parentListFunction.eContainer().eContainer());
					if (parentCollection != null) {
						return new BeanUtil.Property(alias, parentCollection.getType(),
								BeanUtil.isCollection(parentCollection.getType()));
					}
				}
			}
		} else if (currentModel instanceof ListFunction) {
			ListFunction listFunction = (ListFunction) currentModel;
			if (grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0().getLiteral().getValue()
					.equals(listFunction.getOp().getLiteral())) {
				return resolveType(currentModel.eContainer().eContainer());
			} else { // ALL, ANY - boolean result
				return BeanUtil.Property.of("list", Boolean.class, false);
			}
		}
		return null;
	}

	private BeanUtil.Property getReferenceType(Reference reference) {
		String entityName = reference.getName().getName();
		return modelHelper.entityType(entityName);
	}

	private BeanUtil.Property getPropertyType(PropertyAccess propertyRef) {
		BeanUtil.Property parentType = resolveType(propertyRef.eContainer().eContainer());
		if (parentType == null) {
			return null;
		}
		return propertyRef.getName() != null ? modelHelper.typeOfProperty(parentType, propertyRef.getName()) : null;
	}

	private BeanUtil.Property getCollectionType(CollectionAccess collectionAccess) {
		BeanUtil.Property parentType = resolveType(collectionAccess.eContainer().eContainer());
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
			return new BeanUtil.Property(collectionAccess.getIndex().toString(), parentType.getType(), false);
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
}
