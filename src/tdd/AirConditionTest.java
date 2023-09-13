package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    void testIfIHaveAc() {
        AirCondition hisense = new AirCondition();
        assertNotNull(true);
    }

    @Test
    void testIfICanTurnOffAc() {
        AirCondition hisense = new AirCondition();
        hisense.toggle();
        assertTrue(hisense.isOn());
        hisense.toggle();
        assertFalse(hisense.isOn());
    }

    @Test
    void testThatTemperatureCanBeIncreased() {
        AirCondition lg = new AirCondition();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(16, lg.checkTemperature());
    }
    @Test
    void testIfAcCanDecreaseTemperature(){
        AirCondition hisense = new AirCondition();
        hisense.isOn();
                assertTrue(true);
                hisense.decreaseTemperature();
                hisense.decreaseTemperature();
                assertEquals(16,hisense.checkTemperature());
    }
    @Test
    public void testThatAirConditionerCanWorkWhenNotOn(){
        AirCondition myAc = new AirCondition();
        myAc.toggle();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(18,myAc.checkTemperature());
    }
}









