package chess;

import java.util.*;

import pieces.Piece;

public class Rows {
	public static final int COL_NUM = 8;
	private ArrayList<Piece> row = new ArrayList<Piece>();
	
	void initEmpty() {
		for (int i = 0; i < COL_NUM; i++) {
			row.add(Piece.create(Piece.Color.EMPTY, Piece.Exp.EMPTY));
		}
	}

	void setWhitePawn() {	// 한줄을 흰색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(Piece.Color.WHITE, Piece.Exp.PAWN));
		}
	}
	
	void setBlackPawn() {	// 한줄을 검정색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(Piece.Color.BLACK, Piece.Exp.PAWN));
		}
	}
	
	void setWhiteKQRBN() {	// 한줄을 흰색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.create(Piece.Color.WHITE, Piece.Exp.ROOK));
		row.set(1, Piece.create(Piece.Color.WHITE, Piece.Exp.KNIGHT));
		row.set(2, Piece.create(Piece.Color.WHITE, Piece.Exp.BISHOP));
		row.set(3, Piece.create(Piece.Color.WHITE, Piece.Exp.QUEEN));
		row.set(4, Piece.create(Piece.Color.WHITE, Piece.Exp.KING));
		row.set(5, Piece.create(Piece.Color.WHITE, Piece.Exp.BISHOP));
		row.set(6, Piece.create(Piece.Color.WHITE, Piece.Exp.KNIGHT));
		row.set(7, Piece.create(Piece.Color.WHITE, Piece.Exp.ROOK));
	}
	
	void setBlackKQRBN() {	// 한줄을 검정색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.create(Piece.Color.BLACK, Piece.Exp.ROOK));
		row.set(1, Piece.create(Piece.Color.BLACK, Piece.Exp.KNIGHT));
		row.set(2, Piece.create(Piece.Color.BLACK, Piece.Exp.BISHOP));
		row.set(3, Piece.create(Piece.Color.BLACK, Piece.Exp.QUEEN));
		row.set(4, Piece.create(Piece.Color.BLACK, Piece.Exp.KING));
		row.set(5, Piece.create(Piece.Color.BLACK, Piece.Exp.BISHOP));
		row.set(6, Piece.create(Piece.Color.BLACK, Piece.Exp.KNIGHT));
		row.set(7, Piece.create(Piece.Color.BLACK, Piece.Exp.ROOK));
	}
	
	String getString() {
		StringBuilder rowString = new StringBuilder();
		for (int i = 0; i < COL_NUM; i++) {
			rowString.append(row.get(i).getExp());
		}
		return rowString.toString();
	}

}
