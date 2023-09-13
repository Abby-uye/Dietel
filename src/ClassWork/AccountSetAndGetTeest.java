package ClassWork;

import java.util.Scanner;

public class AccountSetAndGetTeest {
    public static void main(String[] args) {
        Scanner acount = new Scanner(System.in);
        AccoutSetAndGet account1 = new AccoutSetAndGet();
        System.out.println("Enter your account name");
        String userName = acount.nextLine();
        account1.setName(userName);

        System.out.println("Enter amount to deposit");
        int depositAmount = acount.nextInt();
        account1.setDeposit(depositAmount);

        System.out.println("Enter amount to withdraw");
        int witdrawalAmount = acount.nextInt();
        account1.setWithdraw(witdrawalAmount);

    System.out.println("your account balance is "+account1.getBalance());

    }
}
