package x.mvmn.permock.dsl.model;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import x.mvmn.permock.model.Dictionary;
import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.BeanUtil.Property;

public class ModelHelper {

	private final Function<Property, List<Property>> GET_COLLECTION_FUNCTIONS = prop -> List.of(
			Property.of("size", Integer.class, false), Property.of("isEmpty", Boolean.class, false),
			Property.of("isNotEmpty", Boolean.class, false),
			Property.of("first", prop.getType(), BeanUtil.isCollection(prop.getType())),
			Property.of("last", prop.getType(), BeanUtil.isCollection(prop.getType())));

	private final Map<Class<?>, List<Property>> PRIMITIVE_TYPES_PROPERTIES = Map.of(
			String.class, List.of(Property.of("length", Integer.class, false),
					Property.of("isEmpty", Boolean.class, false), Property.of("isBlank", Boolean.class, false)),
			Double.class,
			List.of(Property.of("round", Long.class, false), Property.of("ceil", Long.class, false),
					Property.of("floor", Long.class, false)),
			Float.class, List.of(Property.of("round", Long.class, false), Property.of("ceil", Long.class, false),
					Property.of("floor", Long.class, false)));

	protected boolean isFromDslPackage(Class<?> clazz) {
		return clazz.getCanonicalName().startsWith("x.mvmn.permock.model");
	}

	protected boolean isSupportedPrimitiveType(Class<?> clazz) {
		return Number.class.isAssignableFrom(clazz) || String.class.isAssignableFrom(clazz)
				|| Boolean.class.isAssignableFrom(clazz);
	}

	public List<Property> entities() {
		return BeanUtil.listPropertiesFromGetters(HttpRequestModel.class);
	}

	public Property entityType(String entityName) {
		return BeanUtil.getPropertyType(HttpRequestModel.class, entityName);
	}

	public Property typeOfProperty(Property property, String name) {
		if (property.isCollection()) {
			return GET_COLLECTION_FUNCTIONS.apply(property).stream().filter(prop -> prop.getName().equals(name))
					.findAny().orElse(null);
		}
		if (property.isPrimitive()) {
			return PRIMITIVE_TYPES_PROPERTIES.getOrDefault(property.getType(), Collections.emptyList()).stream()
					.filter(prop -> prop.getName().equals(name)).findAny().orElse(null);
		}
		return BeanUtil.getPropertyType(property.getType(), name);
	}

	public List<Property> properties(Property property) {
		if (property.isCollection()) {
			return GET_COLLECTION_FUNCTIONS.apply(property);
		} else if (isFromDslPackage(property.getType())) {
			return BeanUtil.listPropertiesFromGetters(property.getType());
		} else if (isSupportedPrimitiveType(property.getType())) {
			return getPrimitiveTypeProps(property.getType());
		} else {
			return Collections.emptyList();
		}
	}

	private List<Property> getPrimitiveTypeProps(Class<?> type) {
		return PRIMITIVE_TYPES_PROPERTIES.getOrDefault(type, Collections.emptyList());
	}

	public boolean isDictionary(Property property) {
		return property != null && property.getType() != null && Dictionary.class.isAssignableFrom(property.getType());
	}

	public Property getDictionaryValueType(Property dictionary) {
		if (!isDictionary(dictionary)) {
			return null;
		}
		Class<?> type = Stream.of(dictionary.getType().getDeclaredMethods())
				.filter(method -> method.getName().equals("get") && method.getParameterCount() == 1).findAny()
				.map(Method::getReturnType).orElse(null);
		return type != null ? Property.of("value", type, BeanUtil.isCollection(type)) : null;
	}
}
