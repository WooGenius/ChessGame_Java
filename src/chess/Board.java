package chess;
import java.util.*;

import pieces.Pawn;

public class Board {
	private ArrayList<Pawn> piecesList = new ArrayList<Pawn>();

	int getNumberOfPieces() {
		return piecesList.size();
	}

	void plusPiece(Pawn pawn) {
		piecesList.add(pawn);
	}

	Pawn get(int index) {
		return piecesList.get(index);
	}
}
