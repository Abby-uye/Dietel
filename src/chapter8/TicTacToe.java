package chapter8;

import java.util.Arrays;

public class TicTacToe  {
    Positions[][] gameBoard;
    public TicTacToe(Positions position){
        gameBoard = new Positions[3][3];
        for (Positions[] positions : gameBoard) {
            Arrays.fill(positions, position);
        }

    }
    public Positions[][] getBoardValues() {
        return gameBoard;
    }



}
