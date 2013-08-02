package util;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
	public void testCreate() throws Exception {
		assertEquals(2, Position.getX("c8"));
		assertEquals(7, Position.getY("c8"));
		assertEquals(4, Position.getX("e6"));
		assertEquals(5, Position.getY("e6"));
	}
}
