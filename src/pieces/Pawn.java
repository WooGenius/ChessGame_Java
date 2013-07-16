package pieces;
public class Pawn {
	String color;
	String w = "white";
	String b = "black";
	
	public Pawn(){
		color = w;
	}
	
	public Pawn(String color) {
		this.color = color; 
	}

	String getColor() {
		return color;
	}

}
