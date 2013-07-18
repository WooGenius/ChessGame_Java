package chess;

import java.util.*;

import pieces.Pawn;

public class Rows {
	private ArrayList<Pawn> row = new ArrayList<Pawn>();
	int colNum = 8;
	
	void initEmpty() {
		for (int i = 0; i < colNum; i++) {
			row.add(new Pawn());
		}
	}

	void setWhite() {
		for (int i = 0; i < colNum; i++) {
			row.set(i, new Pawn(Pawn.WHITE, Pawn.PAWN_EXP));
		}
	}
	
	void setBlack() {
		for (int i = 0; i < colNum; i++) {
			row.set(i, new Pawn(Pawn.BLACK, Pawn.PAWN_EXP));
		}
	}
	
	String getString() {
		StringBuilder rowString = new StringBuilder();
		for (int i = 0; i < colNum; i++) {
			rowString.append(row.get(i).getExp());
		}
		return rowString.toString();
	}
}
