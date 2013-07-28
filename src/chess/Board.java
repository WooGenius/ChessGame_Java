package chess;

import java.util.*;
import static util.StringUtil.NEWLINE;

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
		piecesList.get(1).setWhitePawn();	// 2번째 줄을 흰색 폰으로 바꿔줌
		piecesList.get(6).setBlackPawn();	// 7번째 줄을 검정색 폰으로 바꿔줌	
	}

	String getArray(int index) {
		return piecesList.get(index).getString();
	}

	String printBoard() {
		StringBuilder printBoard = new StringBuilder();
		for (int i = ROW_NUM; i > 0; i--) {
			printBoard.append(this.getArray(i-1) + NEWLINE);
		}
		return printBoard.toString();
	}
}
