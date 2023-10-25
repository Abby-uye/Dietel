package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        for(int count =0;count <5;count++){
            System.out.println("Enter the number of asterisks to print");
            userInput = input.nextInt();
            for (int asterisks =0;asterisks<userInput;asterisks++){
                System.out.print("* ");
            }



            System.out.println();
        }
        System.out.print("*");
    }
}
