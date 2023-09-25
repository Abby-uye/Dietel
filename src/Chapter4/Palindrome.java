package Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see if it is palindrom or not");
        int userInput = input.nextInt();
        int formerNumber = userInput;
        int reverse = 0;
        while (userInput != 0) {
            int number = userInput % 10;
            reverse = reverse * 10 + number;
            userInput /= 10;
        }
        if (formerNumber == reverse){
            System.out.println("The number you enterd is palindrom");
        }else System.out.println("The number you entered is not a palindrome number");
    }
}
