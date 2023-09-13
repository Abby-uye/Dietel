package tdd;
import java.util.Scanner;
public class UserSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput = input.nextInt();
        int userSquare = userInput * userInput;
        System.out.printf("%s%d%s%d","the square of: ",userInput ," is ", userSquare );
    }
}
