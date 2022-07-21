package x.mvmn.permock.util;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeanUtil {

	public static class Property {
		private final String name;
		private final Class<?> type;
		private final boolean isCollection;

		public Property(String name, Class<?> type, boolean isCollection) {
			this.name = name;
			this.type = type;
			this.isCollection = isCollection;
		}

		public String getName() {
			return name;
		}

		public Class<?> getType() {
			return type;
		}

		public boolean isCollection() {
			return isCollection;
		}

		public static Property of(String name, Class<?> type, boolean isCollection) {
			return new Property(name, type, isCollection);
		}
	}

	public static List<Property> listPropertiesFromGetters(Class<?> klass) {
		return Stream.of(klass.getDeclaredMethods())
				.filter(method -> method.getName().length() > 3 && method.getName().startsWith("get"))
				.map(BeanUtil::fromMethod).collect(Collectors.toList());
	}

	public static Property getPropertyType(Class<?> klass, String property) {
		String getterName = propertyNameToGetterName(property);
		try {
			return fromMethod(klass.getDeclaredMethod(getterName));
		} catch (NoSuchMethodException e) {
			return null;
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		}
	}

	protected static Property fromMethod(Method method) {
		Class<?> type = method.getReturnType();
		boolean isCollection = isCollection(type);
		if (isCollection) {
			type = null;
			Type generic = method.getGenericReturnType();
			if (generic instanceof ParameterizedType) {
				Type[] typeArgs = ((ParameterizedType) generic).getActualTypeArguments();
				if (typeArgs != null && typeArgs.length > 0 && typeArgs[0] instanceof Class<?>) {
					type = (Class<?>) typeArgs[0];
				}
			}
		}
		return new Property(getterNameToPropertyName(method.getName()), type, isCollection);
	}

	public static boolean isCollection(Class<?> klass) {
		return Collection.class.isAssignableFrom(klass);
	}

	public static String getterNameToPropertyName(String getterName) {
		if (getterName != null && getterName.length() > 3 && getterName.startsWith("get")) {
			String result = getterName.substring(3);
			result = result.substring(0, 1).toLowerCase() + result.substring(1);
			return result;
		}
		throw new IllegalArgumentException("Bad getter name " + getterName);
	}

	public static String propertyNameToGetterName(String propertyName) {
		if (propertyName != null && propertyName.trim().length() > 0) {
			return "get" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		}
		throw new IllegalArgumentException("Bad property name " + propertyName);
	}
}
