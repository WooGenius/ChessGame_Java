package util;

public class StringUtil {
	public static final String NEWLINE =
			System.getProperty("line.separator");

	public static String appendNewLine(String string) {
		return string + NEWLINE;
	}
}
