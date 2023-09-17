package tdd;

import Assignments.LogisticRidersPay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogisticsRidersPayTdd {
    @Test
    void testThatIHaveAClass(){
        LogisticRidersPay harry = new LogisticRidersPay();
        assertNotNull(harry);

    }
@Test
    void testThatICanPayRiderThatDeliverdLessThan50(){
        int payment = LogisticRidersPay.paySlip(48);
        assertEquals(12680,payment);
}


@Test
    void testThatrideriCanPayRiderThatDeliverd50to59(){
        int payment = LogisticRidersPay.paySlip(57);
        assertEquals(16400,payment);
}
@Test
    void testThatIcanPayRiderThatDeliverd60to69(){
        int payment = LogisticRidersPay.paySlip(65);
        assertEquals(21250,payment);

}
@Test
    void TestThatICanPayRiderThatdeliverd70andabove(){
        int payment = LogisticRidersPay.paySlip(89);
        assertEquals(49500,payment);
}
}
