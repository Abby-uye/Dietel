package bankApps;

import exceptions.InvalidAccountNumberException;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class BankApp {
    private static String firstName;;
    private static String lastName;
    private static String phone = "";

    private static BigDecimal balance = BigDecimal.valueOf(0);
    private static String pin = "";
    private static int accountNumber = 0;
    static Bank thisBank = new Bank("Raven");
    public static BankAccount createAccount() throws InvalidAccountNumberException {
        firstName = JOptionPane.showInputDialog(null,"Enter your  first name");
        lastName =  JOptionPane.showInputDialog(null,"Enter your last name");
        pin = JOptionPane.showInputDialog(null,"Enter a new pin");
        phone = JOptionPane.showInputDialog(null,"Enter your Phone number");
       return thisBank.createAccount(firstName,lastName,pin,phone,balance);
    }
    public static void mainManu() throws InvalidAccountNumberException {

        String input = JOptionPane.showInputDialog(null, """
                Hello Ravenite
               To withdraw  Press 1\s
               To Deposit   Press 2
               To Transfer  press 3
               To Check balance press 4
                """);
        switch (input){
            case "1" -> withdraw();
            case "2" -> deposit();
            case "3" -> transfer();
            case "4" -> checkBalance();
            default -> mainManu();
        }

    }

    private static void checkBalance() throws InvalidAccountNumberException {
        pin = JOptionPane.showInputDialog(null, "Please Enter your pin");
        accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your Account number"));
        thisBank.checkBalance(accountNumber,pin);
    }

    private static void transfer() throws InvalidAccountNumberException {
        pin = JOptionPane.showInputDialog(null, "Please Enter your pin");
        String amountInput = JOptionPane.showInputDialog(null, "Please enter the amount you want to transfer");
        BigDecimal amount = new BigDecimal(amountInput);
        accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your Account number"));
        int accountNumberToTransferTo = Integer.parseInt(JOptionPane.showInputDialog(null, "Please the account number you want to transfer to"));
        thisBank.transfer(pin,amount,accountNumber,accountNumberToTransferTo);
    }

    private static void deposit() throws InvalidAccountNumberException {
        String amountInput = JOptionPane.showInputDialog(null, "Please enter the amount you want to deposit");
        BigDecimal amount = new BigDecimal(amountInput);
        accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your Account number"));
        thisBank.deposit(amount,accountNumber);

    }

    private static void withdraw() throws InvalidAccountNumberException {
        pin = JOptionPane.showInputDialog(null, "Please Enter your pin");
        String amountInput = JOptionPane.showInputDialog(null, "Please enter the amount you want to withdraw");
        BigDecimal amount = new BigDecimal(amountInput);
        accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your Account number"));
       thisBank.withdraw(pin,accountNumber,amount);
    }


    public static void main(String[] args) throws InvalidAccountNumberException {
      BankAccount thisAccount =  createAccount();
        System.out.println(thisAccount.toString());
        mainManu();
        System.out.println(thisAccount.toString());
    }
}
