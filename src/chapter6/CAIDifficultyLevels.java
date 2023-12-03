package chapter6;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficultyLevels {

    public static int difficultyLevels(int level) {
        boolean isCorrectLevelInput = level >0 && level <=3;
        while (!isCorrectLevelInput){
            JOptionPane.showMessageDialog(null,"Difficulty level must be grater than 0 an less than 4");
             level = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the level you want to play"));
                return level;
        }
   return level;
    }
    public static int setDifficultyLevel(int level) {
         difficultyLevels(level);
        SecureRandom random = new SecureRandom();
        int digit = 0;
        if (level == 1){
           digit  = random.nextInt(0,10);
        } else if (level == 2) {
            digit = random.nextInt(0,100);
        } else if (level==3) {
            digit = random.nextInt(0,1000);
        }
            return digit;
        }
    public static int generateRandemGoodResponse() {
        SecureRandom random = new SecureRandom();
        int response = random.nextInt(1, 5);
        switch (response) {
            case 1 -> JOptionPane.showMessageDialog(null,"Very good!");
            case 2 -> JOptionPane.showMessageDialog(null,"Excellent");
            case 3 -> JOptionPane.showMessageDialog(null,"Nice work!");
            case 4 -> JOptionPane.showMessageDialog(null,"Keep up the good work");
        }
        return response;
    }

    public static int generateRandomNotSoGoodResponse() {
        SecureRandom random = new SecureRandom();
        int response = random.nextInt(1, 5);
        switch (response) {
            case 1 -> JOptionPane.showMessageDialog(null,"Please try again");
            case 2 -> JOptionPane.showMessageDialog(null,"Wrong! try once more");
            case 3 -> JOptionPane.showMessageDialog(null,"Dont give up");
            case 4 -> JOptionPane.showMessageDialog(null,"Keep trying");
        }
        return response;
    }
public static void randomMultiplication(){
    int level =Integer.parseInt(JOptionPane.showInputDialog("Enter the level you want to play"));
    int firstNumber = setDifficultyLevel(level);
    int secondNumber = setDifficultyLevel(level);
    while (true) {
        String input = JOptionPane.showInputDialog("What is the correct answer "+ firstNumber+" *"+ secondNumber + "=");
        int answer = Integer.parseInt(input);
        if (answer == firstNumber * secondNumber) {
            generateRandemGoodResponse();
            level =Integer.parseInt(JOptionPane.showInputDialog("Enter the level you want to play"));
            firstNumber = setDifficultyLevel(level);
            secondNumber = setDifficultyLevel(level);
        } else {
            generateRandomNotSoGoodResponse();
            firstNumber = firstNumber;
            secondNumber = secondNumber;
        }
    }
}

    public static void main(String[] args) {
        randomMultiplication();
    }


    }

