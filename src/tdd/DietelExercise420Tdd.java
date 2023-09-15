package tdd;

import Chapter4.DietelExercise420;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DietelExercise420Tdd {
    @Test
    void testIfIhaveClass(){
        DietelExercise420 tax = new DietelExercise420();
        assertNotNull(tax);


    }
        @Test
    void testThatIHaveUserHaveName(){
        DietelExercise420 tax = new DietelExercise420();
        tax.setName("uye");
        assertEquals("uye",tax.getName());
        }

    @Test
    void testThatCitiZenhasearnings(){
        DietelExercise420 tax = new DietelExercise420();
        tax.setCitizenEarnings(7000);
        assertEquals(7000,tax.getCitezenEarnings());
    }
    @Test
    void testThatTaxIsCalculated(){
        DietelExercise420 tax = new DietelExercise420();
        tax.calculatedTax(70000);
        assertEquals(1400,tax.getTax());
    }
}
