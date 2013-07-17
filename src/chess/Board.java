package chess;
import java.util.*;

import pieces.Pawn;

public class Board {
	private ArrayList<ArrayList<Pawn>> piecesList = new ArrayList<ArrayList<Pawn>>();
	
	public Board() {
		int i;		
		for(i=0 ; i<8 ; i++)
			piecesList.add(new ArrayList<Pawn>());
	}
	
	void initialize() {
		int i;
		for(i=0 ; i<8 ; i++) {
			piecesList.get(1).add(new Pawn());
			piecesList.get(6).add(new Pawn(Pawn.BLACK, Pawn.BLACK_PAWN_EXP));
		}
	}
	
	int getNumberOfPieces() {
		int numberOfPieces = 0;
		for(ArrayList<Pawn> pawnList : piecesList)
		{
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
		StringBuilder buffer = new StringBuilder();
		for (Pawn pawn : piecesList.get(index)) 
			buffer.append(pawn.myExp);
			return buffer.toString();
	}
}
