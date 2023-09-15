package Chapter4;

public class DietelExercise418 {

    private int  accountNumber;
    private int balance;
    private int total;
    private int totalCreditApplied;
    private int creditLimit;
    private int newBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalanceAtTheBeginingOfTheMonth(int balance) {
        this.balance = balance;


    }

    public int getBalanceAtTheBeginningOfTheMonth() {
        return balance;
    }

    public void setTotalItemsCharged(int total) {
        this.total = total;
        
    }
    public int getTotalItemscharged(){
        return total;
    }
    public void setTotalCreditsAppliedtoAccount(int totalCredit) {
        this.totalCreditApplied = totalCredit;
        
    }

    public int getTotalCreditAppliedToaccount() {
        return totalCreditApplied;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;

    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setNewBalance() {
        this.newBalance = balance + total -totalCreditApplied;
        if (newBalance > creditLimit) System.out.println("Credit limit exceeded");
    }


    public int getNewbalance() {
        return balance;
    }
}

