package chess;

import java.util.*;

import pieces.Piece;
import util.Position;
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
	}
	
	public void setPieces() {	// 말을 배치하는 메소드
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

	public Piece getPiece(String pos) {
		Rows targetRow = piecesList.get(Position.getY(pos)); 
		return targetRow.getPieceFromRow(Position.getY(pos));
	}

	public void addPiece(String pos, Piece piece) {
		Rows targetRow = piecesList.get(Position.getY(pos));
		targetRow.setPieceFromRow(Position.getX(pos), piece);
	}
}
