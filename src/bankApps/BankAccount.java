package bankApps;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;
import exceptions.InvalidPinException;

import java.math.BigDecimal;

public class BankAccount {


    private final String name;
    private String phone = "";

    private BigDecimal balance = BigDecimal.valueOf(0);
    private String pin = "";
    private int number = 0;

    public BankAccount(String name,String pin , String phone, int number) {
        if (phone.matches("\\d+")) {
            this.phone = phone;
        }else  System.out.println("phone number must be digits");
        this.number = number;
        this.pin = pin;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void deposit(BigDecimal amount)throws InvalidAmountException {
        if (!isValidAmount(amount)) throw new InvalidAmountException("Please enter a valid amount");
       else if (amount.compareTo(BigDecimal.ZERO) > 0) balance = balance.add(amount);
    }
    public BigDecimal checkBalance(String pin) {
        if (!isValidPin(pin)) throw new InvalidPinException("Incorrect pin, enter a correct pin");
        else return balance;
    }
    public boolean isValidPin(String pin) {
        return this.pin.equals(pin) ;
    }
    public boolean isValidNumber(int number) {
        return this.number == number;
    }
    public void withdraw(String pin, BigDecimal amount) throws InvalidPinException, InvalidAmountException, InsufficientFundsException {
        if (!(isValidPin(pin))) throw new InvalidPinException("You have Entered an incorrect pin, please check and try again");
         else if (!isValidAmount(amount)) throw new InvalidAmountException("You have entered an invalid amount, please check and enter a valid amount");
         else if (insufficientFunds(amount)) throw new InsufficientFundsException("Insufficient funds");
         else balance = balance.subtract(amount);
    }
    public boolean isValidAmount(BigDecimal amount) {
        String amountString = amount.toString();
        return amountString.matches("^\\d+(\\.\\d+)?$");
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n Name : %s%n Phone:%s%n Balance: ***** Pin: **** Number %d%n%s",
                             "Account Details+",
                "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", name,phone,number,"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public boolean insufficientFunds(BigDecimal amount) {
        return amount.compareTo(balance) > 0;
    }
    public int getNumber(int accountNumber) {
        return number;
    }
}

