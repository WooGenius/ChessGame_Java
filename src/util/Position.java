package util;

public class Position {
	
	public static int getX(String pos) {
		int posX = getIntPos(pos.charAt(0));
		return posX;
	}
	
	public static int getY(String pos) {
		int posY = getIntPos(pos.charAt(1));
		return posY;
 	}
	
	private static int getIntPos(char pos) {	// char를 int로 바꾸는 메소드
		final int CONSTANT_X = 10;	// getNumericValue와 체스판 포지션의 차이를 보정해주는 상수
		final int CONSTANT_Y = 1;
		if (Character.isDigit(pos)) {
			return Character.getNumericValue(pos) - CONSTANT_Y;
		}
		return Character.getNumericValue(pos) - CONSTANT_X;
	}

}
