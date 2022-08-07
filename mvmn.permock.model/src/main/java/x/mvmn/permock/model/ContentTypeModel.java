package x.mvmn.permock.model;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

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

	public Charset detectCharset() {
		Charset result = StandardCharsets.UTF_8;
		String charsetStr = getCharSet();
		if (charsetStr != null) {
			try {
				return Charset.forName(charsetStr.toUpperCase());
			} catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
			}
		}
		return result;
	}
}
