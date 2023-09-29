package task;

import java.util.Scanner;

public class ValidScoresSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int validScore = 0;
        int sum = 0;
        for (int number = 0;number<10;){
            System.out.println("Enter a valid Score");
            score = input.nextInt();
            if (score >0 && score <101){
                validScore = score;
                sum = sum +validScore;
                number++;
            }
        }
        System.out.println("The sum is"+sum);
    }
}
