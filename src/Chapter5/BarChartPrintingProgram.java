package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        String numberOfAsteriskEnteredByUser = "";
        for(int count =0;count <5;count++){
            System.out.println("Enter the number of asterisks to print");
            userInput = input.nextInt();
            numberOfAsteriskEnteredByUser += userInput;
        }
        System.out.println(numberOfAsteriskEnteredByUser);
for (int index = 0; index < numberOfAsteriskEnteredByUser.length(); index++){
    String character = String.valueOf(numberOfAsteriskEnteredByUser.charAt(index));
    int num = Integer.parseInt(character);
    for (int shape = 0; shape < num; shape++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
