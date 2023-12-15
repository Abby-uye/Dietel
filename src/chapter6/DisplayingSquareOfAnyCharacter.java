package chapter6;

import java.util.Scanner;

public class DisplayingSquareOfAnyCharacter {
    public static void charFill(int numberOfRows,char charFill){
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column <numberOfRows ; column++) {
                System.out.print(charFill + " 20");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows you want your square to have");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the character you want me to print out ");
        char character = scanner.next().charAt(0);
        charFill(numberOfRows,character);
    }
}
