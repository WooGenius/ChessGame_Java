package pieces;
public class Pawn {
	String color;
	final public static String white = "white";
	final public static String black = "black";
	
	public Pawn(){
		color = white;
	}
	
	public Pawn(String color) {
		this.color = color; 
	}

	String getColor() {
		return color;
	}
}
