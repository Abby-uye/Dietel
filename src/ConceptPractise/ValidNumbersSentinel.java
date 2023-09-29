package ConceptPractise;

import java.util.Scanner;

public class ValidNumbersSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int validScore = 0;
        while (score >0 && score <= 100){
            System.out.println("Enter a score");
            score = input.nextInt();
            validScore = score;
        }score ++;

    }
}
