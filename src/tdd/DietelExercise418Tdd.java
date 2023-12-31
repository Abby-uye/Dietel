package tdd;

import Chapter4.DietelExercise418;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DietelExercise418Tdd {
     @Test
    public void testIfIHaveAClass(){
         DietelExercise418 test = new DietelExercise418();
         assertNotNull(test);

    }

    @Test
    public void testThatIHaveAccountNumber(){
         DietelExercise418 test = new DietelExercise418();
         test.setAccountNumber(2073654);
         assertEquals(2073654,test.getAccountNumber());
         test.setBalanceAtTheBeginingOfTheMonth(500);
         assertEquals(500,test.getBalanceAtTheBeginningOfTheMonth());
         test.setTotalItemsCharged(500);

    }

            @Test
    public void testTotalOfAllCreditsApplied(){
         DietelExercise418 test = new DietelExercise418();
         test.setTotalCreditsAppliedtoAccount(400);
         assertEquals(400,test.getTotalCreditAppliedToaccount());
     }
        @Test
    public void testAllowedCreditLimit(){
         DietelExercise418 test = new DietelExercise418();
         test.setCreditLimit(500);
         assertEquals(500,test.getCreditLimit());

     }
        @Test
    public void testIfCanCalculate(){
         DietelExercise418 test= new DietelExercise418();
         test.setBalanceAtTheBeginingOfTheMonth(500);
         assertEquals(500,test.getBalanceAtTheBeginningOfTheMonth());
         test.setTotalItemsCharged(300);
         assertEquals(300,test.getTotalItemscharged());
         test.setTotalCreditsAppliedtoAccount(200);
         test.setNewBalance();
         assertEquals(500,test.getNewbalance());
        }


}

