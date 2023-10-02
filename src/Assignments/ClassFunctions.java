package Assignments;

import java.util.Arrays;
import java.util.function.Supplier;

public class ClassFunctions {
    public static int number (int[] numbers){
        int largest = 0;
        for (int item = 0;item < numbers.length ;item ++){
            if (numbers [item ]> largest){
                largest = numbers [item];
            }
        }return largest;

        }

public static boolean check(int[] numbers, int checker){
        for (int item =0; item<numbers.length;item++){
            if (numbers[item] == checker){
                return true;
            }
        }return false;
}

public static int[] oddPosition(int []numbers) {

    int [] oddPosition = new int[numbers.length/2];
    int count = 0;
    for (int item = 1; item < numbers.length; item += 2) {
        oddPosition[count] = numbers[item];
        count++;
}
    return oddPosition;
}

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        int [] result =  oddPosition(numbers);
        System.out.println(Arrays.toString(result));
    }
public static int runningTotal(int[] numbers){
    int total = 0;
        for(int item = 0; item< numbers.length;item++){

            total = total + numbers[item];
        }
    return total;
    }
public static boolean palindrome (String letters){
    int reverse = letters.length() - 1;
    String value = "";
    for(int forward = reverse; forward >= 0; forward--) {
        value += letters.charAt(forward);
    }
            if (value.equals(letters)){
                return true;
            }
            else return false;
        }
    public static int sumOfNumbers(int[] numbers){
        int sum = 0;
        for(int item = 0; item< numbers.length;item++){

            sum = sum + numbers[item];
        }
        return sum;
    }

    public static int sumOfNumbersWhileLoop(int[] numbers){
        int sum = 0;
        int count = 0;
        while( count < numbers.length) {
            sum +=numbers[count];
            count++;
        }return sum;
    }


public static int sumOfNumbersDoWhile(int[] numbers) {
    int sum = 0;
    int count = 0;
    do {
        sum += numbers[count];
        count++;
    }while (count < numbers.length);
        return sum;
    }
public static int concatenateArray(int[] firstList , int[] secondList ){
        int firstListLenght = firstList.length;
        int secondListLenght = secondList.length;
        int []result = new int[firstList + secondList]
}

}


