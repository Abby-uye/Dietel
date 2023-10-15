package ClassWork;

import java.util.ArrayList;

public class ArrayMinMax {
    public static void main(String[] args) {
    int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(minimumNumber(numbers));

    }

    public static int sumOfNumbers(int[] numbers) {
        int result = 0;
        for (int item = 0;item<numbers.length;item++){
            result += numbers[item];
        }return result;
    }

    public static int minimumNumber(int[] numbers) {
        int max = 0;
        for(int index = 0;index<numbers.length;index++){
            if(numbers[index]> max){
                max = numbers[index];
            }
        }return sumOfNumbers(numbers) - max ;
    }

    public static int maximumChecker(int[] numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int item =0;item<numbers.length;item++){
            if (numbers[item]<minimum){
                minimum=numbers[item];
            }
        }return sumOfNumbers(numbers)-minimum;
    }
}
