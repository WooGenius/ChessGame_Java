import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		String white = "white";
		String black = "black";
		Pawn pawn1 = new Pawn();
		assertEquals(white, pawn1.getColor());
		Pawn pawn2 = new Pawn(black);
		assertEquals(black, pawn2.getColor());
	}
}
