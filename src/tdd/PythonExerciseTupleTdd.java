package tdd;

import Assignments.TupleFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PythonExerciseTupleTdd {
    @Test
    void testThatCanReverseAnArray(){
        TupleFunctions functions = new TupleFunctions();
        String[] numbersToReverse = TupleFunctions.reverseAnArray(new int[]{5, 4, 3, 2, 1});
        String []  reversedArray = {"1","2","3","4","5"};
        assertEquals(reversedArray,numbersToReverse);

    }
    @Test
    void testUnpackingAnArray(){
        TupleFunctions unpack = new TupleFunctions();
       String [] unpacking =  TupleFunctions.unpackTuple(new int[] {10,23,30,40,50});
       String [] unpacked = {"50", "10"};
       assertEquals(unpacked,unpacking);
    }
}
