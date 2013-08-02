package pieces;

import junit.framework.TestCase;
import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(), PAWN);
		verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(), KING);
		verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(), QUEEN);
		verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(), ROOK);
		verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(), BISHOP);
		verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(), KNIGHT);
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type) {
		assertTrue(whitePiece.isWhite());
		assertEquals(type.getExpFromEnum(), whitePiece.getExp());
		assertTrue(blackPiece.isBlack());
		assertEquals(Character.toUpperCase(type.getExpFromEnum()), blackPiece.getExp());
	}
	
	public void testColor() throws Exception {
		Piece whitePiece = Piece.createWhitePawn();
		assertTrue(whitePiece.isWhite());
		Piece blackPiece = Piece.createBlackPawn();
		assertTrue(blackPiece.isBlack());
	}
}
