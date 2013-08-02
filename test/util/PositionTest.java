package util;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
	public void testCreate() throws Exception {
		Position position = new Position("c8");
		assertEquals(2, position.getX());
		assertEquals(7, position.getY());
		position = new Position("e6");
		assertEquals(4, position.getX());
		assertEquals(5, position.getY());
	}
}
