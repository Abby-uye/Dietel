package Chapter4;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print a triangle");
        int userInput = input.nextInt();
        if (userInput<1 || userInput >10)
            System.out.println("You don overdo");
        else
        for (int number = 1; number <= userInput; number++){
            for (int index = 1; index <=number;index++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

