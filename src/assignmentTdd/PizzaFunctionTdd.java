package assignmentTdd;

import org.junit.jupiter.api.Test;
import static Assignments.PizzaFunction.*;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaFunctionTdd {
    @Test
    void testThatCanCollectBoxSize() {
        String size = "Medium";
        String actual = boxSizes(size);
        String expected = "Medium";
        assertEquals(expected, actual);

    }

    @Test
    void testThatCanCollectMediumBoxSize() {
        int number = 2;
        int actual = superHungry(number);
        int expected = 2;
        assertEquals(expected, actual);

    }
@Test
    void  testThatCanCollectMediumSize(){
        assertEquals(2, hungry(2));
}
    @Test
    void  testThatCanCollectLargeSize(){
        assertEquals(2, classic(2));
    }
    @Test
    void  testThatCanCalculateLargestSize(){
        assertEquals(8, calculateThatTotalNumberOfSuperHungryGuestWillConsumeTotalNumberOfLargestBoxSize(2));
    }
    @Test
    void  testThatCanCalculateLargeSize(){
        assertEquals(4,calculateThatTotalNumberOfHungryGuestWillConsumeTotalNumberOfLargeBoxSize(2));
    }
    @Test
    void  testThatCanCalculateSize(){
        assertEquals(2, calculateThatTotalNumberOfClassicGuestWillConsumeTotalNumberOfClassicBoxSize(2));
    }
    @Test
    void testThatCanCalculateTheToTalNumberOfSlicesThatTHeUserWillNeed() {
        assertEquals(32, calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(5,5 , 2));
    }
    @Test
    void testThatCanCalculateTheNumberOfLargestBoxesThatTheCustomerNeedsToBuyToBuy(){
        assertEquals(2, calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,4,0),10));
    }
    @Test
    void testThatCanCalculatTheNumberOfLargeBoxesThatTheCustomerNeedsToBuyToBuy(){
        assertEquals(2, calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,4,0),10));
    }
    @Test

    void testThatCanCalculatTheNumberOfSmallBoxesThatTheCustomerNeedsToBuyToBuy(){
        assertEquals(2, calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,4,0),10));
    }
@Test
    void testThatCanCalculateThatNumberOfLargestBoxesContainNumberOfSlices(){
        assertEquals(30, calculateLargestBoxesContainTotalNumberOfSlices(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(2,4,1),10)));
}
    @ Test
    void testThatCanCalculateNumberOfLargestBoxToRecommendToCustomerToPurchase(){
        assertEquals(2,calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,4,0),10));
    }
    @ Test
    void testThatCanCalculateThatLargestBoxesContainTotalNumberOfSlices(){
        assertEquals(20,calculateLargestBoxesContainTotalNumberOfSlices(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,4,0),10)));
    }
    @ Test
    void testThatCanCalculateThatMediumBoxesContainTotalNumberOfSlices(){
        assertEquals(12,calculateMediumBoxesContainTotalNumberOfSlices(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(5,0,0),10)));
    }
    @ Test
    void testThatCanCalculateThatSmallBoxesContainTotalNumberOfSlices(){
        assertEquals(8,calculateSmallBoxesContainTotalNumberOfSlices(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(5,0,0),10)));
    }
    @Test
    void testThatCanGetLeftOverSlicesFromLargestBoxes(){
        assertEquals(9, leftOverSlicesForLargestBox(calculateMediumBoxesContainTotalNumberOfSlices(calculateNumberOfLargeBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(2,4,1),10)), calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(2, 4, 1)));
    }
//   @Test
//   void testThatCanGetLeftOverFromLargeBoxes(){
//        assertEquals(3,leftOverSlicesForLargestBox(calculateMediumBoxesContainTotalNumberOfSlices(calculateNumberOfLargeBoxToRecommendToCustomerToPurchase(calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(0,5,0),5))));
//   }
//    @Test
//    void testThatCanGetLeftOverFromMediumBoxes(){
//        assertEquals(3,leftOverSlicesForLargestBox());
//
//    }
//@Test
//    void testThatCanCalculatePrice(){
//        assertEquals(15000,calculatePrice(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(21,10)));
//}
//@Test
//    void testThatMediumBoxesContainTotalNumberOfSlices(){
//      assertEquals(20,calculateMediumBoxesContainTotalNumberOfSlices(calculateLargeBoxSize()));
//}
}