package pieces;
public class Pawn {
	String color;
	public char myExp;
	final public static String WHITE = "white";
	final public static String BLACK = "black";
	final public static String COLOR_EMPTY = " ";
	final public static char WHITE_PAWN_EXP = 'p';
	final public static char BLACK_PAWN_EXP = 'P';
	final public static char EXP_EMPTY = '*';
	
	
	public Pawn(){
		color = COLOR_EMPTY;
		myExp = EXP_EMPTY;
	}
	
	public Pawn(String color, char myExp) {
		this.color = color;
		this.myExp = myExp;
	}

	String getColor() {
		return color;
	}
}
