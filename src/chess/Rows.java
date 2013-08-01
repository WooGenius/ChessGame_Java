package chess;

import java.util.*;
import pieces.Piece;
import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

public class Rows {
	public static final int COL_NUM = 8;
	private ArrayList<Piece> row = new ArrayList<Piece>();
	
	void initEmpty() {
		for (int i = 0; i < COL_NUM; i++) {
			row.add(Piece.create(COLOR_EMPTY, TYPE_EMPTY));
		}
	}

	void setWhitePawn() {	// 한줄을 흰색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(WHITE, PAWN));
		}
	}
	
	void setBlackPawn() {	// 한줄을 검정색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.create(BLACK, PAWN));
		}
	}
	
	void setWhiteKQRBN() {	// 한줄을 흰색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.create(WHITE, ROOK));
		row.set(1, Piece.create(WHITE, KNIGHT));
		row.set(2, Piece.create(WHITE, BISHOP));
		row.set(3, Piece.create(WHITE, QUEEN));
		row.set(4, Piece.create(WHITE, KING));
		row.set(5, Piece.create(WHITE, BISHOP));
		row.set(6, Piece.create(WHITE, KNIGHT));
		row.set(7, Piece.create(WHITE, ROOK));
	}
	
	void setBlackKQRBN() {	// 한줄을 검정색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.create(BLACK, ROOK));
		row.set(1, Piece.create(BLACK, KNIGHT));
		row.set(2, Piece.create(BLACK, BISHOP));
		row.set(3, Piece.create(BLACK, QUEEN));
		row.set(4, Piece.create(BLACK, KING));
		row.set(5, Piece.create(BLACK, BISHOP));
		row.set(6, Piece.create(BLACK, KNIGHT));
		row.set(7, Piece.create(BLACK, ROOK));
	}
	
	String getString() {
		StringBuilder rowString = new StringBuilder();
		for (int i = 0; i < COL_NUM; i++) {
			rowString.append(row.get(i).getExp());
		}
		return rowString.toString();
	}

}
