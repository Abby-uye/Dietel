package tdd;

import Assignments.TestDrillerUtme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDrillerUtmeTdd {
    @Test
    void testThatIHAveAClass(){
        TestDrillerUtme student = new TestDrillerUtme();
        assertNotNull(student);

        }
    @Test
    void testThat1To4CopiesIs2000Each(){
        int amount = TestDrillerUtme.testdriller(4);
        assertEquals(8000,amount);
    }
    @Test
    void testThat5To9CopiesIs1800Each(){
        int amount = TestDrillerUtme.testdriller(7);
            assertEquals(12600,amount);
        }
        @Test
    void testThat10To29CopiesIs1600Each(){
        int amount = TestDrillerUtme.testdriller(28);
        assertEquals(44800,amount);
        }
    @Test
    void testThat30To49CopiesIs1500Each(){
        int amount = TestDrillerUtme.testdriller(39);
            assertEquals(58500,amount);
        }
    @Test
    void testThat50To69CopiesIs1300Each(){
        int amount = TestDrillerUtme.testdriller(68);
        assertEquals(88400,amount);
    }
@Test
    void testThat100To199CopiesIs1200Each(){
        int amount = TestDrillerUtme.testdriller(199);
        assertEquals(238800,amount);
}
@Test
    void testThat200To499IsCopiesEach(){
        int amount = TestDrillerUtme.testdriller(375);
        assertEquals(412500,amount);
}
@Test
    void testthat500CopiesAndAboveis100Each(){
        int amount = TestDrillerUtme.testdriller(532);
        assertEquals(532000,amount);
}
}


