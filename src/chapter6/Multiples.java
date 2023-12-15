package chapter6;

import javax.swing.*;
import java.util.Scanner;

public class Multiples {
    public static boolean isMultiple(int numberToCheck, int checkIfMultiple){
        return checkIfMultiple % numberToCheck == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the first number ");
            int firstNumber = scanner.nextInt();
            System.out.println("The the number you wnt to check if its multiple");
            int numberToCheck = scanner.nextInt();
            System.out.println(isMultiple(firstNumber, numberToCheck));
        }

    }
}
