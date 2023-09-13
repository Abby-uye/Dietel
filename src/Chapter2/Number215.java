package Chapter2;
import java.util.Scanner;
public class Number215 {
    public static void main(String[] args) {
        Scanner arithmetics = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int userInput =arithmetics.nextInt();
        System.out.print(" Enter number : ");
        int userInput2 = arithmetics.nextInt();

        int numberSquare1 = userInput * userInput;
        int numberSquare2 = userInput2 *userInput2;
        int numbersum = userInput2 + numberSquare2;
        int diffrence = userInput- userInput2;
    System.out.printf("%s%d%n%s%d%n%s%d%n%s%d","The square of your number is ", numberSquare1,"The square of your number is ", numberSquare2,"The sum of both numbers is ", numbersum, "The diffrence between both numbers is " ,diffrence);


    }
}
