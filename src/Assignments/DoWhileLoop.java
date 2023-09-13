package Assignments;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner doWhileLoop = new Scanner(System.in);
        boolean userInput = true;
        do {
            System.out.println("Enter first integer: ");
            int firstInteger = doWhileLoop.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = doWhileLoop.nextInt();
            System.out.println(firstInteger + secondNumber);
            System.out.println(" if you wish to perform loop again enter true or false: ");
            userInput = doWhileLoop.nextBoolean();

        }
        while (!userInput);


    }
}

