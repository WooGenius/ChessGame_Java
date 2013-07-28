package util;
import junit.framework.TestCase;
import static util.StringUtil.NEWLINE;

public class StringUtilTest extends TestCase {
	public void testCreate() throws Exception {
		assertEquals("\n", NEWLINE);
	}
}
