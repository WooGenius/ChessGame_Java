package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(Piece.COLOR_WHITE, Piece.PAWN_EXP);
		assertEquals(Piece.COLOR_WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(Piece.COLOR_BLACK, Piece.PAWN_EXP);
		assertEquals(Piece.COLOR_BLACK, blackPawn.getColor());
		
		assertEquals(Piece.PAWN_EXP, whitePawn.getExp());
		assertEquals(Character.toUpperCase(Piece.PAWN_EXP), blackPawn.getExp());
	}
}
