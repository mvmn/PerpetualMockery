package x.mvmn.permock.dsl.tests;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.ide.server.contentassist.ContentAssistService;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;

import x.mvmn.permock.dsl.ide.DslIdeSetup;
import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.dsl.model.ModelHelper.FunctionDescriptor;
import x.mvmn.permock.model.HttpHeader;
import x.mvmn.permock.util.Property;

public class DslContentProposalTest {
	private static Injector injector;
	private static ContentAssistService contentAssistService;
	private static XtextResourceFactory resourceFactory;
	private static Provider<XtextResourceSet> xtextResourceSetProvider;
	private static ModelHelper modelHelper;

	@BeforeAll
	public static void init() {
		injector = new DslIdeSetup().createInjectorAndDoEMFRegistration();
		modelHelper = injector.getInstance(ModelHelper.class);
		contentAssistService = injector.getInstance(ContentAssistService.class);
		resourceFactory = injector.getInstance(XtextResourceFactory.class);
		xtextResourceSetProvider = injector.getInstance(new Key<Provider<XtextResourceSet>>() {
		});
	}

	@Test
	public void testHeadersListCompletions() {
		assertMatches(getCompletions("if httpHeaders ", -1), Stream.concat(
				Stream.concat(Stream.of("httpHeadersByName # HttpHeaderDictionary", "httpHeaders # List of HttpHeader"),
						modelHelper.getFunctionDescriptors(Property.of("", HttpHeader.class, true)).stream()
								.map(v -> functionDescriptorToCompletion(v) + " # "
										+ functionDescriptorToDescription(v))
								.map(v -> "." + v).sorted()),
				Stream.of(". # null", "[ # null", "{ # null")).toArray(l -> new String[l]));
	}

	@Test
	public void testListElementCompletions() {
		assertMatches(getCompletions("if httpHeaders[0]. ", -1), ".name # String", ".value # String",
				".values # List of String", ". # null");
	}

	@Test
	public void testSubListElementCompletions() {
		assertMatches(getCompletions("if httpHeaders[0].values. ", -1),
				Stream.concat(
						modelHelper.getFunctionDescriptors(Property.of("", String.class, true)).stream()
								.map(v -> functionDescriptorToCompletion(v) + " # "
										+ functionDescriptorToDescription(v))
								.map(v -> "." + v).sorted(),
						Stream.of(". # null")).toArray(l -> new String[l]));
	}

	public void assertMatches(CompletionList completions, String... expectedItems) {
		assertMatches(completions.getItems().stream().map(i -> i.getLabel() + " # " + i.getDetail())
				.collect(Collectors.toList()), expectedItems);
	}

	public void assertMatches(List<String> actualItems, String... expectedItems) {
		Assertions.assertEquals(expectedItems == null ? 0 : expectedItems.length, actualItems.size(),
				"Expected [" + Stream.of(expectedItems).collect(Collectors.joining("; ")) + "] but got ["
						+ actualItems.stream().collect(Collectors.joining("; ")) + "]");
		for (int i = 0; i < expectedItems.length; i++) {
			Assertions.assertEquals(expectedItems[i], actualItems.get(i));
		}
	}

	public CompletionList getCompletions(String text, int position) {
		int positionVal = position;
		if (positionVal < 0) {
			positionVal = text.length() + positionVal;
		}
		XtextResource result = parse(text);
		Assertions.assertNotNull(result);
		return contentAssistService.createCompletionList(new Document(1, text), result, new CompletionParams(
				new TextDocumentIdentifier(result.getURI().toString()), new Position(0, positionVal)), null);
	}

	public XtextResource parse(String text) {
		XtextResourceSet resourceSet = xtextResourceSetProvider.get();

		Resource resource = resourceFactory.createResource(URI.createURI(UUID.randomUUID() + ".mydsl"));
		resourceSet.getResources().add(resource);
		try {
			resource.load(new StringInputStream(text), null);
		} catch (IOException ioException) {
			// Should never happen for StringInputStream
			throw new RuntimeException(ioException);
		}
		return (XtextResource) resource;
	}

	// TODO: Reuse between tests and DslContentProposalProvider
	private String functionDescriptorToCompletion(FunctionDescriptor functionDescription) {
		return functionDescription.getName() + "(" + functionDescription.getArgs().stream().skip(1)
				.map(arg -> arg.getName()).collect(Collectors.joining(", ")) + ")";
	}

	private String functionDescriptorToDescription(FunctionDescriptor functionDescription) {
		String params = functionDescription.getArgs().stream().skip(1).map(arg -> toDescription(arg))
				.collect(Collectors.joining(", "));
		return (params.isEmpty() ? "" : params + " -> ") + toDescription(functionDescription.getReturnType());
	}

	private String toDescription(Property prop) {
		return (prop.isCollection() ? "List of " : "") + prop.getType().getSimpleName();
	}
}
