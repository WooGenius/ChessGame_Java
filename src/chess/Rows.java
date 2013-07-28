package chess;

import java.util.*;

import pieces.Piece;

public class Rows {
	public static final int COL_NUM = 8;
	private ArrayList<Piece> row = new ArrayList<Piece>();
	
	void initEmpty() {
		for (int i = 0; i < COL_NUM; i++) {
			row.add(Piece.create(Piece.COLOR_EMPTY, Piece.EXP_EMPTY));
		}
	}

	void setWhitePawn() {	// 한줄을 흰색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(Piece.COLOR_WHITE, Piece.PAWN_EXP));
		}
	}
	
	void setBlackPawn() {	// 한줄을 검정색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(Piece.COLOR_BLACK, Piece.PAWN_EXP));
		}
	}
	
	String getString() {
		StringBuilder rowString = new StringBuilder();
		for (int i = 0; i < COL_NUM; i++) {
			rowString.append(row.get(i).getExp());
		}
		return rowString.toString();
	}
}
