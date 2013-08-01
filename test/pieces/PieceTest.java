package pieces;

import junit.framework.TestCase;
import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		verifyCreation(Piece.createWhtiePawn(), Piece.createBlackPawn(), PAWN);
		verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(), KING);
		verifyCreation(Piece.createWhtieQueen(), Piece.createBlackQueen(), QUEEN);
		verifyCreation(Piece.createWhtieRook(), Piece.createBlackRook(), ROOK);
		verifyCreation(Piece.createWhtieBishop(), Piece.createBlackBishop(), BISHOP);
		verifyCreation(Piece.createWhtieKnight(), Piece.createBlackKnight(), KNIGHT);
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type) {
		assertTrue(whitePiece.isWhite());
		assertEquals(type.getExpFromEnum(), whitePiece.getExp());
		assertTrue(blackPiece.isBlack());
		assertEquals(Character.toUpperCase(type.getExpFromEnum()), blackPiece.getExp());
	}
	
	public void testCount() throws Exception {
		Piece.resetCount();
		Piece.create(BLACK, PAWN);
		assertEquals(1, Piece.getBlackCount());
		Piece.create(WHITE, PAWN);
		assertEquals(1, Piece.getWhiteCount());
		Piece.create(COLOR_EMPTY, PAWN);
		assertEquals(1, Piece.getWhiteCount());
		assertEquals(1, Piece.getBlackCount());
	}
	
	public void testColor() throws Exception {
		Piece whitePiece = Piece.create(WHITE, PAWN);
		assertTrue(whitePiece.isWhite());
		Piece blackPiece = Piece.create(BLACK, PAWN);
		assertTrue(blackPiece.isBlack());
	}
}
