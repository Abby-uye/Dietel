package chapter6;

import javax.swing.*;
import java.util.Random;

public class GuessTheNumberModification {
    public static int generateNumberBetween1And100(){
        Random random = new Random();
        return random.nextInt(1,100);
    }
    public static void generateResponsesForPlayers(int count){
        if (count < 10)  JOptionPane.showMessageDialog(null,"Either you know the trick or you got lucky");
        else if (count == 10) JOptionPane.showMessageDialog(null,"Aha! you know the trick");
        else if (count > 10) JOptionPane.showMessageDialog(null, "You should be able to do better, Why should it take more than guesses");
    }
   public static void initiateGame(int i) {
        int numberToBeGuessed = i;
        int userAnswer =  Integer.parseInt(JOptionPane.showInputDialog(null,"Guess the correct answer between 1 and 100"));
        int count =0;
        while (true) {
            ++count;
            if (userAnswer > numberToBeGuessed) userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "Too high, Try again"));
            else if (userAnswer < numberToBeGuessed) userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "Too low, Try again"));
            else  {
                JOptionPane.showMessageDialog(null, "Sweet! you guessed the correct number ");
                generateResponsesForPlayers(count);
                String playAgain = JOptionPane.showInputDialog(null, "Do you wish to continue playing the game if yes press yes if no press no");
                if (playAgain.equalsIgnoreCase("yes")) {
                    numberToBeGuessed = i;
                    userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the correct answer between 1 and 100"));
                } else System.exit(8);
            }
        }
    }
    public static void main(String[] args) {
        initiateGame(generateNumberBetween1And100());
    }
}
