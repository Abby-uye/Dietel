package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountTest {
@Test
void testIfAccountExist(){
    Account1 abby = new Account1(0);
}
@Test
    void testIfBalanceExist(){
    Account1 abby = new Account1(0);
    assertNotNull(0);
}
    @Test
    void testIfDepositExist(){
    Account1 abby = new Account1(0);
    abby.deposit(20000);
    assertEquals(20000 , abby.balance());
    }
    @Test
    void testDepositFunctions(){
    Account1 uye = new Account1(0);
    uye.deposit(4000);
    uye.deposit(6000);
    uye.deposit(2000);
    assertEquals(12000, uye.balance());
    }

@Test
    void TestIfAccountCanWithdraw(){
    Account1 abby = new Account1(5000);
    abby.withdraw(3000);
    assertEquals(2000,abby.balance());
}
@Test
    void testWithdrawalFunction(){
    Account1 abby = new Account1(10000);
    abby.withdrawal2    (11000);
    assertEquals(10000, abby.balance());
    }


}

