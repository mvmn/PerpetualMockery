package x.mvmn.permock.dsl.tests;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

import lombok.val;
import x.mvmn.permock.xtext.guice.DslWebSetup;

public class DslContentProposalTest {
	private static Injector injector;
	private static ContentAssistService contentAssistService;
	private static XtextResourceFactory resourceFactory;
	private static Provider<XtextResourceSet> xtextResourceSetProvider;

	@BeforeAll
	public static void init() {
		injector = new DslWebSetup().createInjectorAndDoEMFRegistration();
		contentAssistService = injector.getInstance(ContentAssistService.class);
		resourceFactory = injector.getInstance(XtextResourceFactory.class);
		xtextResourceSetProvider = injector.getInstance(new Key<Provider<XtextResourceSet>>() {
		});
	}

	@Test
	public void testHeadersListCompletions() {
		CompletionList completions = getCompletions("if httpHeaders ", -1);

		assertMatches(completions, "httpHeadersByName # HeaderDictionary", "httpHeaders # List of HttpHeader",
				". # null", "[ # null", "{ # null");
	}

	@Test
	public void testListElementCompletions() {
		CompletionList completions = getCompletions("if httpHeaders[0]. ", -1);

		assertMatches(completions, "name # String", "value # String", "values # List of String", ". # null");
	}

	@Test
	public void testSubListElementCompletions() {
		CompletionList completions = getCompletions("if httpHeaders[0].values. ", -1);

		assertMatches(completions, "first # String", "isEmpty # Boolean", "isNotEmpty # Boolean", "last # String",
				"size # Integer", ". # null");
	}

	public void assertMatches(CompletionList completions, String... expectedItems) {
		assertMatches(completions.getItems().stream().map(i -> i.getLabel() + " # " + i.getDetail())
				.collect(Collectors.toList()), expectedItems);
	}

	public void assertMatches(List<String> actualItems, String... expectedItems) {
		Assertions.assertEquals(expectedItems == null ? 0 : expectedItems.length, actualItems.size());
		for (int i = 0; i < expectedItems.length; i++) {
			Assertions.assertEquals(expectedItems[i], actualItems.get(i));
		}
	}

	public CompletionList getCompletions(String text, int position) {
		int positionVal = position;
		if (positionVal < 0) {
			positionVal = text.length() + positionVal;
		}
		val result = parse(text);
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
}
