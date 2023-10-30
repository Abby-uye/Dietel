package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static int randomNumbers (){
        SecureRandom random= new SecureRandom();
        return random.nextInt(1,10);
    }
    public static void randomMultiplication() {
        Scanner input = new Scanner(System.in);
        int firstNumber = randomNumbers();
        int secondNumber = randomNumbers();
        int answer = 0;
        System.out.println("Enter -1 To stop learning");
        while (answer!=-1) {
            System.out.printf("Enter the correct answer %d * %d = ", firstNumber, secondNumber);
             answer = input.nextInt();
            if (answer == firstNumber * secondNumber) {
                System.out.println("Very good, you did great");
                firstNumber = randomNumbers();
                secondNumber = randomNumbers();
            } else {
                System.out.println("Wrong answer,Try again");
                firstNumber = firstNumber;
                secondNumber = secondNumber;
            }
        }
    }

    public static void main(String[] args) {

        randomMultiplication();
    }

}
