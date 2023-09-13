package Chapter4;

import java.util.Scanner;

public class DietelExercise434 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 90;
        System.out.println("Enter a number: ");
        int userNumber = input.nextInt();
        while (userNumber < number){
            System.out.println("Enter another number: ");
            userNumber = input.nextInt();
            System.out.println(number);
        }
    }
}
