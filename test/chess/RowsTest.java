package chess;

import junit.framework.TestCase;

public class RowsTest extends TestCase {
	private Rows row;
	
	protected void setUp() throws Exception {
		row = new Rows();
		row.initEmpty();
	}
	
	public void testInitEmpty() throws Exception {
		assertEquals("********", row.getString());
	}
	
	public void testInitWhite() throws Exception {
		row.setWhite();
		assertEquals("pppppppp", row.getString());
	}
	
	public void testInitBlack() throws Exception {
		row.setBlack();
		assertEquals("PPPPPPPP", row.getString());
	}
}
