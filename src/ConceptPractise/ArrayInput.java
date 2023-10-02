package ConceptPractise;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];
        int counter = 0;
        for ( counter = 0; counter < numbers.length; counter++){
            System.out.println("Enter number"  + (counter+1)+": ");
            int userInput = input.nextInt();
            numbers [counter] = userInput;
        }
        for (int index = 0 ; index < numbers.length; index++){
            System.out.println("index "+ index +" has the value of " + numbers[index]);
        }
    }
}
