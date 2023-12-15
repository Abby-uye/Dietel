package chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static boolean isDivisibleBy5(int number){
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter the number you want to check");
            int number = scanner.nextInt();
            System.out.println(isDivisibleBy5(number));


        }
    }
}
