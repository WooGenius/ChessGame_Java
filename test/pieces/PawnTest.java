package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn whitePawn = new Pawn(Pawn.WHITE, Pawn.PAWN_EXP);
		assertEquals(Pawn.WHITE, whitePawn.getColor());
		Pawn blackPawn = new Pawn(Pawn.BLACK, Pawn.PAWN_EXP);
		assertEquals(Pawn.BLACK, blackPawn.getColor());
		
		assertEquals(Pawn.PAWN_EXP, whitePawn.getExp());
		assertEquals(Character.toUpperCase(Pawn.PAWN_EXP), blackPawn.getExp());
	}
}
