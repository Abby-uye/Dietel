package task;

import java.util.Scanner;

public class CheckListOfScoresWithoutArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        double average = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = 0;
        for (int counter = 1;counter <= 10;counter++){
            System.out.println("Enter your scores");
            int userInput = input.nextInt();
            total = total + userInput;
            average = (double) total / counter;
            if (userInput < minimum){
                minimum = userInput;
            }
            if (userInput > maximum){
                maximum = userInput;
            }
        }
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        System.out.println("The minimum score is " + minimum);
        System.out.println("The maximum score is " + maximum);
    }
}
