package x.mvmn.permock.model;

public class ContentTypeModel {
	private final String rawContentType;
	private final String contentType;
	private final String charSet;

	public ContentTypeModel(String rawContentType) {
		this.rawContentType = rawContentType;
		if (rawContentType != null) {
			int indexOfSeparator = rawContentType.indexOf(";");
			if (indexOfSeparator >= 0) {
				contentType = rawContentType.substring(0, indexOfSeparator);
				charSet = rawContentType.substring(indexOfSeparator + 1);
			} else {
				charSet = null;
				contentType = rawContentType;
			}
		} else {
			charSet = null;
			contentType = null;
		}
	}

	public String getCharSet() {

		return charSet;
	}

	public String getContentType() {
		return contentType;
	}

	public String getRawContentType() {
		return rawContentType;
	}
}
