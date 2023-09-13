package ClassWork;

import java.util.Scanner;

public class ForLoopIf {
    public static void main(String[] args) {
        Scanner forLoop = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = forLoop.nextInt();
        int number = 1;
        int count = 0;
        for(number = 10; number <= userInput; number++) {
            System.out.println(number);
        }
    }
}