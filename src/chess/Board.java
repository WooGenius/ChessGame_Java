package chess;

import java.util.*;

import pieces.Piece;
import static util.StringUtil.appendNewLine;

public class Board {
	public static final int ROW_NUM = 8;
	private ArrayList<Rows> piecesList = new ArrayList<Rows>();
		
	Board() {
		initialize();
	}
	
	private void initialize() {
		for (int i = 0; i < ROW_NUM; i++) {	// 먼저, 빈 말을 다 채움
			piecesList.add(new Rows());
			piecesList.get(i).initEmpty();
		}
		piecesList.get(0).setWhiteKQRBN();  // 1번째 줄을 흰색 킹퀸룩비숍나이트로 바꿔줌
		piecesList.get(1).setWhitePawn();	// 2번째 줄을 흰색 폰으로 바꿔줌
		piecesList.get(6).setBlackPawn();	// 7번째 줄을 검정색 폰으로 바꿔줌	
		piecesList.get(7).setBlackKQRBN();  // 8번째 줄을 검정색 킹퀸룩비숍나이트로 바꿔줌
	}

	String getArray(int index) {
		return piecesList.get(index).getString();
	}

	String printBoard() {
		StringBuilder printBoard = new StringBuilder();
		for (int i = ROW_NUM; i > 0; i--) {
			printBoard.append(appendNewLine(this.getArray(i-1)));
		}
		return printBoard.toString();
	}

	public int getNumberOfPieces(Piece piece) {
		int count = 0;
		for (Rows row : piecesList) {
			count += row.getNumberOfPiecesFromRow(piece);
		}
		return count;
	}

	public Piece getPiece(String position) {
		int posX = getPosX(position);
		int posY = getPosY(position);
		return piecesList.get(posY).get(posX);
	}

	public int getPosX(String position) {
		int posX = getIntPos(position.charAt(0));
		return posX;
	}
	
	public int getPosY(String position) {
		int posY = getIntPos(position.charAt(1));
		return posY;
	}
	
	private int getIntPos(char pos) {	// char를 int로 바꾸는 메소드
		final int CONSTANT_X = 10;	// getNumericValue와 체스판 포지션의 차이를 보정해주는 상수
		final int CONSTANT_Y = 1;
		if (Character.isDigit(pos)) {
			return Character.getNumericValue(pos) - CONSTANT_Y;
		}
		return Character.getNumericValue(pos) - CONSTANT_X;
	}
}
