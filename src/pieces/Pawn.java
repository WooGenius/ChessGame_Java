package pieces;
public class Pawn {
	String color;
	final public static String WHITE = "white";
	final public static String BLACK = "black";
	
	public Pawn(){
		color = WHITE;
	}
	
	public Pawn(String color) {
		this.color = color; 
	}

	String getColor() {
		return color;
	}
}
