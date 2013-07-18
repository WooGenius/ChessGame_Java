package pieces;

import junit.framework.TestCase;

public class ChatacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
	}
	public void testJavaIdentifier() throws Exception {
		assertFalse(Character.isJavaIdentifierPart('^')); 
		assertFalse(Character.isJavaIdentifierPart('%'));
		assertFalse(Character.isJavaIdentifierPart('*'));
		assertTrue(Character.isJavaIdentifierPart('$'));
		assertTrue(Character.isJavaIdentifierPart('_'));
	}
}