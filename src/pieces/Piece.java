package pieces;

import pieces.Piece.Color;
import pieces.Piece.Type;

public class Piece {
	public static enum Color {WHITE, BLACK, COLOR_EMPTY};
	
	public static enum Type {
		KING('k', 0.0),
		QUEEN('q', 9.0),
		ROOK('r', 5.0),
		BISHOP('b', 3.0),
		KNIGHT('n', 2.5),
		PAWN('p', 1.0),
		TYPE_EMPTY('*', 0.0);
		
		private char exp;
		private double score;
		
		private Type(char exp, double score) {
			this.exp = exp;
			this.score = score;
		}
		
		public char getExpFromEnum() {
			return exp;
		}
		
		public double getScoreFromEnum() {
			return score;
		}
	}
	
	private Color myColor;
	private Type myType;
	
	private Piece(Color color, Type type) {
		this.myColor = color;
		this.myType = type;
	}

	public Color getColor() {
		return myColor;
	}
	
	public Type getType() {
		return myType;
	}
	
	public char getExp() {
		if (isBlack()) {
			return Character.toUpperCase(myType.getExpFromEnum());
		}
		return myType.getExpFromEnum();
	}

	public double getScore() {
		return myType.getScoreFromEnum();
	}
	
	public boolean is(Color color, Type type) {
		return (myColor == color && myType == type);
	}
	
	public boolean isWhite() {
		return myColor == Color.WHITE;
	}

	public boolean isBlack() {
		return myColor == Color.BLACK;
	}

	public static Piece createWhitePawn() {
		return createWhite(Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return createBlack(Type.PAWN);
	}
	
	public static Piece createWhiteKing() {
		return createWhite(Type.KING);
	}
	
	public static Piece createBlackKing() {
		return createBlack(Type.KING);
	}
	
	public static Piece createWhiteQueen() {
		return createWhite(Type.QUEEN);
	}
	
	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}
	
	public static Piece createWhiteRook() {
		return createWhite(Type.ROOK);
	}
	
	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}
	
	public static Piece createWhiteBishop() {
		return createWhite(Type.BISHOP);
	}
	
	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}
	
	public static Piece createWhiteKnight() {
		return createWhite(Type.KNIGHT);
	}
	
	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
	}
	
	public static Piece createEmptyPiece() {
		return new Piece(Color.COLOR_EMPTY, Type.TYPE_EMPTY);
	}
	
	private static Piece createWhite(Type type) {
		return new Piece(Color.WHITE, type);
	}
	
	private static Piece createBlack(Type type) {
		return new Piece(Color.BLACK, type);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myColor == null) ? 0 : myColor.hashCode());
		result = prime * result + ((myType == null) ? 0 : myType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (myColor != other.myColor)
			return false;
		if (myType != other.myType)
			return false;
		return true;
	}
}
