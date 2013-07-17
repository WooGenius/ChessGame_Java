package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn whitePawn = new Pawn();
		assertEquals(Pawn.WHITE, whitePawn.getColor());
		Pawn blackPawn = new Pawn(Pawn.BLACK, Pawn.BLACK_PAWN_EXP);
		assertEquals(Pawn.BLACK, blackPawn.getColor());
		
		assertEquals(Pawn.WHITE_PAWN_EXP, whitePawn.myExp);
		assertEquals(Pawn.BLACK_PAWN_EXP, blackPawn.myExp);
	}
}
