package Assignments;

import static java.lang.Integer.MAX_VALUE;

public class SmallestNumberInAnArray {
    public static void main(String[] args) {
        int [] numbers = {15, 20, 25, 20, 10, 5};
        int smallestNumber = MAX_VALUE;
        for (int items = 0; items < numbers.length ;items++){
            if (numbers [items] < smallestNumber){
                smallestNumber = numbers[items];
            }
        }
        System.out.println("The smallest number is " + smallestNumber);
    }

}
