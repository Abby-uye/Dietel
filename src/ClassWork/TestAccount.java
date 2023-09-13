package ClassWork;

public class TestAccount {
    public static void main(String[] args) {
        Accounts account = new Accounts();
        account.deposit(10000);
         account.withdrawal(3000);
         System.out.println(account.checkBalance());
    }
}
