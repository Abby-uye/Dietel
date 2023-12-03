package bankAppTests;
import bankApps.Bank;
import bankApps.BankAccount;
import exceptions.InsufficientFundsException;
import exceptions.InvalidAccountNumberException;
import exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void testThatCanGetBankName(){
        Bank bliss = new Bank("bliss");
        assertEquals("bliss",bliss.getBankName());
    }
    @Test
    void testThatCanCreateAccountName(){
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        assertEquals("Abby Uye",bliss.getAccountName("Abby","Uye"));
       assertEquals("Abby uye",account1.getName());
    }  @Test
    void testThatCanFindAccountWithAccountNumber() throws InvalidAccountNumberException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        assertEquals(account1,bliss.findAccount(1));
    }@Test
    void testThatCanCreateTwoAccountsAndCanFindTheSecondAccountCreated() throws InvalidAccountNumberException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        BankAccount account2 = bliss.createAccount("ogechi", "okoro", "size", "09087");
        assertEquals(account2,bliss.findAccount(2));
    }
    @Test
    void testThatCanDepositToAccountFromBank() throws InvalidAccountNumberException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        bliss.deposit(BigDecimal.valueOf(4000),1);
        assertEquals(BigDecimal.valueOf(4000),bliss.checkBalance(1,"pin"));
    } @Test
    void testThatCannotDepositNegativeAmountToAccountFromBank() throws InvalidAmountException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        assertThrows(InvalidAmountException.class,()->bliss.deposit(BigDecimal.valueOf(-4000),1));
    }

    @Test
    void testThatCanDepositToAccountFromBankAndWithdrawFromAccount()  {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        bliss.deposit(BigDecimal.valueOf(4000), 1);
        bliss.withdraw("pin",1,BigDecimal.valueOf(2500));
        assertEquals(BigDecimal.valueOf(1500), bliss.checkBalance(1, "pin"));
    }@Test
    void testThatThrowsIsufficientFundsExceptionWhenYouTryToWithdrawAmountGreaterThanBalance()throws InsufficientFundsException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        bliss.deposit(BigDecimal.valueOf(4000), 1);
        assertThrows(InsufficientFundsException.class,()->bliss.withdraw("pin",1,BigDecimal.valueOf(4500)));
    }
    @Test
    void testThatCanTransferFromoneAccountToAnotherAccount() {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Abby", "uye", "pin", "090876");
        BankAccount account2 = bliss.createAccount("Uye","Abby","ok","090876");
        bliss.deposit(BigDecimal.valueOf(2500),1);
        bliss.withdraw("pin",1,BigDecimal.valueOf(1500));
        bliss.deposit(BigDecimal.valueOf(1500),2);
        assertEquals(BigDecimal.valueOf(1000),bliss.checkBalance(1,"pin"));
        assertEquals(BigDecimal.valueOf(1500),bliss.checkBalance(2,"ok"));
    }
    @Test
    void testThatCanRemoveAccountFromAccountList() throws  InvalidAccountNumberException {
        Bank bliss = new Bank("bliss");
        BankAccount account1 = bliss.createAccount("Ab", "u", "pi", "09087");
        BankAccount account2 = bliss.createAccount("A", "uy", "p", "0908");
        BankAccount account3 = bliss.createAccount("Abby", "uye", "pin", "090876");
        bliss.deposit(BigDecimal.valueOf(1000),1);
//        bliss.removeAccount(1,"p");
        assertEquals(BigDecimal.valueOf(1000),bliss.checkBalance(1,"pi"));

    }
}