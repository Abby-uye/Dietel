package task;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        for (int number = 1;number <= 10;number++){
            System.out.println("Enter a score");
            int score = input.nextInt();
            sum = sum +score;
            average = sum / number;
        } System.out.println("The average is "+ average);

    }
}
