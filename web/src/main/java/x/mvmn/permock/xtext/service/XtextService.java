package x.mvmn.permock.xtext.service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.springframework.stereotype.Service;

import com.google.inject.Provider;

import lombok.RequiredArgsConstructor;
import x.mvmn.permock.exception.ParseException;

@Service
@RequiredArgsConstructor
public class XtextService {

	private final XtextResourceFactory resourceFactory;
	private final Provider<XtextResourceSet> xtextResourceSetProvider;
	private final IResourceValidator validator;

	public EObject parse(String text) {
		XtextResourceSet resourceSet = xtextResourceSetProvider.get();

		Resource resource = resourceFactory.createResource(URI.createURI(UUID.randomUUID() + ".xttone"));
		resourceSet.getResources().add(resource);
		try {
			resource.load(new StringInputStream(text), null);
		} catch (IOException ioException) {
			// Should never happen for StringInputStream
			throw new RuntimeException(ioException);
		}
		XtextResource xtextResource = ((XtextResource) resource);
		if (xtextResource.getParseResult().hasSyntaxErrors()) {
			throw new ParseException(xtextResource.getParseResult().getSyntaxErrors());
		}
		List<Issue> validationIssues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (validationIssues != null && !validationIssues.isEmpty()) {
			throw new ParseException(validationIssues);
		}
		EObject result = resource.getContents().isEmpty() ? null : resource.getContents().get(0);
		resourceSet.getResources().remove(resource);
		return result;
	}
}
