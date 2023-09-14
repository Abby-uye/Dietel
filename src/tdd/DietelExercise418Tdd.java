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

    }

}
