package Chapter4;

import java.util.Scanner;

public class DietelExercise438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial");
        int number = input.nextInt();
        int result = number;

        while (number > 1){
            result = result * (number - 1);
            number = number - 1;
        }

        System.out.println(result);
    }
}
