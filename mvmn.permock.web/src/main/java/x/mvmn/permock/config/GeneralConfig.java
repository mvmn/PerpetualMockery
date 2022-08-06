package x.mvmn.permock.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.dsl.model.XtextModelHelper;
import x.mvmn.permock.functions.PerpetualMockeryFunctions;

@Configuration
public class GeneralConfig {

	@Autowired
	private ObjectMapper objectMapper;

	@Bean
	public ModelHelper modelHelper() {
		return new ModelHelper();
	}

	@Bean
	public XtextModelHelper xtextModelHelper(ModelHelper modelHelper) {
		return new XtextModelHelper().setModelHelper(modelHelper);
	}

	@Bean
	public PerpetualMockeryFunctions functions() {
		return new PerpetualMockeryFunctions();
	}

	@PostConstruct
	public void disableNullFieldsInJackson() {
		objectMapper.setSerializationInclusion(Include.NON_NULL);
	}
}
