package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn whitePawn = new Pawn();
		assertEquals(Pawn.WHITE, whitePawn.getColor());
		Pawn blackPawn = new Pawn(Pawn.BLACK);
		assertEquals(Pawn.BLACK, blackPawn.getColor());
		
		assertEquals('p', whitePawn.get());
		assertEquals('P', blackPawn.get());
	}
}
