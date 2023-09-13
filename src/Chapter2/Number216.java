package Chapter2;

import java.util.Scanner;

public class Number216 {
    public static void main(String[] args) {
        Scanner compareNumbers = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int compared = compareNumbers.nextInt();
        int squareOfNumbers = compared * compared;
        if(squareOfNumbers > 100){
            System.out.println("Square of numbers is greater than 100, Try again!");
        }

        if (squareOfNumbers == 100){
            System.out.println("Square of numbers is greater than 100, Perfect");
        }

        if(squareOfNumbers != 100){
            System.out.println("Square of numbers is not equal to 100, Try again!");
        }

        if(squareOfNumbers < 100){
            System.out.println("Square of numbers is less than 100, Try again!");
        }

    }

}
