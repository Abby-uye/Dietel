package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public  int randomNumbers (){
        SecureRandom random= new SecureRandom();
        return random.nextInt(1,10);
    }

    public  int scannerIntegerInputs(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public  void randomMultiplication() {
        ComputerAssistedInstruction randomNumbers = new ComputerAssistedInstruction();
        int answer =0;
        int firstNumber = randomNumbers.randomNumbers();
        int secondNumber = randomNumbers.randomNumbers();

       while (true) {
            System.out.printf("Enter the correct answer %d * %d = ", firstNumber, secondNumber);
             answer = randomNumbers.scannerIntegerInputs();
            if (answer == firstNumber * secondNumber) {
                System.out.println("Very good, you did great");
               firstNumber = randomNumbers.randomNumbers();
                secondNumber = randomNumbers.randomNumbers();
            } else {
                System.out.println("Wrong answer,Try again");
                firstNumber = firstNumber;
                secondNumber = secondNumber;
            }
        }
    }

    public static void main(String[] args) {
        ComputerAssistedInstruction randomNumbers = new ComputerAssistedInstruction();

        randomNumbers.randomMultiplication();
    }

}
