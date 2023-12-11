package Chapter5;



import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int mini = MAX_VALUE;
        System.out.println("I am going to print you the sum of the maximum and minimum of numbers in several numbers, Enter the number of numbers you want me to find the extremes from");
        int numberOfTimes = input.nextInt();
        for (int index = 0;index <numberOfTimes;index++){
            System.out.println("Enter an integer");
            int userInput = input.nextInt();
            if (userInput > max) max = userInput;
            else if (userInput < mini) mini = userInput;
        }
        int sum = max + mini;
        System.out.println("The sum of the extremes is "+ sum);
    }
}
