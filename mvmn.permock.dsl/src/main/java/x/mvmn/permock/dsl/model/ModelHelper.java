package x.mvmn.permock.dsl.model;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import x.mvmn.permock.functions.PerpetualMockeryFunctions;
import x.mvmn.permock.model.Dictionary;
import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.Property;

public class ModelHelper {

	private static final String MODEL_PACKAGE_NAME = "x.mvmn.permock.model";

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public static class FunctionDescriptor {
		private String name;
		private List<Property> args;
		private Property returnType;
	}

	protected boolean isFromDslPackage(Class<?> clazz) {
		return clazz.getCanonicalName().startsWith(MODEL_PACKAGE_NAME);
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
		return BeanUtil.getPropertyType(property.getType(), name);
	}

	public List<Property> properties(Property property) {
		if (isFromDslPackage(property.getType())) {
			return BeanUtil.listPropertiesFromGetters(property.getType());
		} else {
			return Collections.emptyList();
		}
	}

	public List<FunctionDescriptor> getFunctionDescriptors(Property property) {
		if (property == null) {
			return Collections.emptyList();
		}
		return Stream.of(PerpetualMockeryFunctions.class.getDeclaredMethods())
				.filter(method -> Modifier.isPublic(method.getModifiers()))
				.filter(method -> method.getParameterCount() > 0)
				.filter(method -> property.isCollection()
						? method.getParameters()[0].getType().isAssignableFrom(List.class)
						: method.getParameters()[0].getType().isAssignableFrom(property.getType()))
				.map(method -> {
					return FunctionDescriptor.builder().name(method.getName())
							.args(Stream.of(method.getParameters()).map(BeanUtil::fromParameter)
									.collect(Collectors.toList()))
							.returnType(BeanUtil.fromMethod(method, property)).build();
				}).collect(Collectors.toList());
	}

	public Optional<Method> getFunction(String name, int argsCount) {
		return Stream.of(PerpetualMockeryFunctions.class.getDeclaredMethods()) //
				.filter(method -> Modifier.isPublic(method.getModifiers())) //
				.filter(func -> func.getName().equals(name)) //
				.filter(method -> method.getParameterCount() == argsCount + 1).findFirst();
	}

	public boolean isDictionary(Property property) {
		return property != null && property.getType() != null && Dictionary.class.isAssignableFrom(property.getType());
	}

	public Property getDictionaryValueType(Property dictionary) {
		if (!isDictionary(dictionary)) {
			return null;
		}
		Class<?> type = Stream.of(dictionary.getType().getDeclaredMethods())
				.filter(method -> method.getName().equals("get") && method.getParameterCount() == 1
						&& method.getParameterTypes()[0].equals(String.class))
				.findAny().map(Method::getReturnType).orElse(null);
		return type != null ? Property.of("value", type, BeanUtil.isCollection(type)) : null;
	}
}
