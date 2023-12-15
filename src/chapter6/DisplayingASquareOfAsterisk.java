package chapter6;
import java.util.Scanner;
public class DisplayingASquareOfAsterisk {
    public static void squareOfAsterisk(int number){
        for (int row = 0; row < number ; row++) {
            for (int column = 0; column < number; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows you want your square to have");
        int numberOfRow = scanner.nextInt();
        squareOfAsterisk(numberOfRow);
    }
}
