package Chapter2;

import java.util.Scanner;

public class DietelExercise230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five random numbers: ");
        int userInput = input.nextInt();
      int  digitEnteredByUser1 = userInput /10000%10;
      int digitEnteredByuser2 = userInput /1000%10;
      int digitEnteredByuser3 = userInput /100%10;
      int digitEnteredByuser4 = userInput /10%10;
      int digitEnteredByuser5 = userInput %10;
      System.out.printf("%d %d %d %d %d ", digitEnteredByUser1,digitEnteredByuser2,digitEnteredByuser3,digitEnteredByuser4,digitEnteredByuser5);

        if (userInput < userInput /10000%10 ){
            System.out.println("the digits you entered is not up to five");
        } else if (userInput > userInput /10000%10 ) {
            System.out.println("The digits you entered is more than five");

        }





    }

}
