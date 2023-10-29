package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneTdd {
    @Test
    public void testThatCanAddToLastIndexOfArray(){
        ArrayItemPlus1 plus1 = new ArrayItemPlus1();
       int [] the_array = {1,2,3,4};
       int [] actual  = ArrayItemPlus1.plusOne(the_array);
       int [] expected = {1,2,3,5};
       assertArrayEquals(expected,actual);

    }
}
