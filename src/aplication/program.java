package aplication;

import chess.ChessMatch;

public class program {

	public static void main(String[] args) {
		System.out.println("Lets Chess!!!");
		System.out.println();
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
