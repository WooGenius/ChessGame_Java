package util;

public class Position {
	private int posX;
	private int posY;
	
	public Position(String position) {
		posX = getIntPos(position.charAt(0));
		posY = getIntPos(position.charAt(1));
	}

	private int getIntPos(char pos) {	// char를 int로 바꾸는 메소드
		final int CONSTANT_X = 10;	// getNumericValue와 체스판 포지션의 차이를 보정해주는 상수
		final int CONSTANT_Y = 1;
		if (Character.isDigit(pos)) {
			return Character.getNumericValue(pos) - CONSTANT_Y;
		}
		return Character.getNumericValue(pos) - CONSTANT_X;
	}

	public int getX() {
		return posX;
	}

	public int getY() {
		return posY;
	}
}
