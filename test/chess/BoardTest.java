package chess;

import junit.framework.TestCase;
import static util.StringUtil.NEWLINE;

public class BoardTest extends TestCase {
	private Board board;
	
	protected void setUp() throws Exception {
		board = new Board();
	}
	
	public void testCreate() throws Exception {	
		assertEquals(RowsTest.WHITE_PAWN_STRING, board.getArray(1));
		assertEquals(RowsTest.BLACK_PAWN_STRING, board.getArray(6));
		String result = board.printBoard();
		System.out.println(result);
		String expectedString = RowsTest.EMPTY_STRING + NEWLINE + RowsTest.BLACK_PAWN_STRING + NEWLINE
								+ RowsTest.EMPTY_STRING + NEWLINE + RowsTest.EMPTY_STRING + NEWLINE
								+ RowsTest.EMPTY_STRING + NEWLINE + RowsTest.EMPTY_STRING + NEWLINE
								+ RowsTest.WHITE_PAWN_STRING + NEWLINE + RowsTest.EMPTY_STRING + NEWLINE;
		assertEquals(expectedString, result);
	}
}
