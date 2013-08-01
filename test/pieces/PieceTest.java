package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(Piece.Color.WHITE, Piece.Exp.PAWN);
		assertEquals(Piece.Color.WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(Piece.Color.BLACK, Piece.Exp.PAWN);
		assertEquals(Piece.Color.BLACK, blackPawn.getColor());
		
		assertEquals(Piece.Exp.PAWN.getExpFromEnum(), whitePawn.getExp());
		assertEquals(Character.toUpperCase(Piece.Exp.PAWN.getExpFromEnum()), blackPawn.getExp());
	}
	
	public void testCount() throws Exception {
		Piece.resetCount();
		Piece.create(Piece.Color.BLACK, Piece.Exp.PAWN);
		assertEquals(1, Piece.getBlackCount());
		Piece.create(Piece.Color.WHITE, Piece.Exp.PAWN);
		assertEquals(1, Piece.getWhiteCount());
		Piece.create(Piece.Color.EMPTY, Piece.Exp.PAWN);
		assertEquals(1, Piece.getWhiteCount());
		assertEquals(1, Piece.getBlackCount());
	}
	
	public void testColor() throws Exception {
		Piece whitePiece = Piece.create(Piece.Color.WHITE, Piece.Exp.PAWN);
		assertTrue(whitePiece.isWhite());
		Piece blackPiece = Piece.create(Piece.Color.BLACK, Piece.Exp.PAWN);
		assertTrue(blackPiece.isBlack());
	}
}
