package ConceptPractise;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Enter six number");
        int number = random.nextInt();

        int number1 = number / 100000 % 10;
        int number2 = number / 10000 % 10;
        int number3 = number / 1000 % 10;
        int number4 = number / 100 % 10;
        int number5 = number / 10 % 10;
        int number6 = number % 10;
        System.out.printf("%d      %d            %d         %d          %d       %d", number1, number2, number3, number4, number5, number6);

    }
}