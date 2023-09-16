package Chapter4;

import java.util.Scanner;

public class DietelExercise423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int   counter = 0;
      int input = 0;
      int largest= 0;
      while (counter <= 10){
          System.out.println("enter ten random numbers to check the largest number ");
          input = scanner.nextInt();
          if (input > largest ){
              largest = input;
              System.out.println(largest);

          }
          counter++;
      }System.out.println("the largest number is " + largest);

    }
}
