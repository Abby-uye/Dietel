package chapter7Tdd;

import chapter7.DuplicateElimination;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateEliminationUnitTest {
//    @BeforeEach
//    public void beforeEach(){
//        DuplicateElimination duplicateElimination = new DuplicateElimination();
//    }
    @Test
    void testThatCanInitializeArrayElementsToMinus1(){
        DuplicateElimination duplicateElimination = new DuplicateElimination();
        int [] numbers = new int[10];
        int [] initializedNumbers ={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        assertArrayEquals(initializedNumbers,duplicateElimination.initializeArrayToMinusOne(numbers));
    }
        @Test
        void testThatCanChangeArrayElementsToUserInputs(){
            DuplicateElimination duplicateElimination = new DuplicateElimination();
            int [] numbers = new int[10];
            int [] initializedNumbers ={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
            assertArrayEquals(initializedNumbers,duplicateElimination.initializeArrayToMinusOne(numbers));
            for (int row = 0; row < initializedNumbers.length; row++) {
                initializedNumbers[row] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number that is >= 10 and <=100"));
            }
            int[] returnedArray = {25,30,76,20,78,90,85};
            assertArrayEquals(returnedArray,duplicateElimination.removeDuplicate(initializedNumbers));

        }


}

