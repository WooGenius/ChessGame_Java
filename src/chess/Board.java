package chess;

import java.util.*;

import pieces.Piece;
import pieces.Piece.Color;
import util.Position;
import static util.StringUtil.appendNewLine;

public class Board {
	public static final int ROW_NUM = 8;
	private ArrayList<Rows> board = new ArrayList<Rows>();
		
	Board() {
		initialize();
	}
	
	private void initialize() {
		for (int i = 0; i < ROW_NUM; i++) {	// 먼저, 빈 말을 다 채움
			board.add(new Rows());
			board.get(i).initEmpty();
		}
	}
	
	public void setPieces() {	// 말을 배치하는 메소드
		board.get(0).setWhiteKQRBN();  // 1번째 줄을 흰색 킹퀸룩비숍나이트로 바꿔줌
		board.get(1).setWhitePawn();	// 2번째 줄을 흰색 폰으로 바꿔줌
		board.get(6).setBlackPawn();	// 7번째 줄을 검정색 폰으로 바꿔줌	
		board.get(7).setBlackKQRBN();  // 8번째 줄을 검정색 킹퀸룩비숍나이트로 바꿔줌
	}

	String printBoard() {
		StringBuilder printBoard = new StringBuilder();
		for (int i = ROW_NUM; i > 0; i--) {
			printBoard.append(appendNewLine(this.getArrayString(i-1)));
		}
		return printBoard.toString();
	}
	
	String getArrayString(int index) {
		return board.get(index).getString();
	}

	public int getNumberOfPieces(Piece piece) {
		int count = 0;
		for (Rows row : board) {
			count += row.getNumberOfPiecesFromRow(piece);
		}
		return count;
	}

	public Piece getPiece(String position) {
		Position pos = new Position(position);
		return board.get(pos.getY()).getPieceFromRow(pos.getX());
	}

	public void addPiece(String position, Piece piece) {
		Position pos = new Position(position);
		board.get(pos.getY()).setPieceFromRow(pos.getX(), piece);
	}

	public double getScore(Color color) {
		ArrayList<Integer> pawnList = new ArrayList<Integer>(8);
		double score = 0;
		
		for (int i = 0; i < ROW_NUM; i++)	// 폰리스트 초기화
			pawnList.add(0);
		
		for (Rows row : board) {
			pawnList = row.addPawnNum(color, pawnList);	// 각각의 열에 폰있으면 숫자를 더하는 메소드
 			score += row.getScoreFromRow(color);
		}
		
		for (int i : pawnList) {
			if (i>1) {
				final double PAWN_SCORE_GAP = 0.5;
				score -= i*PAWN_SCORE_GAP;
			}
		}
		return score;
	}

	public ArrayList<Piece> makeSortedListByColor(Color color) {
		ArrayList<Piece> piecesList = new ArrayList<Piece>();
		for (Rows row : board) 
			piecesList.addAll(row.getListByColor(color));
		Collections.sort(piecesList);
		return piecesList;
	}
}