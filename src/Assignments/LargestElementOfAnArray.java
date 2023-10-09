package Assignments;

public class LargestElementOfAnArray {
    public static void main(String[] args) {
        int [] numbers = {15, 20, 25, 20, 10, 5};
        int largest = 1;
        for (int items = 0; items < numbers.length ;items++){
            if (numbers [items] > largest){
               largest = numbers[items];
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
