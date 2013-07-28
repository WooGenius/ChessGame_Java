package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(Piece.COLOR_WHITE, Piece.EXP_PAWN);
		assertEquals(Piece.COLOR_WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(Piece.COLOR_BLACK, Piece.EXP_PAWN);
		assertEquals(Piece.COLOR_BLACK, blackPawn.getColor());
		
		assertEquals(Piece.EXP_PAWN, whitePawn.getExp());
		assertEquals(Character.toUpperCase(Piece.EXP_PAWN), blackPawn.getExp());
	}
}
