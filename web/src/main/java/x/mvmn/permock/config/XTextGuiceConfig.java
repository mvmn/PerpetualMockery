package x.mvmn.permock.config;

import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;

import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.xtext.guice.DslWebSetup;

@Configuration
public class XTextGuiceConfig {

	private final Injector xtextInjector = new DslWebSetup().createInjectorAndDoEMFRegistration();

	@Bean
	public XtextServlet xtextServlet() {
		return xtextInjector.getInstance(XtextServlet.class);
	}

	@Bean
	public Provider<XtextResourceSet> xtextResourceSetProvider() {
		return xtextInjector.getInstance(new Key<Provider<XtextResourceSet>>() {
		});
	}

	@Bean
	public XtextResourceFactory xtextResourceFactory() {
		return xtextInjector.getInstance(XtextResourceFactory.class);
	}

	@Bean
	public IResourceValidator resourceValidator() {
		return xtextInjector.getInstance(IResourceValidator.class);
	}

	@Bean
	public ModelHelper modelHelper() {
		return new ModelHelper();
	}
}
