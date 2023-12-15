package Assignments;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        int counter;
        int largest = 0;
        for(counter = 0;counter<scores.length;counter++){
            System.out.println("Enter your scores");
            int userInput = input.nextInt();
            scores[counter]=userInput;
        }
       for (int score : scores){
           System.out.println(score);
           if (score >largest){
               largest = score;
           }
       }System.out.println("The largest score is "+ largest);
    }
}
