package task;

import java.util.Scanner;

public class AverageOfValidScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validScore = 0;
        int sum = 0;
        int average = 0;
        for (int number = 1; number <= 10; number++) {
            System.out.println("Enter a score");
            int score = input.nextInt();
            if (score > 0 && score < 100) {
                validScore = score;
                sum = sum + validScore;
                 average = sum / number;
            }
        }
        System.out.println("The average of valid scores is "+average);
    }
}
