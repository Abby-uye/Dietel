package tdd;

import ClassWork.MultiplicationOperators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationOperatorTdd {
    @Test
    void testMultiplicationOperator(){
        int result = MultiplicationOperators.multiplication(-5,-4);
        assertEquals(20,result);
    }
}
