package Assignments;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter as many numbers as possible");
        int userInput = scanner.nextInt();
        int zero = userInput;
        int positive = userInput;
        int negative = userInput;

        while (userInput != -01) {
            System.out.println("To stop entering a number type -01");
            userInput = scanner.nextInt();
            if (userInput == 0) {
                zero++;

            } else if (userInput > 0) {
                positive++;

            } else if
            (userInput < 0) {
                negative++;

            }

        }

        System.out.println("The number of zeros is " + zero);
        System.out.println("the number of positive numbers is " + positive);
        System.out.println("the number of negative numbers are " + negative);

    }
}