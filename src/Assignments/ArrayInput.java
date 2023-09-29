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
       for (int enter : scores){
           System.out.println(enter);}
//           if (enter >largest){
//
//               largest = enter;
//           }}
//       }System.out.println(largest);

    }
}
