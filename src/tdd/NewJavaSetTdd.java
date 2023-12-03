package tdd;

import Assignments.NewJavaSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewJavaSetTdd {
    @Test
    void testThatCanAddToSet(){
        NewJavaSet set = new NewJavaSet();
        assertTrue(set.add("Money"));
    }
    @Test
    void testThatCannotAddDuplicateElementsToSet(){
        NewJavaSet set = new NewJavaSet();
        assertTrue(set.add("Money"));
      assertTrue(set.add("Money"));
    }
    @Test
    void testThatClearMySet(){
        NewJavaSet set = new NewJavaSet();
        set.add("Uye");
        String [] expected = new String[0];
        assertArrayEquals(expected,set.clear());
    }
    @Test
    void testThatMySetContainsElement(){
        NewJavaSet set = new NewJavaSet();
        set.add("Uye");
        set.add("Abby");
        set.add("U");
        set.add("Talia");
        set.add("Abi");
        assertTrue(set.contains("Talia"));
    }
}
