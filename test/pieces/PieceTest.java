package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(Piece.WHITE, Piece.PAWN_EXP);
		assertEquals(Piece.WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(Piece.BLACK, Piece.PAWN_EXP);
		assertEquals(Piece.BLACK, blackPawn.getColor());
		
		assertEquals(Piece.PAWN_EXP, whitePawn.getExp());
		assertEquals(Character.toUpperCase(Piece.PAWN_EXP), blackPawn.getExp());
	}
}
