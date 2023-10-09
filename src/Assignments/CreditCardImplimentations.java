package Assignments;

import java.util.Scanner;

public class CreditCardImplimentations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditCardFunctions cardFunctions = new CreditCardFunctions();
        System.out.println("Enter credit card number to verify");
        int[] userInput = new int[]{input.nextInt()};
        cardFunctions.creditCardNumber(userInput);
        System.out.println("Credit Card Type: " + cardFunctions.creditCardType);
        System.out.println("Credit Card Digit  Lenght: "+cardFunctions.creditCardLen );
        System.out.println(cardFunctions.sumOfOddAndSingleNumbers);



    }
}
