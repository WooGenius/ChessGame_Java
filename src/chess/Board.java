package chess;
import java.util.*;

import pieces.Pawn;

public class Board {
	static final String NEWLINE = System.getProperty("line.separator");
	private ArrayList<ArrayList<Pawn>> piecesList = new ArrayList<ArrayList<Pawn>>();
	int rowNum = 8;
	int colNum = 8;
		
	void initialize() {
		for(int i=0 ; i<rowNum ; i++) {
			piecesList.add(new ArrayList<Pawn>());
			for(int j=0 ; j<colNum ; j++)
				piecesList.get(i).add(new Pawn());
		}
		
		for(int i=0 ; i<colNum ; i++) {
			piecesList.get(1).set(i, new Pawn(Pawn.WHITE, Pawn.PAWN_EXP));
			piecesList.get(6).set(i, new Pawn(Pawn.BLACK, Pawn.PAWN_EXP));
		}
	}
	
	int getNumberOfPieces() {
		int numberOfPieces = 0;
		for(ArrayList<Pawn> pawnList : piecesList) {
			numberOfPieces = numberOfPieces + pawnList.size();
		}
		return numberOfPieces;
	}

	void plusPiece(Pawn pawn, int row) {
		piecesList.get(row).add(pawn);
	}

	ArrayList<Pawn> getArrayList(int index) {
		return piecesList.get(index);
	}
	
	Pawn getPiece(int row, int col) {
		return piecesList.get(row).get(col);
	}

	String getArray(int index) {
		StringBuilder printLine = new StringBuilder();
		for (Pawn pawn : piecesList.get(index)) 
			printLine.append(pawn.getExp());
			return printLine.toString();
	}

	String printBoard() {
		StringBuilder printBoard = new StringBuilder();
		for (int i = rowNum; i > 0; i--) {
			printBoard.append(this.getArray(i-1) + NEWLINE);
		}
		return printBoard.toString();
	}
}
