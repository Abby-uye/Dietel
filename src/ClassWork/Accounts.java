package ClassWork;

public class Accounts {
    private int balance;

    public void deposit(int balance) {
        this.balance += balance;

    }
    public void withdrawal(int withdrawal) {

        if (balance > withdrawal) {
            balance -= withdrawal;
        }

        else if ( balance < withdrawal)
        System.out.println(" insufficient funds");

        }
    public int checkBalance() {
        return balance;
    }
}