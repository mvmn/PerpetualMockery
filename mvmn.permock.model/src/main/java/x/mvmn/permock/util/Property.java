package x.mvmn.permock.util;

public class Property {
	private final String name;
	private final Class<?> type;
	private final boolean isCollection;

	public Property(String name, Class<?> type) {
		this(name, type, false);
	}

	public Property(String name, Class<?> type, boolean isCollection) {
		this.name = name;
		this.type = type;
		this.isCollection = isCollection;
	}

	public String getName() {
		return name;
	}

	public Class<?> getType() {
		return normalizeType(type);
	}

	public Class<?> getRawType() {
		return type;
	}

	private Class<?> normalizeType(Class<?> type) {
		if (type.isAssignableFrom(Integer.class)) {
			return Long.class;
		}
		if (type.isAssignableFrom(Float.class)) {
			return Double.class;
		}
		return type;
	}

	public String getTypeName() {
		return (this.isCollection ? "List of " : "") + this.type.getSimpleName();
	}

	public boolean isCollection() {
		return isCollection;
	}

	public boolean isNumber() {
		return !isCollection && Number.class.isAssignableFrom(type);
	}

	public boolean isInteger() {
		return !isCollection && (Long.class.isAssignableFrom(type) || Integer.class.isAssignableFrom(type));
	}

	public boolean isBoolean() {
		return !isCollection && Boolean.class.isAssignableFrom(type);
	}

	public boolean isString() {
		return !isCollection && String.class.isAssignableFrom(type);
	}

	public boolean isPrimitive() {
		return !isCollection && (isNumber() || isBoolean() || isString());
	}

	public static Property of(String name, Class<?> type, boolean isCollection) {
		return new Property(name, type, isCollection);
	}

	@Override
	public String toString() {
		return "Property [name=" + name + ", type=" + type + ", isCollection=" + isCollection + "]";
	}
}