package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knigth;
import chess.pieces.Peao;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch() {			
		board =  new Board(8,8);
		initialSetUp();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()]; 	
		for(int i=0; i< board.getRows(); i++) {
			for(int j=0 ; j<board.getColumns() ; j++) {
				matriz[i][j] = (ChessPiece) board.piece(i,j);
			
			}
		}
		return matriz;
	}
	
	private void initialSetUp() {
		//peças pretas
		board.PlacePiece(new Rook(board, Colors.BLACK), new Position(0, 0));
		board.PlacePiece(new Knigth(board, Colors.BLACK), new Position(0, 1));
		board.PlacePiece(new Bishop(board, Colors.BLACK), new Position(0, 2));
		board.PlacePiece(new Queen(board, Colors.BLACK), new Position(0, 3));
		board.PlacePiece(new King(board, Colors.BLACK), new Position(0, 4));
		board.PlacePiece(new Bishop(board, Colors.BLACK), new Position(0, 5));
		board.PlacePiece(new Knigth(board, Colors.BLACK), new Position(0, 6));
		board.PlacePiece(new Rook(board, Colors.BLACK), new Position(0, 7));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 0));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 1));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 2));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 3));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 4));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 5));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 6));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(1, 7));
		
		//peças bancas
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 0));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 1));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 2));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 3));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 4));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 5));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 6));
		board.PlacePiece(new Peao(board, Colors.BLACK), new Position(6, 7));
		board.PlacePiece(new Rook(board, Colors.BLACK), new Position(7, 0));
		board.PlacePiece(new Knigth(board, Colors.BLACK), new Position(7, 1));
		board.PlacePiece(new Bishop(board, Colors.BLACK), new Position(7, 2));
		board.PlacePiece(new Queen(board, Colors.BLACK), new Position(7, 3));
		board.PlacePiece(new King(board, Colors.BLACK), new Position(7, 4));
		board.PlacePiece(new Bishop(board, Colors.BLACK), new Position(7, 5));
		board.PlacePiece(new Knigth(board, Colors.BLACK), new Position(7, 6));
		board.PlacePiece(new Rook(board, Colors.BLACK), new Position(7, 7));
		
		
	}
	
		
		


}

