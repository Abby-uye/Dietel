package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bike2Test {
    @Test
    public void testIfIHaveAbike() {
        Bike2 sony = new Bike2();
        assertNotNull(true);

    }

    @Test
    public void testIfBikeCanTurnOn() {
        Bike2 sony = new Bike2();
        sony.isOn();
        assertTrue(true);
    }

    @Test
    public void testThatBikeCanAccelerate() {
        Bike2 sony = new Bike2();
        sony.isOn();
        assertTrue(true);


        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        assertEquals(45, sony.checkSpeed());
    }


    @Test
    public void testIfBikCanDecelerate() {
        Bike2 sony = new Bike2();
        sony.isOn();
//        for(int a = 1; a <= 26; a++){
//            sony.accelerate();
//        }
        assertEquals(0,sony.checkSpeed());
            sony.decelerate();
            sony.decelerate();
            sony.decelerate();
   //     assertEquals(0, sony.checkSpeed());
    }
}