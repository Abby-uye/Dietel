import java.util.Scanner;
public class NumberType {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = number.nextInt();
        if (userInput % 2 != 0) {
            System.out.printf( "%d%s ",userInput," is an odd number");
        }
        if (userInput % 2 == 0) {
            System.out.printf("%d%s",userInput," is an even number");

        }
    }
}