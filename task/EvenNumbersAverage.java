package task;

import java.util.Scanner;

public class EvenNumbersAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int even =0;
        int average = 0;
        for (int number = 1; number <= 10; number++){
            System.out.println("Enter the scores");
            int score = input.nextInt();
            if (score %2 == 0) even = score;
            sum = sum + even;
            average = sum / number;
        }
        System.out.println("The sum of the even numbers is "+ average);
    }

}
