package tdd;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int balance() {
        return balance;

    }

    public int deposit(int money) {
        balance = balance + money;
        return balance;
    }


    public int withdraw(int withdraw) {
        balance = balance - withdraw;
        return balance;
    }


    public int withdrawal2(int withdrawBalance) {

        if (balance < withdrawBalance) {
            System.out.println("insufficient funds");

        }
    return balance;
    }

}



