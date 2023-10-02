package tdd;

import Assignments.ClassFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionsTdd {
    @Test
    void testLargest(){
        int [] numbers ={2,6,8,9,8};
        ClassFunctions.number(numbers);
        assertEquals(9,ClassFunctions.number(numbers));

    }
    @Test
    void testIfAnItemExistInAnArray(){
        int [] arrayList = {7, 9, 5, 4};
        int checker = 8;
        assertEquals(false,ClassFunctions.check(arrayList,checker));
    }

    @Test
    public void testoddPosition(){
        int [] numberList = {1,2,3,4,5,6,7,8,9,10};
        int []oddList = {2, 4, 6, 8, 10};
            assertArrayEquals(oddList,ClassFunctions.oddPosition(numberList));
        }
    @Test
    public void testRunningTotal(){
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        int total = 45;
        assertEquals(total, ClassFunctions.runningTotal(numbers));
    }
    @Test
    public void testPalindromeTrue(){
        String palindrome = "redivider";
        assertEquals(true,ClassFunctions.palindrome(palindrome));
    }
    @Test
    public void testPalindromeFalse(){
        String palindrome = "palindrome";
        assertEquals(false,ClassFunctions.palindrome(palindrome));

    }
@Test
    public void testSumOfNumbers(){
        int [] theList= {1,2,3,4,5,6,7,8,9};
        int total = 45;
        assertEquals(total,ClassFunctions.sumOfNumbers(theList));
}
@Test
    public void testSumWhile(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,};
        int total = 45;
        assertEquals(total,ClassFunctions.sumOfNumbersWhileLoop(numbers));
}
    @Test
    public void testSumDoWhile(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,};
        int total = 45;
        assertEquals(total,ClassFunctions.sumOfNumbersDoWhile(numbers));
    }


}
















