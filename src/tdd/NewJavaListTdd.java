package tdd;

import Assignments.NewJavaList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewJavaListTdd {
    @Test
    void testThatListIsEmpty(){
        NewJavaList strings = new NewJavaList();
        assertTrue(strings.isEmpty());

    }
@Test
    void testThatCanAddElementToMyList(){
    NewJavaList strings = new NewJavaList();
    strings.add("Abby");
    strings.add("Uye");
    assertFalse(strings.isEmpty());
}
    @Test
    void testThatCanAddElementToMyListAtAParticularIndex(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Checker",1);
        assertEquals("Checker",strings.get(1));
        assertEquals("Uye",strings.get(2));
    }
    @Test
    void testThatCanGetElementFromMyList(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Money",3);
        strings.add("Hello",2);
        strings.add("Hey",2);
        String actual = strings.get(2);
        String expected = "Hello";
        assertEquals(expected,actual);
    }
    @Test
    void testThatCanRemoveElementFromMyList(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.remove(1);
        String actual = strings.get(1);
        assertNull(actual);
    }
    @Test
    void testThatCanSetElementAtAParticularElementInMyList(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.set(1,"Talia");
        String actual = strings.get(1);
        assertNull(actual);
    }
    @Test
    void testThatCanSetCopyOfInitialArrayWithNewLength(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        String actual = strings.get(1);
        assertNull(actual);
    }
    @Test
    void testThatCanGetlistSize(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Hey");
        strings.add("u");
        assertEquals(4,strings.size);
    }
    @Test
    void testThatCanGetlistIndex(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Hey");
        strings.add("u");
        assertEquals(2,strings.indexOf("Hey"));
    }
    @Test
    void testThatCanCheckIfListContainsElement(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Hey");
        strings.add("u");
        assertTrue(strings.contains("Hey"));
    }
    @Test
    void testThatCanClearList(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Hey");
        strings.add("u");
        assertEquals("Abby",strings.get(0));
        strings.clear();
        assertArrayEquals(new String[0],strings.clear());
//        assertEquals("Abby",strings.get(0));

    }
    @Test
    void testThatCan(){
        NewJavaList strings = new NewJavaList();
        strings.add("Abby");
        strings.add("Uye");
        strings.add("Hey");
        strings.add("u");
        assertEquals(2,strings.indexOf("Hey"));
    }
}
