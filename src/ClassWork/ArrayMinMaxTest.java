package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMinMaxTest {
    @Test
    void testThaCanSum(){
        ArrayMinMax sum = new ArrayMinMax();
        int sumNumbers = ArrayMinMax.sumOfNumbers(new int[]{1, 2, 3, 4, 5});
        int theExpected =15;
        assertEquals(theExpected,sumNumbers);
    }
@Test
    void testThatCanGetMinimum(){
        ArrayMinMax mini = new ArrayMinMax();
        int minimumChecker = ArrayMinMax.minimumNumber(new int[]{1, 2, 3, 4, 5});
        int minimumSum = 10;
        assertEquals(minimumSum,minimumChecker);
}
@Test
    void testThatCanGetMaximumSum(){
        ArrayMinMax max = new ArrayMinMax();
        int maximumChecker = ArrayMinMax.maximumChecker(new int[]{1,2,3,4,5});
        int maximumSum = 14;
        assertEquals(maximumSum,maximumChecker);
}
}