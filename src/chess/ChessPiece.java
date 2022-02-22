package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
	private Colors color;
	
	public ChessPiece(Board board,Colors color) {
		super(board);
		this.color = color;
	}
	
	public Colors getColors() {
		return color;
	}
	
}
