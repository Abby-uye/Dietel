package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        String numberOfAsteriksWant = "";
        for(int count =0;count <5;count++){
            System.out.println("Enter the number of asterisks to print");
            userInput = input.nextInt();
            numberOfAsteriksWant += userInput;
        }
        System.out.println(numberOfAsteriksWant);
for (int number = 0; number < numberOfAsteriksWant.length(); number++){
    String character = String.valueOf(numberOfAsteriksWant.charAt(number));
    int num = Integer.parseInt(character);
    for (int shape = 0; shape < num; shape++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
