package ConceptPractise;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.printf("%d %d %d ",number1,number2,number3);
    }
}
