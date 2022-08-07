package x.mvmn.permock.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlNode {

	private Node domNode;

	public XmlNode(Node domNode) {
		this.domNode = domNode;
	}

	public static List<XmlNode> ofList(NodeList nodeList) {
		List<XmlNode> result = new ArrayList<>(nodeList != null ? nodeList.getLength() : 0);
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				result.add(new XmlNode(nodeList.item(i)));
			}
		}
		return result;
	}

	public Node node() {
		return domNode;
	}

	public String getText() {
		return domNode != null ? domNode.getTextContent() : null;
	}

	public Boolean isHasAttributes() {
		return domNode != null && domNode.hasAttributes();
	}

	public Boolean isHasChildNodes() {
		return domNode != null && domNode.hasChildNodes();
	}

	public StringDictionary getAttributes() {
		if (!isHasAttributes()) {
			return null;
		}
		return new StringDictionary() {
			@Override
			public String get(String key) {
				Node attr = domNode.getAttributes().getNamedItem(key);
				return attr != null ? attr.getTextContent() : null;
			}
		};
	}

	public XmlNode getFirstChild() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return null;
		}
		Node node = domNode.getFirstChild();
		return node != null ? new XmlNode(node) : null;
	}

	public XmlNode getLastChild() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return null;
		}
		Node node = domNode.getLastChild();
		return node != null ? new XmlNode(node) : null;
	}

	public List<XmlNode> getChildNodes() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return Collections.emptyList();
		}
		return XmlNode.ofList(domNode.getChildNodes());
	}

	public String getValue() {
		return domNode != null ? domNode.getNodeValue() : null;
	}

	public String getName() {
		return domNode != null ? domNode.getNodeName() : null;
	}

	public String getLocalName() {
		return domNode != null ? domNode.getLocalName() : null;
	}

	public String getNamespaceUri() {
		return domNode != null ? domNode.getNamespaceURI() : null;
	}

	public String getNamespacePrefix() {
		return domNode != null ? domNode.getPrefix() : null;
	}

	public XmlNode getNextSibling() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return null;
		}
		Node node = domNode.getNextSibling();
		return node != null ? new XmlNode(node) : null;
	}

	public XmlNode getPreviousSibling() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return null;
		}
		Node node = domNode.getPreviousSibling();
		return node != null ? new XmlNode(node) : null;
	}

	public XmlNode getParentNode() {
		if (domNode == null || !domNode.hasChildNodes()) {
			return null;
		}
		Node node = domNode.getParentNode();
		return node != null ? new XmlNode(node) : null;
	}

	public String getNodeType() {
		if (domNode == null) {
			return null;
		}
		int nodeType = domNode.getNodeType();
		switch (nodeType) {
		case Node.ATTRIBUTE_NODE:
			return "attribute";
		case Node.CDATA_SECTION_NODE:
			return "cdata";
		case Node.COMMENT_NODE:
			return "comment";
		case Node.DOCUMENT_FRAGMENT_NODE:
			return "fragment";
		case Node.DOCUMENT_NODE:
			return "document";
		case Node.DOCUMENT_TYPE_NODE:
			return "doctype";
		case Node.ELEMENT_NODE:
			return "element";
		case Node.ENTITY_NODE:
			return "entity";
		case Node.ENTITY_REFERENCE_NODE:
			return "entity reference";
		case Node.NOTATION_NODE:
			return "notation";
		case Node.PROCESSING_INSTRUCTION_NODE:
			return "processing instruction";
		case Node.TEXT_NODE:
			return "text";
		}
		return null;
	}
}
