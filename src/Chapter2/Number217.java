package Chapter2;

import java.util.Scanner;

public class Number217 {
    public static void main(String[] args) {
        Scanner aritmetics = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int firstUserInput = aritmetics.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = aritmetics.nextInt();

        System.out.println("Enter First number: ");
        int thirdUserInput = aritmetics.nextInt();

        int sumOfNumbers = firstUserInput + secondUserInput + thirdUserInput;
        int averageOfNumbers = firstUserInput + secondUserInput + thirdUserInput / 3;
        int productOfnumbers = firstUserInput * secondUserInput * thirdUserInput;
            System.out.printf("%s%d%n", "sum of numbers is ", sumOfNumbers);
            System.out.printf("%s%d%n", "Average of number is ", averageOfNumbers);
            System.out.printf("%s%d%n", "Product of number is ", productOfnumbers);
        if ((firstUserInput > secondUserInput) && (firstUserInput > thirdUserInput)) {
            System.out.printf("\n This is the largest number %d ", firstUserInput);
        }

        if ((secondUserInput > firstUserInput) && (secondUserInput > thirdUserInput)) {
            System.out.printf(" \n This is the largest number %d ",secondUserInput);
        }


        if ((thirdUserInput > secondUserInput) && (thirdUserInput > firstUserInput)) {
            System.out.printf(" \n This is the largest number %d ",thirdUserInput);
        }

        if ((firstUserInput < secondUserInput) && (firstUserInput < thirdUserInput)) {
            System.out.printf(" \n This is the smallest  number %d ",firstUserInput);
        }

        if ((secondUserInput < firstUserInput) && (secondUserInput < thirdUserInput)) {
            System.out.printf(" \n This is the smallest number %d ",secondUserInput);
        }

        if ((thirdUserInput < secondUserInput) && (thirdUserInput < firstUserInput)) {
            System.out.printf(" \n This is the smallest number %d ",thirdUserInput);
        }

    }
}
