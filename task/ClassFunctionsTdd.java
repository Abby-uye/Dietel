package task;

import Assignments.ClassFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassFunctionsTdd {
    @Test
    public void testLargestNumberInAnArray(){
        ClassFunctions largest = new ClassFunctions();
        int listOfNumbers = ClassFunctions.findLargestNumber(new int[]{7, 9, 4, 5, 2});
        int largest1 = 9;
        assertEquals(largest1,listOfNumbers);
    }
@Test
    public void  testReversedArray(){
        ClassFunctions reverse = new ClassFunctions();
        int[] numbersToReverse = ClassFunctions.reverseAnArray(new int[]{1, 2, 3, 4, 5, 6});
        int [] reversed = {6,5,4,3,2,1};
        assertEquals(reversed,numbersToReverse);

}
@Test
    public void testRunningTotal(){
    ClassFunctions sumTotal = new ClassFunctions();
    int[] numbersToSum = new int[]{ClassFunctions.sumOfNumbers(new int[]{2, 3, 4, 5})};
    int total = 14;
    assertEquals(total,numbersToSum);
}
@Test
    public void testpalindrome(){
        ClassFunctions palindrome = new ClassFunctions();
        boolean palindromeWord = ClassFunctions.palindrome("dad");
        boolean result = true;
        assertEquals(result,palindromeWord);
    }
@Test
    public void concatenatedArray(){
    ClassFunctions concatenatearray = new ClassFunctions();
    String [] arrayToConcatenate = ClassFunctions.concatenateArray(new String[]{"a","b","c","d"}, new int[]{1, 2, 3, 4});
    String[] concatenatedArray = {"a","b","c","d","1","2","3","4"};
    assertEquals(arrayToConcatenate,concatenatedArray);
}
}
