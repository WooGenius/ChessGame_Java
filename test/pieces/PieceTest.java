package pieces;

import junit.framework.TestCase;
import static pieces.Piece.Color.*;
import static pieces.Piece.Exp.*;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(WHITE, PAWN);
		assertEquals(WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(BLACK, PAWN);
		assertEquals(BLACK, blackPawn.getColor());
		
		assertEquals(PAWN.getExpFromEnum(), whitePawn.getExp());
		assertEquals(Character.toUpperCase(PAWN.getExpFromEnum()), blackPawn.getExp());
	}
	
	public void testCount() throws Exception {
		Piece.resetCount();
		Piece.create(BLACK, PAWN);
		assertEquals(1, Piece.getBlackCount());
		Piece.create(WHITE, PAWN);
		assertEquals(1, Piece.getWhiteCount());
		Piece.create(COLOR_EMPTY, PAWN);
		assertEquals(1, Piece.getWhiteCount());
		assertEquals(1, Piece.getBlackCount());
	}
	
	public void testColor() throws Exception {
		Piece whitePiece = Piece.create(WHITE, PAWN);
		assertTrue(whitePiece.isWhite());
		Piece blackPiece = Piece.create(BLACK, PAWN);
		assertTrue(blackPiece.isBlack());
	}
}
