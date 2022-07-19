package x.mvmn.permock.dsl.model;

import java.util.List;

import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.BeanUtil.Property;

public class ModelHelper {

	public List<String> entities() {
		return BeanUtil.listPropertiesFromGetters(HttpRequestModel.class);
	}

	public Property entityType(String entityName) {
		return BeanUtil.getPropertyType(HttpRequestModel.class, entityName);
	}

	public Property typeOfProperty(Class<?> parentType, String name) {
		return BeanUtil.getPropertyType(parentType, name);
	}

	public List<String> properties(Class<?> type) {
		return BeanUtil.listPropertiesFromGetters(type);
	}
}
