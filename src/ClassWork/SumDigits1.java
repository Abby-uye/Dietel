package ClassWork;

import java.util.Scanner;

public class SumDigits1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int digits = scanner.nextInt();
        int digit1 = digits / 100;
        int digit2 = digits / 10 % 10;
        int digit3 = digits % 10;

        int sum = digit1 + digit2 + digit3;
        System.out.println(sum);
    }
}
