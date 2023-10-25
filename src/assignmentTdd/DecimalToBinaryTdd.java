package assignmentTdd;

import Assignments.DecimalToBinary;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTdd {
    @Test
    void testThatCanGetBinary(){
        ArrayList conversion = DecimalToBinary.decimalToBinaryCheck(13);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(0);
        expected.add(1);
        assertEquals(expected,conversion);

    }
    @Test
    void TestThatCanGetSDecimal() {
        String actual = String.valueOf(DecimalToBinary.binaryToDecimal("101101"));
        int expected = 45;
        assertEquals(expected,actual);
    }

}

