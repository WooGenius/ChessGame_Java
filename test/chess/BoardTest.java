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
		String emptyString = appendNewLine(RowsTest.EMPTY_STRING);
		String emptyBoard = board.printBoard();
		System.out.println(emptyBoard);
		assertEquals(
				emptyString + emptyString + emptyString + emptyString +
				emptyString + emptyString + emptyString + emptyString, emptyBoard);
		
		board.setPieces();
		String boardWithPieces = board.printBoard();
		System.out.println(boardWithPieces);
		assertEquals(
				appendNewLine(RowsTest.BLACK_KQRBN_STRING) +
				appendNewLine(RowsTest.BLACK_PAWN_STRING) +
				emptyString + emptyString + emptyString + emptyString +
				appendNewLine(RowsTest.WHITE_PAWN_STRING) +
				appendNewLine(RowsTest.WHITE_KQRBN_STRING), boardWithPieces);
	}
	
	public void testCount() throws Exception {
		board.setPieces();
		assertEquals(16, Piece.getWhiteCount());
		assertEquals(16, Piece.getBlackCount());
		
		Piece whitePawn = Piece.createWhtiePawn();
		assertEquals(8, board.getNumberOfPieces(whitePawn));
		Piece blackRook = Piece.createBlackRook();
		assertEquals(2, board.getNumberOfPieces(blackRook));
		Piece whiteKing = Piece.createWhiteKing();
		assertEquals(1, board.getNumberOfPieces(whiteKing));
	}
	
	public void testGetPiece() throws Exception {
		board.setPieces();
		String position = "a8";
		assertEquals(0, board.getPosX(position));
		assertEquals(7, board.getPosY(position));
		
		Piece blackRook = Piece.createBlackRook();
		assertEquals(blackRook, board.getPiece("a8"));
		Piece whiteKing = Piece.createWhiteKing();
		assertEquals(whiteKing, board.getPiece("e1"));
	}

}
