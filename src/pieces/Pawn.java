package pieces;
public class Pawn {
	private String color;
	private char myExp;
	final public static String WHITE = "white";
	final public static String BLACK = "black";
	public static final char PAWN_EXP = 'p';
	final public static String COLOR_EMPTY = " ";
	final public static char EXP_EMPTY = '*';
	
	
	public Pawn(){
		color = COLOR_EMPTY;
		myExp = EXP_EMPTY;
	}
	
	public Pawn(String color, char myExp) {
		this.color = color;
		if (color == WHITE) {
			this.myExp = myExp;
		} else {
			this.myExp = Character.toUpperCase(myExp);
		}
	}

	String getColor() {
		return color;
	}
	
	public char getExp() {
		return myExp;
	}
}
