package pieces;
public class Piece {
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	public static final String COLOR_EMPTY = " ";
	
	public static final char EXP_KING = 'k';
	public static final char EXP_QUEEN = 'q';
	public static final char EXP_ROOK = 'r';
	public static final char EXP_BISHOP = 'b';
	public static final char EXP_KNIGHT = 'n';
	public static final char EXP_PAWN = 'p';
	public static final char EXP_EMPTY = '*';
	
	private static int blackCount;
	private static int whiteCount;
	
	
	private String color;
	private char myExp;
	
	private Piece(String color, char myExp) {
		this.color = color;
		if (color == COLOR_WHITE || color == COLOR_EMPTY) {
			this.myExp = myExp;
		} else {
			this.myExp = Character.toUpperCase(myExp);	// 컬러가 블랙인 경우 대문자 할당
		}
	}

	String getColor() {
		return color;
	}
	
	public char getExp() {
		return myExp;
	}

	public static Piece create(String color, char exp) {
			Piece.IncrementCount(color);
		return new Piece(color, exp);
	}

	private static void IncrementCount(String color) {
		if (color == COLOR_WHITE) {
			++ whiteCount;
		} else if (color == COLOR_BLACK) {
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
		return color == COLOR_WHITE;
	}

	public boolean isBlack() {
		return color == COLOR_BLACK;
	}
}
