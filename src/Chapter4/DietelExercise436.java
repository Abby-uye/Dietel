package Chapter4;

import java.util.Scanner;

public class DietelExercise436 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number");
        int secondNumber = input.nextInt();
        if (firstNumber == secondNumber){
            System.out.println(0);
        } else if (firstNumber > secondNumber) {
            System.out.println(1);

        }else System.out.println(-1);

    }

}
