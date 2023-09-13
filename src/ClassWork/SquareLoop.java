package ClassWork;

import java.util.Scanner;

public class SquareLoop {
    public static void main(String[] args) {
        Scanner squareLoop = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = squareLoop.nextInt();
        System.out.println("Enter second number");
        int secondNumber = squareLoop.nextInt();
//        int squareOfNumbers = 1;
        for(int userSquare =1; userSquare <= secondNumber; userSquare++); {

            int squareOfNumbers = 1 * firstNumber;

            System.out.print(squareOfNumbers);


        }


    }
}