package pieces;
public class Pawn {
	String color;
	char pawn;
	final public static String WHITE = "white";
	final public static String BLACK = "black";
	
	public Pawn(){
		color = WHITE;
		pawn = 'p';
	}
	
	public Pawn(String color) {
		this.color = color;
		pawn = 'P';
	}

	String getColor() {
		return color;
	}

	char get() {
		return pawn;
	}
}
