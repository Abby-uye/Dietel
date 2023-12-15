package chapter7Tdd;

import chapter7.VariableLengthArgumentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableLengthArgumentListUnitTest {
    @Test
    void testThatCanGetAverageOfVariableLengthArgument(){
        VariableLengthArgumentList variableLengthArgumentList = new VariableLengthArgumentList();
        assertEquals(7.0,variableLengthArgumentList.average(5,7,9));
        assertEquals(17.33,variableLengthArgumentList.average(25,18,9));

    }
}
