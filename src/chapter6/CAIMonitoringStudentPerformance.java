package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringStudentPerformance {
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
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
        return response;
    }

    public static int generateRandomNotSoGoodResponse() {
        SecureRandom random = new SecureRandom();
        int response = random.nextInt(1, 5);
        switch (response) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
        return response;
    }


    public static void randomMultiplication() {
        int passCount =0;
        int failCount =0;
        int answer = 0;
        int firstNumber = generateRandomNumber();
        int secondNumber = generateRandomNumber();
        for (int index = 0; index < 10 ; index++) {
            System.out.printf("Enter the correct answer %d * %d = ", firstNumber, secondNumber);
            answer = generateUserInputs();
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
            System.out.println("Congratulations you are ready for the next level");
        }
        if (failCount >= 8){
            System.out.println("'Please ask your teacher for extra help'");
        }

    }
    public static void main(String[] args) {
        randomMultiplication();
    }
}
