package chapter6;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public  int randomNumbers (){
        SecureRandom random= new SecureRandom();
        return random.nextInt(1,10);
    }


    public  void randomMultiplication() {
        ComputerAssistedInstruction randomNumbers = new ComputerAssistedInstruction();
        int firstNumber = randomNumbers.randomNumbers();
        int secondNumber = randomNumbers.randomNumbers();

       while (true) {
           String input = JOptionPane.showInputDialog("Enter the correct answer " + firstNumber + " * " + secondNumber + " = ");
           int userAnswer = Integer.parseInt(input);
            if (userAnswer == firstNumber * secondNumber) {
                JOptionPane.showMessageDialog(null, "Correct!");
               firstNumber = randomNumbers.randomNumbers();
                secondNumber = randomNumbers.randomNumbers();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect.Try again " );
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
