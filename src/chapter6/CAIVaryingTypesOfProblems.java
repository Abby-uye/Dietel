package chapter6;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Random;

public class CAIVaryingTypesOfProblems {
    public static int difficultyLevels(int level) {
        boolean isCorrectLevelInput = level >0 && level <=3;
        while (!isCorrectLevelInput){
            JOptionPane.showMessageDialog(null,"Difficulty level must be greater than 0 an less than 4");
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
    public static int generateRandomGoodResponse() {
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
    public static String arithmeticType(){
        String arthmeticType =  JOptionPane.showInputDialog(null, """
                What type of problem do you want to solve?
                
                ARITHMETIC TYPES
                press 1 for addition problems
                press 2 for subtraction problems
                press 3 for multiplication problems
                press 4 for division problem
                press 5 for random problems""");
        return arthmeticType;
    }
    public static String typeOfArithmetics(String arithmeticType){
        Random random = new Random();
        char  arithmetor = ' ';
        switch (arithmeticType){
            case "1" -> arithmetor = '+';
            case  "2" -> arithmetor = '-';
            case "3" -> arithmetor = '*';
            case "4"-> arithmetor = '/';

        }
    return arithmetor + "";
    }
//    public static String questionArithmetor(S typeOfArithmetic){
//        return String.valueOf(typeOfArithmetic);
//
//    }
    public static  int solution(int firstNumber ,int secondNumber,String typeOfArimetics){
        int arithmeticOperator =0;
        if (typeOfArimetics.equals("+")) {
            arithmeticOperator =  firstNumber + secondNumber;
        }
        if (typeOfArimetics.equals("*")){
            arithmeticOperator =  firstNumber * secondNumber;
        }
        if (typeOfArimetics.equals("/")){
            arithmeticOperator = firstNumber / secondNumber;
        }
        if (typeOfArimetics.equals("-")) {
            arithmeticOperator = firstNumber - secondNumber;
        }
        return arithmeticOperator;
    }
    public static void randomMultiplication() {
        String levelToPlay = "";
        int level =0 ;
        int firstNumber =0;
        int secondNumber =0;
        String typeOfArithmeticOperator = " ";
        String arithmeticType;
        String questionArithmeticOperator = "";
        int answer =0;

        try {
            levelToPlay = JOptionPane.showInputDialog("Enter the level you want to play, level is between 1 and 3");
            level = Integer.parseInt(levelToPlay);
            firstNumber = setDifficultyLevel(level);
             secondNumber = setDifficultyLevel(level);
             arithmeticType = arithmeticType();
            typeOfArithmeticOperator = typeOfArithmetics(arithmeticType);
//             questionArithmeticOperator = questionArithmetor(arithmeticType);
        }
//        catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Invalid level or type of problem, please check and enter a correct input");
//        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid level or type of problem, please check and enter a correct input");
        }

            while (true) {
//                String input ;
                if(levelToPlay == null) {System.exit(1);}
                String userInput = JOptionPane.showInputDialog("What is the correct userAnswer " + firstNumber + " " + typeOfArithmeticOperator + secondNumber + " =");
                inputExceptionChecker(userInput);
                answer = Integer.parseInt(userInput);
//
                if (answer == solution(firstNumber, secondNumber, typeOfArithmeticOperator)) {
                        generateRandomGoodResponse();
                        try {
                            levelToPlay = JOptionPane.showInputDialog("Enter the level you want to play, level is between 1 and 3");
                            level = Integer.parseInt(levelToPlay);
                            arithmeticType = arithmeticType();
                            typeOfArithmeticOperator = typeOfArithmetics(arithmeticType);
                            firstNumber = setDifficultyLevel(level);
                            secondNumber = setDifficultyLevel(level);
                        }catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid level enter, a valid level");
                        }
//                        inputExceptionChecker(userInput);
//                        answer = Integer.parseInt(userInput);

                    }else {
                            generateRandomNotSoGoodResponse();
//                            firstNumber = firstNumber;
//                            secondNumber = secondNumber;
                        }
                    }
                }

    private static void inputExceptionChecker(String userInput) {
        try {
            int userAnswer = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input must be a number");
        }

    }


    public static void main(String[] args) {
        randomMultiplication();
    }
}
