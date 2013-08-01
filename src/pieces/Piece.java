package pieces;
public class Piece {
	public static enum Color {WHITE, BLACK, COLOR_EMPTY};
	
	public static enum Type {
		KING('k'),
		QUEEN('q'),
		ROOK('r'),
		BISHOP('b'),
		KNIGHT('n'),
		PAWN('p'),
		TYPE_EMPTY('*');
		
		private char exp;
		
		private Type(char exp) {
			this.exp = exp;
		}
		
		public char getExpFromEnum() {
			return exp;
		}
	}
	
	private static int blackCount;
	private static int whiteCount;
	
	private Color myColor;
	private Type myType;
	
	private Piece(Color color, Type type) {
		this.myColor = color;
		this.myType = type;
	}

	Color getColor() {
		return myColor;
	}
	
	public char getExp() {
		if (isBlack()) {
			return Character.toUpperCase(myType.getExpFromEnum());
		}
		return myType.getExpFromEnum();
	}

	public static Piece create(Color color, Type exp) {
			Piece.IncrementCount(color);
		return new Piece(color, exp);
	}

	private static void IncrementCount(Color color) {
		if (color == Color.WHITE) {
			++ whiteCount;
		} else if (color == Color.BLACK) {
			++ blackCount;
		}
	}

	public static void resetCount() {
		blackCount = 0;
		whiteCount = 0;
	}

	public static int getBlackCount() {
		return blackCount;
	}

	public static int getWhiteCount() {
		return whiteCount;
	}

	public boolean isWhite() {
		return myColor == Color.WHITE;
	}

	public boolean isBlack() {
		return myColor == Color.BLACK;
	}

	public static Piece createWhtiePawn() {
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
	
	public static Piece createWhtieQueen() {
		return createWhite(Type.QUEEN);
	}
	
	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}
	
	public static Piece createWhtieRook() {
		return createWhite(Type.ROOK);
	}
	
	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}
	
	public static Piece createWhtieBishop() {
		return createWhite(Type.BISHOP);
	}
	
	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}
	
	public static Piece createWhtieKnight() {
		return createWhite(Type.KNIGHT);
	}
	
	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
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
