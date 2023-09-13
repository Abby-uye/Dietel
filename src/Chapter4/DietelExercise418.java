package Chapter4;

import java.util.Scanner;

public class DietelExercise418 {
    public static void main(String[] args) {
        Scanner credit = new Scanner(System.in);
        System.out.println("Enter your account number:");
        int accountNumber = credit.nextInt();

        System.out.println("Enter your balance at the beginning of the month:");
        int balance = credit.nextInt();

        System.out.println("Enter all the items you charged this month:");
        int items = credit.nextInt();

        System.out.println("Enter the total of all credits applied to your account this month:");
        int totalCredit = credit.nextInt();

        System.out.println("Enter your allowed credit limit");
        int creditLimit = credit.nextInt();

        int newBalance = balance + items - totalCredit;

        System.out.println("Your new balance is "+newBalance);

        if (newBalance > creditLimit) {
            System.out.println("credit limit Exceeded");


        }
    }
}