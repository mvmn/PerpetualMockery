package x.mvmn.permock.model.rules;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MockResponseConfig {

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class MockResponseConfigHeader {
		private String name;
		private String value;
	}

	private boolean proxy;
	private String proxyUrl;
	private Integer responseStatus;
	private String resposeBody;
	private List<MockResponseConfigHeader> responseHeaders;

	@Override
	public String toString() {
		if (proxy) {
			return "proxy '" + proxyUrl + "'"; // TODO: Escape string
		} else {
			return "respond with \n\t\t" + statusToString() + "\n\t\t" + bodyToString() + "\n\t" + headersToString();
		}
	}

	private String headersToString() {
		if (responseHeaders == null || responseHeaders.isEmpty()) {
			return "";
		}
		return "\theaders\n" + responseHeaders.stream().map(h -> "\t\t\t'" + h.getName() + "': '" + h.getValue() + "'")
				.collect(Collectors.joining(",\n")); // TODO: Escape strings
	}

	private String bodyToString() {
		return resposeBody != null ? "content '" + resposeBody + "'" : ""; // TODO: Escape string
	}

	private String statusToString() {
		return responseStatus != null ? "status " + responseStatus.intValue() : "";
	}
}