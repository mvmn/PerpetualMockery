package x.mvmn.permock.dsl.ide.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeCrossrefProposalProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.model.XtextModelHelper;
import x.mvmn.permock.util.BeanUtil.Property;

public class DslCrossrefProposalProvider extends IdeCrossrefProposalProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private IdeContentProposalCreator proposalCreator;

	@Inject
	private XtextModelHelper xtextModelHelper;

	@Override
	protected ContentAssistEntry createProposal(IEObjectDescription candidate, CrossReference crossRef,
			ContentAssistContext context) {
		EObject currentModel = context.getCurrentModel();
		String description = null;
		if (currentModel instanceof ListElementReference) {
			ListElementReference listElemRef = (ListElementReference) currentModel;
			Property type = xtextModelHelper.resolveType(listElemRef);
			if (type != null) {
				description = type.getTypeName();
			}
		}

		String finalDescription = description;
		return proposalCreator.createProposal(qualifiedNameConverter.toString(candidate.getName()), context, (e) -> {
			e.setSource(candidate);
			e.setDescription(
					finalDescription == null ? (candidate.getEClass() != null ? candidate.getEClass().getName() : null)
							: finalDescription);
			e.setKind(ContentAssistEntry.KIND_REFERENCE);
		});
	}
}
