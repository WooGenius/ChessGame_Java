package chess;

import java.util.*;

import pieces.Piece;
import pieces.Piece.Color;

public class Rows {
	public static final int COL_NUM = 8;
	private ArrayList<Piece> row = new ArrayList<Piece>();
	
	void initEmpty() {
		for (int i = 0; i < COL_NUM; i++) {
			row.add(Piece.createEmptyPiece());
		}
	}

	void setWhitePawn() {	// 한줄을 흰색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.createWhitePawn());
		}
	}
	
	void setBlackPawn() {	// 한줄을 검정색 폰으로 바꾸는 메서드
		for (int i = 0; i < COL_NUM; i++) {
			row.set(i, Piece.createBlackPawn());
		}
	}
	
	void setWhiteKQRBN() {	// 한줄을 흰색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.createWhiteRook());
		row.set(1, Piece.createWhiteKnight());
		row.set(2, Piece.createWhiteBishop());
		row.set(3, Piece.createWhiteQueen());
		row.set(4, Piece.createWhiteKing());
		row.set(5, Piece.createWhiteBishop());
		row.set(6, Piece.createWhiteKnight());
		row.set(7, Piece.createWhiteRook());
	}
	
	void setBlackKQRBN() {	// 한줄을 검정색 킹퀸룩비숍나이트로 바꾸는 메서드
		row.set(0, Piece.createBlackRook());
		row.set(1, Piece.createBlackKnight());
		row.set(2, Piece.createBlackBishop());
		row.set(3, Piece.createBlackQueen());
		row.set(4, Piece.createBlackKing());
		row.set(5, Piece.createBlackBishop());
		row.set(6, Piece.createBlackKnight());
		row.set(7, Piece.createBlackRook());	
	}
	
	String getString() {
		StringBuilder rowString = new StringBuilder();
		for (int i = 0; i < COL_NUM; i++) {
			rowString.append(row.get(i).getExp());
		}
		return rowString.toString();
	}

	public int getNumberOfPiecesFromRow(Piece pieceToFind) {
		int count = 0;
		for (Piece piece : row) {
			if (piece.equals(pieceToFind))
				++count;
		}
		return count;
	}

	public Piece getPieceFromRow(int pos) {
		return row.get(pos);
	}

	public void setPieceFromRow(int position, Piece piece) {
		row.set(position, piece);
	}

	public double getScoreFromRow(Color color) {
		double score = 0;
		for (Piece piece : row) {
			if (piece.getColor() == color) {
				score += piece.getScore();
			}
		}
		return score;
	}

	public ArrayList<Integer> addPawnNum(Color color, ArrayList<Integer> pawnList) {
		for (int i = 0; i < COL_NUM; i++) {
			if (color == Color.BLACK && row.get(i).equals(Piece.createBlackPawn())) {
				pawnList.set(i, pawnList.get(i) + 1);
			} else if (color == Color.WHITE && row.get(i).equals(Piece.createWhitePawn())) {
				pawnList.set(i, pawnList.get(i) + 1);
			}
		}
		return pawnList;
	}
}
