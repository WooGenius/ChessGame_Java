package chess;
import java.util.*;

import pieces.Pawn;

public class Board {
	private ArrayList<ArrayList<Pawn>> piecesList = new ArrayList<ArrayList<Pawn>>();
	static final String NEWLINE = System.getProperty("line.separator");
	
	public Board() {
		int i, j;		
		for(i=0 ; i<8 ; i++) {
			piecesList.add(new ArrayList<Pawn>());
			for(j=0 ; j<8 ; j++)
				piecesList.get(i).add(new Pawn());
		}
	}
	
	void initialize() {
		int i;
		for(i=0 ; i<8 ; i++) {
			piecesList.get(1).set(i, new Pawn(Pawn.WHITE, Pawn.WHITE_PAWN_EXP));
			piecesList.get(6).set(i, new Pawn(Pawn.BLACK, Pawn.BLACK_PAWN_EXP));
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
			printLine.append(pawn.myExp);
			return printLine.toString();
	}

	void printBoard() {
		StringBuilder printBoard = new StringBuilder();
		for (ArrayList<Pawn> pawnList : piecesList) {
			for (Pawn pawn : pawnList) 
				printBoard.insert(0, pawn.myExp);			
			printBoard.insert(0, NEWLINE);			
		}
		System.out.println(printBoard.toString());
	}
}
