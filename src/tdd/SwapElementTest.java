package tdd;

import ClassWork.SwapElementsOfAnarray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapElementTest {
    @Test
    void testThatElementsCanSwap(){
        SwapElementsOfAnarray swap = new SwapElementsOfAnarray();
        int[] numbersToSwap = {1,2,3,4,5};
        int firstNumber = 0;
        int secondNumber = 2;
        int[] result = SwapElementsOfAnarray.swap(numbersToSwap,firstNumber,secondNumber);
        int []expected = new int[]{3, 2, 1, 4, 5};
        assertArrayEquals(expected,result);
    }
}
