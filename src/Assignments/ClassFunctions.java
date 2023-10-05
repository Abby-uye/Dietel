package Assignments;

import java.util.Arrays;
import java.util.function.Supplier;

public class ClassFunctions {
//    public static int findLargestNumber(int[] numbers) {}
////
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] result = oddPosition(numbers);
//        System.out.println(Arrays.toString(result));
//    }
    
    public static int largestNumber(int[] numbers) {

        int largest = 0;
        for (int item = 0; item < numbers.length; item++) {
            if (numbers[item] > largest) {
                largest = numbers[item];
            }
        }
        return largest;

    }

    public static int reverse(int[] numbers) {
    for (int item =0;  item < numbers.length; item /=2){


    }
        return 0;

        // 1.
        // Create a loop that loops through the array n/2 times
        // For x element, swap it with n - x element (e.g swap 0th index with last index)
            // Create a temp variable
            // Assign index x value to temp
            // Assign index n-x value to index x
            // Assign temp to the index n - x

        // 2.
        // Create a new array of the same size as numbers array
        // Loop through starting from index n-1 (the end)
            // Assing each value to the new array from the start
    }

    public static boolean checkIfNumberExist(int[] numbers, int checker) {

        for (int item = 0; item < numbers.length; item++) {
            if (numbers[item] == checker) {
                return true;
            }
        }
        return false;
    }

    public static int[] numbersInddPosition(int[] numbers) {

        int[] oddPosition = new int[numbers.length / 2];
        int count = 0;
        for (int item = 1; item < numbers.length; item += 2) {
            oddPosition[count] = numbers[item];
            count++;
        }
        return oddPosition;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = numbersInddPosition(numbers);
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
}
//public static int concatenateArray(int[] firstList , int[] secondList ){
//        int firstListLenght = firstList.length;
////        int secondListLenght = secondList.length;
////        int []result = new int[firstList + secondList]
////}
////
////}


