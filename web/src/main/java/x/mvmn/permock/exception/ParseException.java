package x.mvmn.permock.exception;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.validation.Issue;

public class ParseException extends RuntimeException {
	private static final long serialVersionUID = 6349796627911635175L;
	private final Iterable<INode> syntaxErrors;
	private final List<Issue> validationIssues;

	public ParseException(Iterable<INode> syntaxErrors) {
		this.syntaxErrors = syntaxErrors;
		this.validationIssues = Collections.emptyList();
	}

	public ParseException(List<Issue> validationIssues) {
		this.validationIssues = validationIssues;
		this.syntaxErrors = Collections.emptyList();
	}

	public Iterable<INode> getSyntaxErrors() {
		return syntaxErrors;
	}

	public List<Issue> getValidationIssues() {
		return validationIssues;
	}

	@Override
	public String getMessage() {
		return Stream
				.concat(StreamSupport.stream(syntaxErrors.spliterator(), false).map(INode::getSyntaxErrorMessage)
						.map(SyntaxErrorMessage::getMessage), validationIssues.stream().map(Issue::getMessage))
				.collect(Collectors.joining("; "));
	}
}
