package chess;

import pieces.Piece;
import junit.framework.TestCase;
import static util.StringUtil.appendNewLine;

public class BoardTest extends TestCase {
	private Board board;
	
	protected void setUp() throws Exception {
		Piece.resetCount();
		board = new Board();
	}
	
	public void testCreate() throws Exception {	
		assertEquals(RowsTest.WHITE_PAWN_STRING, board.getArray(1));
		assertEquals(RowsTest.BLACK_PAWN_STRING, board.getArray(6));
		String emptyString = appendNewLine(RowsTest.EMPTY_STRING);
		String result = board.printBoard();
		System.out.println(result);
		assertEquals(
				appendNewLine(RowsTest.BLACK_KQRBN_STRING) +
				appendNewLine(RowsTest.BLACK_PAWN_STRING) +
				emptyString + emptyString + emptyString + emptyString +
				appendNewLine(RowsTest.WHITE_PAWN_STRING) +
				appendNewLine(RowsTest.WHITE_KQRBN_STRING), result);
	}
	
	public void testCount() throws Exception {
		assertEquals(16, Piece.getWhiteCount());
		assertEquals(16, Piece.getBlackCount());
	}
}
