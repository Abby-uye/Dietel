package Chapter4;

import java.util.Scanner;

public class DietelExercise419 {
    public static void main(String[] args) {
        Scanner sales = new Scanner(System.in);
       int  salary = 200;
       int totalSales = 0;
       int userInput = 0;
       while ( userInput != -1){
           System.out.println("Enter the number of items you sold");
           userInput= sales.nextInt();
           totalSales = totalSales + userInput;

       }int bonus = totalSales * 9 / 100;
        int netPay = salary + bonus;
        System.out.println("Your pay for the month of March is "+netPay);
    }
}
