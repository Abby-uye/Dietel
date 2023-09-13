package Assignments;

import java.util.Scanner;

public class SmallestAndLargestNumbers{
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = numbers.nextInt();

        int largestNumbers = userInput;
        int smallestNumbers = userInput;
        while (userInput!= -1){
            System.out.println("To stop pres -1");
            userInput=numbers.nextInt();
            if (userInput > largestNumbers){
                largestNumbers = userInput;
            } else if (userInput < smallestNumbers && userInput != -1) {
                smallestNumbers = userInput;

            }
        }
        System.out.println("the largest number is "+largestNumbers);
        System.out.println("The smallest number is "+smallestNumbers);
    }

}