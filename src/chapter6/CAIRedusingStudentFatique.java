package chapter6;
import javax.swing.*;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAIRedusingStudentFatique {
    public static int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        int digit = random.nextInt(0, 11);
        return digit;
    }

    public static int generateUserInputs() {
        return new Scanner(System.in).nextInt();

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

    public static void randomMultiplication() {
        int firstNumber = generateRandomNumber();
        int secondNumber = generateRandomNumber();

        while (true) {
            String input = JOptionPane.showInputDialog("What is the correct answer "+ firstNumber+" *"+ secondNumber + "=");
            int answer = Integer.parseInt(input);
            if (answer == firstNumber * secondNumber) {
                generateRandemGoodResponse();
                firstNumber = generateRandomNumber();
                secondNumber = generateRandomNumber();
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