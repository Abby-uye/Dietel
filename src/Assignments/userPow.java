package Assignments;

import java.util.Scanner;

public class userPow {
    public static void main(String[] args) {
        Scanner power = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int userInput1 = power.nextInt(); ;

        System.out.println("Enter second number: ");
        int userInput2 = power.nextInt();

        int powerNumber1 = userInput1 * userInput2;
        System.out.println("userInput1 raise to userInput2 is "+powerNumber1);

        int powerNumber2 = userInput2 * userInput1;
        System.out.println("userInput@ raise to userInput1 is "+powerNumber2);

    }
}
