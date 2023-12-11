package chapter6;

import java.util.Random;

public class GuessTheNumber {
    public static int generateNumberBetween1And100(){
        Random random = new Random();
        return random.nextInt(1,100);
    }

    public static void main(String[] args) {
        GuessTheNumberModification.initiateGame(generateNumberBetween1And100());
    }
}
