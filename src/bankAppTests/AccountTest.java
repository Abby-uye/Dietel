package bankAppTests;

import bankApps.BankAccount;
import exceptions.InsufficientFundsException;
import exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

@Test
void testThatCanGetAccountName(){
    BankAccount bankAccount = new BankAccount("uye","pin","0909",1, BigDecimal.valueOf(0));
    assertEquals("uye", bankAccount.getName());
}
@Test
    void testThatCanDeposit1kAndBalanceIs1K(){
    BankAccount bankAccount = new BankAccount("talia","pin","0909",1, BigDecimal.valueOf(0));
    bankAccount.deposit(BigDecimal.valueOf(1000));
    assertEquals(BigDecimal.valueOf(1000), bankAccount.checkBalance("pin"));
}

    @Test
    void testThatCanDepositTwiceAndBalanceWillIncrease() {
        BankAccount bankAccount = new BankAccount("talia", "pin","0909",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(1000));
        bankAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(3000), bankAccount.checkBalance("pin"));
    }

    @Test
    void testThatIsValidPin(){
        BankAccount bankAccount = new BankAccount("talia", "pin","0909",1, BigDecimal.valueOf(0));
        assertTrue(bankAccount.isValidPin("pin"));
    }
//    @Test
//    void testThatIsValidNumber(){
//        Account account = new Account("talia", "090","pin");
//        assertTrue(account.isValidNumber(111));
//    }
    @Test
    void testThatCanDepositAndWithdrawAndCheckBalanceAndBalanceWillChange() throws InvalidPinException{
        BankAccount bankAccount = new BankAccount("talia", "pin","090",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(1000));
        bankAccount.withdraw("pin",BigDecimal.valueOf(1000));
        assertEquals( bankAccount.checkBalance("pin"),BigDecimal.valueOf(0));
    }
    @Test
    void testThatCannotWithdrawWithoutIsValidNumber(){
        BankAccount bankAccount = new BankAccount("talia", "pin","0907",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(1000));
        bankAccount.withdraw("pin",BigDecimal.valueOf(1000));
        assertEquals(BigDecimal.valueOf(0), bankAccount.checkBalance("pin"));
    }
    @Test
    void testThatCannnotCheckBalanceIfPinIsNotValid(){
        BankAccount bankAccount = new BankAccount("uye","pin","0909",1, BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(0), bankAccount.checkBalance("pin"));
    }
    @Test
    void testThatCanCatchInvalidPinException()throws InvalidPinException{
        BankAccount bankAccount = new BankAccount("talia", "pin","0909",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(1000));
        bankAccount.withdraw("pin",BigDecimal.valueOf(1000));
        assertThrows(InvalidPinException.class,()->{
            bankAccount.checkBalance("pi");});
    }
    @Test
    void testThatCannotDepositInvalidAmount(){
        BankAccount bankAccount = new BankAccount("uye","pin","0909",1, BigDecimal.valueOf(0));
        assertTrue(bankAccount.isValidAmount(BigDecimal.valueOf(700)));
    }
    @Test
    void testThatIsInsufficientFunds(){
        BankAccount bankAccount = new BankAccount("uye","pin","09098",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(200));
        assertFalse(bankAccount.insufficientFunds(BigDecimal.valueOf(100)));

    }
    @Test
    void testThatIfUserTriesToWithdrawMoreThanBalanceAccountThrowsInsufficientFundsException()throws InsufficientFundsException{
        BankAccount bankAccount = new BankAccount("uye","pin","0909",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(200));
        assertThrows(InsufficientFundsException.class,()-> {
            bankAccount.withdraw("pin",BigDecimal.valueOf(600));});
    }
    @Test
    void testThatIfUserTriesToWithdrawWithInvalidPinAccountThrowsInsufficientFundsException()throws InvalidPinException{
        BankAccount bankAccount = new BankAccount("uye","pin","0909",1, BigDecimal.valueOf(0));
        bankAccount.deposit(BigDecimal.valueOf(2000));
        assertThrows(InvalidPinException.class,()-> {bankAccount.withdraw("pi",BigDecimal.valueOf(100));});
    }

}