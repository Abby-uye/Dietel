package Assignments;

import java.util.Arrays;

public class ClassFunctions {

    public static int findLargestNumber(int[] numbers) {

        int largest = 0;
        for (int item = 0; item < numbers.length; item++) {
            if (numbers[item] > largest) {
                largest = numbers[item];
            }
        }
        return largest;

    }

    public static int[] reverseAnArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        int count = 0;
        for (int item = numbers.length - 1; item >= 0; --item) {
            reversedArray[count] = numbers[item];
            count++;
        }
        return reversedArray;

    }

    public static boolean checkIfNumberExist(int[] numbers, int checker) {

        for (int item = 0; item < numbers.length; item++) {
            if (numbers[item] == checker) {
                return true;
            }
        }
        return false;
    }

    public static int[] numbersInOddPosition(int[] numbers) {

        int[] oddPosition = new int[numbers.length / 2];
        int count = 0;
        for (int item = 1; item < numbers.length; item += 2) {
            oddPosition[count] = numbers[item];
            count++;
        }
        return oddPosition;
    }

    public static int [] numbersAtEvenPosition(int[] numbers){
        int [] evenPosition  = new int[numbers.length  /2] ;
        int count = 0;
        for (int index =0;index<numbers.length;index+=2){
            evenPosition[count] = numbers[index];
            count++;
        }
        return evenPosition;

    }


    public static void main(String[] args) {
       int [] numbers = {1,2,3,4,5,6,7};
       int[] result = new int[]{runningTotal(numbers)};
       System.out.println(Arrays.toString(result));
    }

    public static int runningTotal(int[] numbers) {
        int total = 0;
        for (int item = 0; item < numbers.length; item++) {

            total = total + numbers[item];
        }
        return total;
    }

    public static boolean palindrome(String letters) {
        int reverse = letters.length() - 1;
        String value = "";
        for (int forward = reverse; forward >= 0; forward--) {
            value += letters.charAt(forward);
        }
        if (value.equals(letters)) {
            return true;
        } else return false;
    }

    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int item = 0; item < numbers.length; item++) {

            sum = sum + numbers[item];
        }
        return sum;
    }

    public static int sumOfNumbersWhileLoop(int[] numbers) {
        int sum = 0;
        int count = 0;
        while (count < numbers.length) {
            sum += numbers[count];
            count++;
        }
        return sum;
    }


    public static int sumOfNumbersDoWhile(int[] numbers) {
        int sum = 0;
        int count = 0;
        do {
            sum += numbers[count];
            count++;
        } while (count < numbers.length);
        return sum;
    }

    public static String[] concatenateArray(String[] firstList, int[] secondList) {
        String [] concatenatedList = new String[firstList.length + secondList.length];
        int count = 0;
        for (int index = 0; index < firstList.length; index++) {
            concatenatedList[count] = firstList[index];
            count++;
        }
        for (int index = 0; index < secondList.length; index++) {
            concatenatedList[count] = String.valueOf(secondList[index]);
            count++;
        }
        return concatenatedList;
    }

public static String[] combinedArray(String[] firstList ,int[] secondList){
        String [] combinedList = new String[firstList.length+secondList.length];
        int evenCount = 0;
        int oddCount = 1;
        for (int index = 0;index <firstList.length;index++){
            combinedList[evenCount] = firstList[index];
            evenCount+=2;
        }
        for (int index = 0;index<secondList.length;index++){
            combinedList[oddCount] = String.valueOf(secondList[index]);
            oddCount+=2;
        }return combinedList;
}
public static int [] listOfNumbers(int numbers ){
        int[] seperatedNumbers = new int[4];
    int digit = numbers /1000%10 ;
    int digit2 = numbers / 100%10;
    int digit3 = numbers / 10%10;
    int digit4 = numbers%10;
    for (int index = 0 ; index <=1;index++){
            seperatedNumbers[index] = digit;
        }

return seperatedNumbers;
    }
}