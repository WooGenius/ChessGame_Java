package chess;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	private Board board;
	
	protected void setUp() throws Exception {
		board = new Board();
	}
	
	public void testCreate() throws Exception {	
		board.initialize();
		assertEquals("pppppppp", board.getArray(1));
		assertEquals("PPPPPPPP", board.getArray(6));
		String result = board.printBoard();
		System.out.println(result);
	}
}
