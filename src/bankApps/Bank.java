package bankApps;

import exceptions.InvalidAccountNumberException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String name;
    int accountNumber =0;
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

    public BankAccount createAccount(String firstName, String lastName, String pin, String phone ) {
        String accountName = getAccountName(firstName, lastName);
       int accountNumber = generateAccountNumber();
        BankAccount newAccount = new BankAccount(accountName,pin,phone,accountNumber);
        accountList.add(newAccount);
        return accountList.get(accountList.size()-1);
    }

    public void deposit(BigDecimal amount, int accountNumber) {
        accountList.get(accountNumber-1).deposit(amount);
    }

    public BigDecimal checkBalance(int acccountNumber, String pin) {
        return accountList.get(acccountNumber-1).checkBalance(pin);
    }

    public boolean isValidPin(String pin) {
        return accountList.get(accountNumber-1).isValidPin(pin);
    }

    public boolean isValidAccountNumber(int accountNumber) {
        return accountList.get(accountNumber-1).isValidNumber(accountNumber);
    }

    public void withdraw(String pin, int accountNumber, BigDecimal amount) {
        accountList.get(accountNumber-1).withdraw(pin, amount);
    }


    public Object findAccount(int accountNumber) throws InvalidAccountNumberException {
        for (BankAccount account:accountList ) {
            if (account.getNumber(accountNumber)== accountNumber){
                return account;
            }
        }
        return isvalidAccountNumber();
    }

    private boolean isvalidAccountNumber() throws InvalidAccountNumberException {
        throw new InvalidAccountNumberException("Invalid account number, please enter a valid account number");
    }

    public void removeAccount(int accountNumber, String pin) {
        accountList.removeIf(account -> accountNumber == account.getNumber(accountNumber));
    }

}

