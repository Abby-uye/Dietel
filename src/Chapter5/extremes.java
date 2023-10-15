package Chapter5;



import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int mini = MAX_VALUE;
        int sum = 0;
        for (int index = 0;index <5;index++){
            System.out.println("Enter an integer");
            int userInput = input.nextInt();
            if (userInput>max){
                max = userInput;
            }if (userInput<mini){
                mini = userInput;
            }

        }sum = max + mini;
        System.out.println("The sum of the extremes is "+ sum);
    }
}
