package pieces;
import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		Pawn pawn1 = new Pawn();
		assertEquals(Pawn.WHITE, pawn1.getColor());
		Pawn pawn2 = new Pawn(Pawn.BLACK);
		assertEquals(Pawn.BLACK, pawn2.getColor());
	}
}
