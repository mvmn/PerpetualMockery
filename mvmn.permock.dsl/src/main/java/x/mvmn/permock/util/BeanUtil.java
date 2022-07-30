package x.mvmn.permock.util;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import x.mvmn.permock.functions.PerpetualMockeryFunctions.FunctionParam;

public class BeanUtil {

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

	public static Property fromMethod(Method method) {
		return fromMethod(method, null);
	}

	public static Property fromMethod(Method method, Property calledOn) {
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
		if (calledOn != null && method.getGenericReturnType() != null
				&& method.getGenericReturnType() instanceof TypeVariable<?>) {
			type = calledOn.getType();
		}
		return new Property(
				method.getName().startsWith("get") ? getterNameToPropertyName(method.getName()) : method.getName(),
				type, isCollection);
	}

	public static Property fromParameter(Parameter param) {
		Class<?> type = param.getType();
		boolean isCollection = isCollection(type);
		if (isCollection) {
			type = null;
			Type generic = param.getParameterizedType();
			if (generic instanceof ParameterizedType) {
				Type[] typeArgs = ((ParameterizedType) generic).getActualTypeArguments();
				if (typeArgs != null && typeArgs.length > 0) {
					if (typeArgs[0] instanceof Class<?>) {
						type = (Class<?>) typeArgs[0];
					} else if (typeArgs[0] instanceof WildcardType) {
						type = null;
					}
				}
			}
		}
		String name = isCollection ? "List"
				: (type.getSimpleName().substring(0, 1).toLowerCase() + type.getSimpleName().substring(1));
		FunctionParam paramAnnotation = param.getAnnotation(FunctionParam.class);
		if (paramAnnotation != null) {
			name = paramAnnotation.value();
		}
		return new Property(name, type, isCollection);
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
