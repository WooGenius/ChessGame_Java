package pieces;
public class Piece {
	public enum Color {WHITE, BLACK, EMPTY};
	
	public enum Exp {
		KING('k'),
		QUEEN('q'),
		ROOK('r'),
		BISHOP('b'),
		KNIGHT('n'),
		PAWN('p'),
		EMPTY('*');
		
		private char exp;
		
		private Exp(char exp) {
			this.exp = exp;
		}
		
		public char getExpFromEnum() {
			return exp;
		}
	}
	
	private static int blackCount;
	private static int whiteCount;
	
	private Color myColor;
	private Exp myExp;
	
	private Piece(Color color, Exp exp) {
		this.myColor = color;
		this.myExp = exp;
	}

	Color getColor() {
		return myColor;
	}
	
	public char getExp() {
		if (isBlack()) {
			return Character.toUpperCase(myExp.getExpFromEnum());
		}
		return myExp.getExpFromEnum();
	}

	public static Piece create(Color color, Exp exp) {
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
}
