package tdd;

import Assignments.PrimeFactors;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTdd {
    @Test
    void testPrimeFactor() {
        PrimeFactors prime = new PrimeFactors();
        int number = 310;
        ArrayList<Integer> expected = PrimeFactors.productOfPrimeFactor(number);
        assertEquals(5, expected.get(1));
    }

    @Test
    void testThatPrimeFactor() {
        int number = 12;
        ArrayList<Integer> expected = PrimeFactors.productOfPrimeFactor(number);
        assertEquals(2, expected.get(0));
        assertEquals(3, expected.get(2));
    }

}
