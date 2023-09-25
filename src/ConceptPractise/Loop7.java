package ConceptPractise;

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character");
        int number = input.nextInt();
        int number1 = 0;
        int number2 = 1;
        int counter = 1;
        while (counter < number){
            int temp = number2;
            number2 = number2 + number1;
            number1 = temp;
            counter++;

        }
        System.out.println(number2);
    }
}






