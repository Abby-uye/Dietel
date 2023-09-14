package tdd;

import Chapter4.DietelExercise417;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DietelExercise417Tdd {
     @Test
  public  void checkIfClassExist() {
         DietelExercise417 driver = new DietelExercise417();
         assertNotNull(driver);
     }
        @Test
         public  void testIfYouCanSetMile(){
            DietelExercise417 driver = new DietelExercise417();
            driver.setMiles(200);
            assertEquals(200,driver.getMiles());
         }

         @Test
    void testIfICanSetGallon(){
         DietelExercise417 driver = new DietelExercise417();
         driver.setGallon(15);
         assertEquals(15, driver.getGallon());
         }

        @Test
    void testAmountUsedPerTrip(){
         DietelExercise417 driver = new DietelExercise417();
         driver.setMiles(290);
         driver.setGallon(20);
         assertEquals(14.5,driver.amountUsed(290,14));

    }
    }

