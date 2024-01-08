package chapter8;



import javax.swing.*;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe newGame = new TicTacToe(Positions.EMPTY);
        Positions [] [] gameBoard = newGame.getBoardValues();
        String playerOneName = JOptionPane.showInputDialog("Player one What is your name");
        Player playerOne = new Player(playerOneName);
        String playerTwoName = JOptionPane.showInputDialog("Player two What is your name");
        Player playerTwo = new Player(playerTwoName);
        int  moveCount = 0;
        String playerOneMoves = "";
        String playerTwoMoves = "";
        String gameStatus = "";
        while (moveCount<9 || gameStatus.equals("win")) {
            String playerOneMove = JOptionPane.showInputDialog(playerOne.getName() + " It is your turn to move");
                while (!(playerOneMove.matches("^[1-9]$"))) {
                    playerOneMove = JOptionPane.showInputDialog("Enter a valid input please, A valid is 1 - 9");
                }
            switch (playerOneMove) {
                case "1" -> {
                    if(gameBoard[0][0] .equals(Positions.EMPTY)){
                        gameBoard[0][0] = Positions.X;
                        playerOneMoves += "1";
                    } else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "2" -> {
                    if(gameBoard[0][1] .equals(Positions.EMPTY)){
                    gameBoard[0][1] = Positions.X;
                    playerOneMoves += "2";
                }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "3" -> {
                    if(gameBoard[0][2] .equals(Positions.EMPTY)) {
                        gameBoard[0][2] = Positions.X;
                        playerOneMoves += "3";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "4" -> {
                    if (gameBoard[1][0].equals(Positions.EMPTY)) {
                        gameBoard[1][0] = Positions.X;
                        playerOneMoves += "4";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }

                case "5" -> {
                    if (gameBoard[1][1].equals(Positions.EMPTY)) {
                        gameBoard[1][1] = Positions.X;
                        playerOneMoves += "5";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }

                case "6" -> {
                    if (gameBoard[1][2].equals(Positions.EMPTY)) {
                        gameBoard[1][2] = Positions.X;
                        playerOneMoves += "6";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "7" -> {
                    if (gameBoard[2][0].equals(Positions.EMPTY)) {
                        gameBoard[2][0] = Positions.X;
                        playerOneMoves += "7";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "8"-> {
                    if (gameBoard[2][1].equals(Positions.EMPTY)) {
                        gameBoard[2][1] = Positions.X;
                        playerOneMoves += "8";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "9" -> {
                    if (gameBoard[2][2].equals(Positions.EMPTY)) {
                        gameBoard[2][2] = Positions.X;
                        playerOneMoves += "9";
                    }else playerOneMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
        }

                switch (playerOneMoves){
                    case "159", "357", "123", "258", " 147", "369", "456", "789" -> {
                        gameStatus.equals("win");
                        JOptionPane.showMessageDialog(null,playerOne.getName()+" Wins!!!");
                        System.exit(2);
                    }
                }

       String playerTwoMove = JOptionPane.showInputDialog(playerTwo.getName()+ "It is your turn to move");
            if (!(playerTwoMove.matches("^[1-9]$"))) {
                playerTwoMove = JOptionPane.showInputDialog("Enter a valid input please, A valid is 1 - 9");
            }

            switch (playerTwoMove){
                case "1" -> {
                    if (gameBoard[0][0].equals(Positions.EMPTY)) {
                        gameBoard[0][0] = Positions.O;
                        playerTwoMoves += "1";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "2" -> {
                    if (gameBoard[0][1].equals(Positions.EMPTY)) {
                        gameBoard[0][1] = Positions.O;
                        playerTwoMoves += "2";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "3" -> {
                    if (gameBoard[0][2].equals(Positions.EMPTY)) {
                        gameBoard[0][2] = Positions.O;
                        playerTwoMoves += "3";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "4" -> {
                    if (gameBoard[1][0].equals(Positions.EMPTY)) {
                        gameBoard[1][0] = Positions.O;
                        playerTwoMoves += "4";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "5" -> {
                    if (gameBoard[1][1].equals(Positions.EMPTY)) {
                        gameBoard[1][1] = Positions.O;
                        playerTwoMoves += "5";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                case "6" -> {
                    if (gameBoard[1][2].equals(Positions.EMPTY)) {
                        gameBoard[1][2] = Positions.O;
                        playerTwoMoves += "6";
                    }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                }
                    case "7" -> {
                        if (gameBoard[2][0].equals(Positions.EMPTY)) {
                            gameBoard[2][0] = Positions.O;
                            playerTwoMoves += "7";
                        }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                    }
                    case "8" -> {
                        if (gameBoard[2][1].equals(Positions.EMPTY)) {
                            gameBoard[2][1] = Positions.O;
                            playerTwoMoves += "8";
                        }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                    }
                    case "9" -> {
                        if (gameBoard[2][2].equals(Positions.EMPTY)) {
                            gameBoard[2][2] = Positions.O;
                            playerTwoMoves += "9";
                        }else playerTwoMove = JOptionPane.showInputDialog("This position is not empty check the board and make moves to an empty board position");

                    }
            }
            switch (playerTwoMoves){
                case "159", "357", "123", "258", " 147", "369", "456", "789" -> {
                    gameStatus.equals("win");
                    JOptionPane.showMessageDialog(null,playerTwo.getName()+" Wins!!!");
                    System.exit(2);
                }
            }

       moveCount++;
        }



    }
}
