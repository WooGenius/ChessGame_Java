import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		String a = "white";
		String b = "black";
		Pawn pawn1 = new Pawn();
		assertEquals(a, pawn1.getColor());
		Pawn pawn2 = new Pawn(b);
		assertEquals(b, pawn2.getColor());
	}
}
