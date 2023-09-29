package task;

import java.util.Scanner;

public class ArrayScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        int total = 0;
        double average = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = 0;
        for (int counter = 0;counter<scores.length;counter++){
            System.out.println("Enter your scores");
            int userInput = input.nextInt();
            scores[counter] = userInput;
            total = total + userInput;
            average = (double) total/scores.length;
            if (userInput < minimum) {
                minimum = userInput;
            }
            if (userInput > maximum) {
                maximum = userInput;
            }

        }
        System.out.println("The maximum number is " + maximum);
        System.out.println("The minimum is "+ minimum);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

    }
}
