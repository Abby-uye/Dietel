package bankApps;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankApp {
    private  String firstName;;
    private string lastName;
    private String phone = "";

    private BigDecimal balance = BigDecimal.valueOf(0);
    private String pin = "";
    private int number = 0;

    Scanner userInput = new Scanner(System.in);
    Bank thisBank = new Bank("Raven");

    public  BankAccount createAccount(){
        System.out.println("Enter your  first name");
        n = userInput.nextLine();
        System.out.println("Enter your last name");
        name = userInput.nextLine();
        thisBank.createAccount()
    }
    public static void main(String[] args) {



    }
}
