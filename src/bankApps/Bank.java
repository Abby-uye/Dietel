package bankApps;

import exceptions.InvalidAccountNumberException;
import exceptions.InvalidAmountException;
import exceptions.InvalidPinException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String name;
    int accountNumber =0;
    BigDecimal balance;
    private List<BankAccount> accountList = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return name;
    }

    public String getAccountName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public int generateAccountNumber() {
        return ++accountNumber;
    }

    public BankAccount createAccount(String firstName, String lastName, String pin, String phone, BigDecimal balance) {
        String accountName = getAccountName(firstName, lastName);
       int accountNumber = generateAccountNumber();
        BankAccount newAccount = new BankAccount(accountName,pin,phone,accountNumber,balance);
        accountList.add(newAccount);
        return accountList.get(accountList.size()-1);
    }
    public BankAccount findAccount(int accountNumber) throws InvalidAccountNumberException {
        if (! isValidAccountNumber(accountNumber))throw new InvalidAccountNumberException("The Account Number You entered is not valid");
        else {
            for (BankAccount account:accountList) {
                if (account.getNumber(accountNumber) == accountNumber)
                    return account;
            }
        }
        return null;
    }

    public void deposit(BigDecimal amount, int accountNumber) throws InvalidAccountNumberException {
        findAccount(accountNumber).deposit(amount);
    }

    public BigDecimal checkBalance(int accountNumber, String pin) throws InvalidAccountNumberException {
        return findAccount(accountNumber).checkBalance(pin);
    }

    public boolean isValidPin(String pin,int accountNumber) throws InvalidAccountNumberException {
        return findAccount(accountNumber).isValidPin(pin);
    }

    public boolean isValidAccountNumber(int accountNumber) throws InvalidAccountNumberException {
        return findAccount(accountNumber).isValidNumber(accountNumber);
    }

    public void withdraw(String pin, int accountNumber, BigDecimal amount) throws InvalidAccountNumberException {
        findAccount(accountNumber).withdraw(pin, amount);
    }
    public void removeAccount(int accountNumber, String pin) {
        accountList.removeIf(account -> accountNumber == account.getNumber(accountNumber));
    }
    public  boolean isValidAmount(BigDecimal amount){
        return amount.compareTo(BigDecimal.ZERO) >0;
    }

    public void transfer(String pin,BigDecimal amount,int yourAccountNumber,int accountNumberToTransferTo) throws InvalidAccountNumberException {
        if( !isValidPin(pin, yourAccountNumber)) throw  new InvalidPinException("Wrong pin enter a correct pin and try again");
       else if (! isValidAmount(amount)) throw  new InvalidAmountException("The amount must be the amount to transfer must be greater than zero");
       else {
           findAccount(yourAccountNumber).withdraw(pin,amount);
           findAccount(accountNumberToTransferTo).deposit(amount);
        }
    }
}

