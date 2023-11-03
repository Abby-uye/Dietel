package chapter6;

import javax.swing.*;
import java.security.SecureRandom;

public class CAIMonitoringStudentPerformance {
    public static int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        int digit = random.nextInt(0, 11);
        return digit;
    }
public static SecureRandom importSecureRandom(){
        return  new SecureRandom();
}


    public static int generateRandemGoodResponse() {
        SecureRandom random = importSecureRandom();
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
        SecureRandom random = importSecureRandom();
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
        int passCount =0;
        int failCount =0;
        int firstNumber = generateRandomNumber();
        int secondNumber = generateRandomNumber();
        for (int index = 0; index < 10 ; index++) {
            String input = JOptionPane.showInputDialog("Enter the correct answer "+firstNumber + "*" + secondNumber + '=');
            int answer = Integer.parseInt(input);
            if (answer == firstNumber * secondNumber) {
                generateRandemGoodResponse();
                firstNumber = generateRandomNumber();
                secondNumber = generateRandomNumber();
                passCount++;
            } else {
                generateRandomNotSoGoodResponse();
                firstNumber = firstNumber;
                secondNumber = secondNumber;
                failCount++;
            }
        }
    calculatePercentage(passCount,failCount);

    }
    public static void calculatePercentage(int passCount,int failCount){
        if (passCount >= 8){
            JOptionPane.showMessageDialog(null,"You are ready to move to the next level");
        }
        if (failCount >= 8){
            JOptionPane.showMessageDialog(null,"Please ask your teacher for help");
        }

    }
    public static void main(String[] args) {
        randomMultiplication();
    }
}
