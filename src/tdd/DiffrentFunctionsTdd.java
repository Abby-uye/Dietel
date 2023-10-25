package tdd;

import ClassWork.DiffrentFunctions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiffrentFunctionsTdd {
    @Test
    void testThatCanReverseString(){
        DiffrentFunctions reverse = new DiffrentFunctions();
        String actual = DiffrentFunctions.reversWord("we outside");
        String expected = "ew edistuo";
        assertEquals(expected,actual);
    }
    @Test
    void  testThatpalindrome(){
        DiffrentFunctions palindrome = new DiffrentFunctions();
        String actual = String.valueOf(DiffrentFunctions.palindrome("dad"));
        assertTrue(Boolean.parseBoolean(actual));
    }
@Test
    void testThatCanremoveDuplicate(){
    DiffrentFunctions removeDuplicate = new DiffrentFunctions();
    String actual = Arrays.toString(DiffrentFunctions.removeDuplicate(new int[]{1, 2, 3, 3, 2, 4, 5, 6}));
    int[] expected = {3,2};
    assertEquals(expected,actual);
}

@Test
    void testThatCanCheckArray(){

        DiffrentFunctions removeDuplicate = new DiffrentFunctions();
        String actual = String.valueOf(DiffrentFunctions.checkArray(new int[]{1, 2, 3,},2));
        assertTrue(Boolean.parseBoolean(actual));

}

}
