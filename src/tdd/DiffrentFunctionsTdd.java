package tdd;

import ClassWork.DiffrentFunctions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiffrentFunctionsTdd {
    @Test
    void testThatCanReverseString() {
        String actual = DiffrentFunctions.reversWord("we outside");
        String expected = "ew edistuo";
        assertEquals(expected, actual);
    }

    @Test
    void testThatpalindrome() {
        String actual = String.valueOf(DiffrentFunctions.palindrome("dad"));
        assertTrue(Boolean.parseBoolean(actual));
    }

    @Test
    void testThatCanremoveDuplicate() {
        String actual = Arrays.toString(DiffrentFunctions.removeDuplicate(new int[]{1, 2, 3, 3, 2, 4, 5, 6}));
        int [] expected =  {2,3};
        assertEquals(expected, actual);
    }

    @Test
    void testThatCanCheckArray() {
        String actual = String.valueOf(DiffrentFunctions.checkArray(new int[]{1, 2, 3,}, 2));
        assertTrue(Boolean.parseBoolean(actual));

    }
@Test
    void testThatCanCheckIndexes(){
        boolean actual = DiffrentFunctions.checkIndices("13579",1,2,4);
        assertTrue(actual);

}

}
//@Test
//    void testThatCanGetDominantValuesFromAnArray(){
//int [] numbers = Arrays.toString({dominantElements(new int[]{9, 3, 10, 7, 4})});
//}
//}
