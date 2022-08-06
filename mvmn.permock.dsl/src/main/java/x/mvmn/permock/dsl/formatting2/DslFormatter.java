/*
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.formatting2;

import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;

import x.mvmn.permock.dsl.dsl.AndCondition;
import x.mvmn.permock.dsl.dsl.Condition;
import x.mvmn.permock.dsl.dsl.DslPackage;
import x.mvmn.permock.dsl.dsl.Expression;
import x.mvmn.permock.dsl.dsl.Header;
import x.mvmn.permock.dsl.dsl.Headers;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.Negation;
import x.mvmn.permock.dsl.dsl.OrCondition;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.ResponseConf;
import x.mvmn.permock.dsl.dsl.Rule;

public class DslFormatter extends AbstractJavaFormatter {

	protected void format(PropertyRef propertyRef, IFormattableDocument doc) {
		doc.surround(textRegionExtensions.regionFor(propertyRef).keyword("."), i -> i.noSpace());
		doc.prepend(textRegionExtensions.regionFor(propertyRef).feature(DslPackage.Literals.PROPERTY_ACCESS__NAME),
				i -> i.noSpace());
		doc.prepend(textRegionExtensions.regionFor(propertyRef).feature(DslPackage.Literals.COLLECTION_ACCESS__INDEX),
				i -> i.noSpace());
		doc.prepend(textRegionExtensions.regionFor(propertyRef).feature(DslPackage.Literals.COLLECTION_ACCESS__KEY),
				i -> i.noSpace());
		doc.surround(textRegionExtensions.regionFor(propertyRef).keyword("["), i -> i.noSpace());
		doc.prepend(textRegionExtensions.regionFor(propertyRef).keyword("]"), i -> i.noSpace());
		if (propertyRef.getSubPropery() != null) {
			doc.format(propertyRef.getSubPropery());
		}
		if (propertyRef.getListFunc() != null) {
			doc.format(propertyRef.getListFunc());
		}
	}

	protected void format(Rule rule, IFormattableDocument doc) {
		doc.append(textRegionExtensions.regionFor(rule).keyword("if"), i -> i.newLine());
		doc.surround(rule.getConditions(), i -> i.indent());
		doc.format(rule.getConditions());

		doc.prepend(textRegionExtensions.regionFor(rule).keyword("proxy"), i -> i.newLine());
		doc.prepend(textRegionExtensions.regionFor(rule).keyword("respond"), i -> i.newLine());
		if (rule.getProxy() != null) {
			doc.surround(rule.getProxy(), i -> i.indent());
		}
		if (rule.getResponse() != null) {
			doc.surround(rule.getResponse(), i -> i.indent());
			format(rule.getResponse(), doc);
		}
	}

	protected void format(Condition condition, IFormattableDocument doc) {
		doc.interior(doc.append(textRegionExtensions.regionFor(condition).keyword("("), i -> i.newLine()),
				doc.prepend(textRegionExtensions.regionFor(condition).keyword(")"), i -> i.newLine()), i -> i.indent());
		doc.format(condition.getCondition());
		doc.format(condition.getExpression());
		if (condition instanceof AndCondition) {
			AndCondition andCondition = (AndCondition) condition;
//			doc.surround(textRegionExtensions.regionFor(andCondition).keyword("and"), i -> i.oneSpace());
			doc.interior(doc.append(textRegionExtensions.regionFor(condition).keyword("and"), i -> i.newLine()),
					doc.prepend(textRegionExtensions.regionFor(condition).keyword("and"), i -> i.newLine()),
					i -> i.indent());
			doc.format(andCondition.getLeft());
			doc.format(andCondition.getRight());
		}
		if (condition instanceof OrCondition) {
			OrCondition orCondition = (OrCondition) condition;
//			doc.surround(textRegionExtensions.regionFor(orCondition).keyword("or"), i -> i.oneSpace());
			doc.interior(doc.append(textRegionExtensions.regionFor(condition).keyword("or"), i -> i.newLine()),
					doc.prepend(textRegionExtensions.regionFor(condition).keyword("or"), i -> i.newLine()),
					i -> i.indent());

			doc.format(orCondition.getLeft());
			doc.format(orCondition.getRight());
		}
		if (condition instanceof Negation) {
			Negation negation = (Negation) condition;
			doc.surround(textRegionExtensions.regionFor(negation).keyword("not"), i -> i.oneSpace());
			doc.format(negation.getCondition());
			doc.format(negation.getNegated());
		}
	}

	protected void format(ResponseConf responseConf, IFormattableDocument doc) {
		doc.prepend(textRegionExtensions.regionFor(responseConf).keyword("status"), i -> {
			i.newLine();
			i.indent();
		});
		doc.prepend(textRegionExtensions.regionFor(responseConf).keyword("content"), i -> {
			i.newLine();
			i.indent();
		});
		doc.prepend(textRegionExtensions.regionFor(responseConf).keyword("headers"), i -> {
			i.newLine();
			i.indent();
		});
		if (responseConf.getHeaders() != null && responseConf.getHeaders().getHeaders() != null
				&& responseConf.getHeaders().getHeaders().size() > 1) {
			responseConf.getHeaders().getHeaders().forEach(header -> doc.prepend(header, i -> i.newLine()));
		}
		if (responseConf.getHeaders() != null) {
			doc.format(responseConf.getHeaders());
		}
		if (responseConf.getContent() != null) {
			doc.format(responseConf.getContent());
		}
	}

	protected void format(Headers headers, IFormattableDocument doc) {
		doc.surround(headers, i -> i.indent());
		if (headers.getHeaders() != null) {
			headers.getHeaders().forEach(header -> doc.format(header));
		}
	}

	protected void format(Header header, IFormattableDocument doc) {
		doc.prepend(header, i -> i.indent());
		doc.prepend(textRegionExtensions.regionFor(header).keyword(":"), i -> i.noSpace());
		doc.append(textRegionExtensions.regionFor(header).keyword(":"), i -> i.oneSpace());
	}

	protected void format(ListFunction listFunc, IFormattableDocument doc) {
		doc.format(listFunc.getAlias());
		doc.interior(
				doc.prepend(textRegionExtensions.regionFor(listFunc).feature(DslPackage.Literals.LIST_FUNCTION__OP),
						i -> i.newLine()),
				doc.append(textRegionExtensions.regionFor(listFunc).keyword(":"), i -> i.newLine()), i -> i.indent());
		doc.surround(textRegionExtensions.regionFor(listFunc).feature(DslPackage.Literals.LIST_FUNCTION__OP),
				i -> i.indent());
		doc.prepend(textRegionExtensions.regionFor(listFunc).keyword(":"), i -> i.noSpace());
		if (listFunc.getCondition() != null) {
			doc.format(listFunc.getCondition());
		}
		if (listFunc.getOperand() != null) {
			doc.format(listFunc.getOperand());
		}
		doc.interior(doc.append(textRegionExtensions.regionFor(listFunc).keyword("{"), i -> i.oneSpace()),
				doc.prepend(textRegionExtensions.regionFor(listFunc).keyword("}"), i -> i.newLine()), i -> i.indent());
	}

	protected void format(Expression expression, IFormattableDocument doc) {
		doc.surround(textRegionExtensions.regionFor(expression).feature(DslPackage.Literals.EXPRESSION__OP),
				i -> i.oneSpace());
		if (expression.getLeft() != null) {
			doc.format(expression.getLeft());
		}
		if (expression.getRight() != null) {
			doc.format(expression.getRight());
		}
	}
}
