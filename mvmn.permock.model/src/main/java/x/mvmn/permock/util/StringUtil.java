package x.mvmn.permock.util;

public class StringUtil {

	public static boolean blankOrNull(String str) {
		return str == null || str.trim().isEmpty();
	}

	public static String blankForNull(String str) {
		return str == null ? "" : str;
	}
}
