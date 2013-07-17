package chess;
import pieces.Pawn; 
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	private Board board;
	
	protected void setUp() throws Exception {
		board = new Board();
	}
	
	public void testCreate() throws Exception {	
		board.initialize();
		assertEquals(16, board.getNumberOfPieces());
		assertEquals("pppppppp", board.getArray(1));
		assertEquals("PPPPPPPP", board.getArray(6));
	}
	
	public void testPlus() throws Exception {
		Pawn pawn1 = new Pawn();
		Pawn pawn2 = new Pawn(Pawn.BLACK, Pawn.BLACK_PAWN_EXP);
		
		board.plusPiece(pawn1, 1);
		assertEquals(1, board.getNumberOfPieces());
		assertEquals(pawn1, board.getPiece(1, 0));
		
		board.plusPiece(pawn2, 6);
		assertEquals(2, board.getNumberOfPieces());
		assertEquals(pawn1, board.getPiece(1, 0));
		assertEquals(pawn2, board.getPiece(6, 0));
	}
}
