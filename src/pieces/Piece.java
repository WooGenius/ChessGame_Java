package pieces;
public class Piece {
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	public static final char PAWN_EXP = 'p';
	public static final String COLOR_EMPTY = " ";
	public static final char EXP_EMPTY = '*';
	
	private String color;
	private char myExp;
	
	private Piece(String color, char myExp) {
		this.color = color;
		if (color == COLOR_WHITE) {
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
		return new Piece(color, exp);
	}
}
