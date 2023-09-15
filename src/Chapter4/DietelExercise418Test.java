    package Chapter4;

import java.util.Scanner;

public class DietelExercise418Test {
    public static void main(String[] args) {
        Scanner credit = new Scanner(System.in);
        DietelExercise418 customer = new DietelExercise418();
        System.out.println("Enter your account number:");
        int accountNumber = credit.nextInt();
        customer.setAccountNumber(accountNumber);
        System.out.println(customer.getAccountNumber());

        System.out.println("Enter your balance at the beginning of the month:");
        int balance = credit.nextInt();
        customer.setBalanceAtTheBeginingOfTheMonth(balance);
        System.out.println(customer.getBalanceAtTheBeginningOfTheMonth());

        System.out.println("Enter all the items you charged this month:");
        int items = credit.nextInt();
        customer.setTotalItemsCharged(items);
        System.out.println(customer.getTotalItemscharged());

        System.out.println("Enter the total of all credits applied to your account this month:");
        int totalCredit = credit.nextInt();
        customer.setTotalCreditsAppliedtoAccount(totalCredit);
        System.out.println(customer.getTotalCreditAppliedToaccount());

        System.out.println("Enter your allowed credit limit");
        int creditLimit = credit.nextInt();
        customer.setCreditLimit(creditLimit);
        System.out.println(customer.getCreditLimit());

        System.out.println(customer.getNewbalance());


    }
}