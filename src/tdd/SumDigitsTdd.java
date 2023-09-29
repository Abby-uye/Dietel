package tdd;

import ClassWork.SumDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTdd {
    @Test
    void testThatCanSumDigits(){
        SumDigits sumDigits = new SumDigits();
       long sum = sumDigits.sumDigits(234);
        assertEquals(9,sum);

    }
}
