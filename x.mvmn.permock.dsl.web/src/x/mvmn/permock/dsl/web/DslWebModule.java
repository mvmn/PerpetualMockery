/*
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.web;

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import x.mvmn.permock.dsl.ide.highlight.DslSemanticHighlightingCalculator;

/**
 * Use this class to register additional components to be used within the web
 * application.
 */
public class DslWebModule extends AbstractDslWebModule {
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return DslSemanticHighlightingCalculator.class;
	}
}
