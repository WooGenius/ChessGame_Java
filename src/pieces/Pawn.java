package pieces;
public class Pawn {
	String color;
	public char myExp;
	final public static String WHITE = "white";
	final public static String BLACK = "black";
	final public static char WHITE_PAWN_EXP = 'p';
	final public static char BLACK_PAWN_EXP = 'P';
	
	
	public Pawn(){
		color = WHITE;
		myExp = WHITE_PAWN_EXP;
	}
	
	public Pawn(String color, char myExp) {
		this.color = color;
		this.myExp = myExp;
	}

	String getColor() {
		return color;
	}
}
