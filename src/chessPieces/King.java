package src.chessPieces;

import src.boardGame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
