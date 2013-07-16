package chess;
import pieces.Pawn;
import junit.framework.TestCase;

public class BoatdTest extends TestCase {
	private Board board = new Board();
	
	public void testCreate() throws Exception {	
		assertEquals(0, board.getNumberOfPieces());
	}
	
	public void testPlus() throws Exception {
		Pawn pawn1 = new Pawn();
		Pawn pawn2 = new Pawn("black");
		
		board.plusPiece(pawn1);
		assertEquals(1, board.getNumberOfPieces());
		assertEquals(pawn1, board.get(0));
		
		board.plusPiece(pawn2);
		assertEquals(2, board.getNumberOfPieces());
		assertEquals(pawn1, board.get(0));
		assertEquals(pawn2, board.get(1));
	}
}
