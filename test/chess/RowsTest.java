package chess;

import junit.framework.TestCase;

public class RowsTest extends TestCase {
	public static final String EMPTY_STRING = "********";
	public static final String WHITE_PAWN_STRING = "pppppppp";
	public static final String BLACK_PAWN_STRING = "PPPPPPPP";
	public static final String WHITE_KQRBN_STRING = "rnbqkbnr";
	public static final String BLACK_KQRBN_STRING = "RNBQKBNR";
	
	private Rows row;
	
	protected void setUp() throws Exception {
		row = new Rows();
		row.initEmpty();
	}
	
	public void testInitEmpty() throws Exception {
		assertEquals(EMPTY_STRING, row.getString());
	}
	
	public void testSetWhitePawn() throws Exception {
		row.setWhitePawn();
		assertEquals(WHITE_PAWN_STRING, row.getString());
	}
	
	public void testSetBlackPawn() throws Exception {
		row.setBlackPawn();
		assertEquals(BLACK_PAWN_STRING, row.getString());
	}
	
	public void testSetWhiteKQRBN() throws Exception {
		row.setWhiteKQRBN();
		assertEquals(WHITE_KQRBN_STRING, row.getString());
	}
	
	public void testSetBlackKQRBN() throws Exception {
		row.setBlackKQRBN();
		assertEquals(BLACK_KQRBN_STRING, row.getString());
	}
}
