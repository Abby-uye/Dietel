package Chapter4;

import java.util.Scanner;

public class DietelExercise434 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number  = input.nextInt();
        int sum = 0;
        while (sum < number){
            System.out.println("Enter another number: ");
            int userNumber = input.nextInt();
            sum = sum + userNumber;
            System.out.println(sum);
        }
    }
}
