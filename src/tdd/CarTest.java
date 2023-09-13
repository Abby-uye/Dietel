package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testThatCarExist(){
        Car myCar = new Car();
        assertNotNull(myCar);
    }

}