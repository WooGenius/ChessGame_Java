import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn1 = new Pawn();
		String color = pawn1.getColor();
		assertEquals("white", color);		
	}
}
