package tdd;

import Assignments.NewJavaQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewJavaQueueTdd {
    @Test
    void testThatCanAddToQueue(){
        NewJavaQueue queue = new NewJavaQueue();
        assertTrue(queue.add("Uye"));
        assertTrue(queue.add("Uye"));

    }
    @Test
    void testThatCannotAddToQueueWhenQueueIsFull(){
        NewJavaQueue queue = new NewJavaQueue();
        assertTrue(queue.add("Uye"));
        assertTrue(queue.add("Uye"));
        assertTrue(queue.add("Uye"));
    }
    @Test
    void testThatCanReturnElement(){
        NewJavaQueue queue = new NewJavaQueue();
        queue.add("Uye");
        queue.add("Abby");
        queue.add("Talia");
        assertEquals("Talia",queue.element());
    }

}
