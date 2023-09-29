package task;

import java.util.Scanner;

public class printAllInputs {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int counter;

        int userInput = 0;
        int [] userInputs = new int[10];

        for(counter = 0;counter < 10;counter++){
            System.out.println("Enter your scores");
            userInput = inputs.nextInt();
            userInputs[counter] = userInput;

        }
        for (int index:userInputs){

        }
        }
    }


