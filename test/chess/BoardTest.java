package chess;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import junit.framework.TestCase;
import static util.StringUtil.appendNewLine;

public class BoardTest extends TestCase {
	private Board board;
	
	protected void setUp() throws Exception {
		board = new Board();
	}
	
	public void testCreate() throws Exception {	
		String emptyString = appendNewLine(RowsTest.EMPTY_STRING);
		String emptyBoard = board.printBoard();
		System.out.println(emptyBoard);
		assertEquals(
				emptyString + emptyString + emptyString + emptyString +
				emptyString + emptyString + emptyString + emptyString, emptyBoard);
		
		board.setPieces();	// 원래말을 배치
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
		Piece whitePawn = Piece.createWhitePawn();
		assertEquals(8, board.getNumberOfPieces(whitePawn));
		Piece blackRook = Piece.createBlackRook();
		assertEquals(2, board.getNumberOfPieces(blackRook));
		Piece whiteKing = Piece.createWhiteKing();
		assertEquals(1, board.getNumberOfPieces(whiteKing));
	}
	
	public void testGetPiece() throws Exception {
		board.setPieces();	// 원래말을 배치
		Piece blackRook = Piece.createBlackRook();
		assertEquals(blackRook, board.getPiece("a8"));
		Piece whiteKing = Piece.createWhiteKing();
		assertEquals(whiteKing, board.getPiece("e1"));
	}
	
	public void testAddPiece() throws Exception {
		Piece blackBishop = Piece.createBlackBishop();
		board.addPiece("a8", blackBishop);
		assertEquals(blackBishop, board.getPiece("a8"));
		Piece whiteRook = Piece.createWhiteRook();
		board.addPiece("b6", whiteRook);
		assertEquals(whiteRook, board.getPiece("b6"));
	}
	
	public void testScore() throws Exception {
		board.addPiece("a8", Piece.createBlackRook());
		printScore();
		assertEquals(5.0, board.getScore(Color.BLACK));
		assertEquals(0.0, board.getScore(Color.WHITE));
		
		board.addPiece("a7", Piece.createWhiteBishop());
		printScore();
		assertEquals(5.0, board.getScore(Color.BLACK));
		assertEquals(3.0, board.getScore(Color.WHITE));
		
		board.addPiece("b6", Piece.createWhitePawn());
		board.addPiece("b7", Piece.createBlackPawn());
		board.addPiece("e6", Piece.createWhiteQueen());
		board.addPiece("c8", Piece.createBlackKnight());
		printScore();
		assertEquals(8.5, board.getScore(Color.BLACK));
		assertEquals(13.0, board.getScore(Color.WHITE));
		
		board.addPiece("b3", Piece.createBlackPawn());	// 이미 같은줄에 검정색 폰이 있는경우
		printScore();
		assertEquals(8.5, board.getScore(Color.BLACK));
		assertEquals(13.0, board.getScore(Color.WHITE));

		board.addPiece("b4", Piece.createBlackPawn());	// 이미 같은줄에 검정색 폰이 있는 경우
		printScore();
		assertEquals(9.0, board.getScore(Color.BLACK));
		assertEquals(13.0, board.getScore(Color.WHITE));
		
	}

	private void printScore() {
		System.out.println(board.printBoard() + appendNewLine("Black:White = " + 
								board.getScore(Color.BLACK) + ":" + board.getScore(Color.WHITE)));
	}
	
	public void testMakeSortedListByColor() throws Exception {
		board.addPiece("b6", Piece.createWhitePawn());
		board.addPiece("b7", Piece.createBlackPawn());
		board.addPiece("e6", Piece.createWhiteQueen());
		board.addPiece("c8", Piece.createBlackKnight());
		board.addPiece("c7", Piece.createBlackQueen());
		ArrayList<Piece> sortedList = board.makeSortedListByColor(Color.BLACK);
		assertEquals(3, sortedList.size());
		System.out.println(sortedList);
		assertEquals(Piece.createBlackQueen(), sortedList.get(0));
		assertEquals(Piece.createBlackPawn(), sortedList.get(2));
	}
}
