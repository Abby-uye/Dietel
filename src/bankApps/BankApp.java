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
    public static BankAccount createAccount(){
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter your  first name");
        firstName = userInput.nextLine();
        JOptionPane.showMessageDialog(null,"Enter your last name");
        lastName = userInput.nextLine();
        JOptionPane.showMessageDialog(null,"Enter a new pin");
        pin = userInput.nextLine();
        JOptionPane.showMessageDialog(null,"Enter your Phone number");
        phone = userInput.nextLine();
       return thisBank.createAccount(firstName,lastName,pin,phone,balance);
    }
    public static void mainManu(){
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, """
                Hello Ravenite
               To withdraw  Press 1\s
               To Deposit   Press 2
               To Transfer  press 3
               To Check balance press 4
                """);
        String input = userInput.nextLine();
        switch (input){
            case "1" -> withdraw();
            case "2" -> deposit();
            case "3" -> transfer();
            case "4" -> checkBalance();
            default -> mainManu();
        }

    }

    private static BigDecimal checkBalance() throws InvalidAccountNumberException {
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Please Enter your pin");
        pin = userInput.nextLine();
        JOptionPane.showMessageDialog(null, "Please Enter your Account number");
        int accountNumber = userInput.nextInt();
        return thisBank.checkBalance(accountNumber,pin);
    }

    private static void transfer() throws InvalidAccountNumberException {
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Please Enter your pin");
        pin = userInput.nextLine();
        JOptionPane.showMessageDialog(null, "Please enter the amount you want to transfer");
        BigDecimal amount = userInput.nextBigDecimal();
        JOptionPane.showMessageDialog(null, "Please Enter your Account number");
        accountNumber = userInput.nextInt();
        JOptionPane.showMessageDialog(null, "Please the account number you want to transfer to");
        int accountNumberToTransferTo = userInput.nextInt();
        thisBank.transfer(pin,amount,accountNumber,accountNumberToTransferTo);
    }

    private static void deposit() throws InvalidAccountNumberException {
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
        BigDecimal amount = userInput.nextBigDecimal();
        JOptionPane.showMessageDialog(null, "Please Enter your Account number");
        accountNumber = userInput.nextInt();
        thisBank.deposit(amount,accountNumber);
    }

    private static void withdraw() throws InvalidAccountNumberException {
        Scanner userInput = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Please Enter your pin");
        pin = userInput.nextLine();
        JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
        BigDecimal amount = userInput.nextBigDecimal();
        JOptionPane.showMessageDialog(null, "Please Enter your Account number");
        accountNumber = userInput.nextInt();
       thisBank.withdraw(pin,accountNumber,amount);
    }


    public static void main(String[] args) {



    }
}
