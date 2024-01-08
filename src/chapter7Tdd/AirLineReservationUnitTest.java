package chapter7Tdd;

import chapter7.AirLineReservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirLineReservationUnitTest {

    @Test
    public void testThatHaveAnArrayThatIsInitializeFalse() {
        AirLineReservation airLineReservation = new AirLineReservation();
        boolean[] emptyPlaneSeats = airLineReservation.getEmptyPlaneSeats();
        for (boolean seats : emptyPlaneSeats) {
            assertFalse(seats);
        }
    }
        @Test
        public void testThatWhenYouAssignASeatToAPassengerPositionBecomesTrue(){
            AirLineReservation airLineReservation = new AirLineReservation();
            boolean[] emptyPlaneSeats = airLineReservation.getEmptyPlaneSeats();
            for (boolean seats : emptyPlaneSeats) {
                assertFalse(seats);
            }
            boolean seat = airLineReservation.assignSeat(1);
            assertTrue(seat);


        }
    }


