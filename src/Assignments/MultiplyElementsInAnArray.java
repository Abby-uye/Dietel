package Assignments;

public class MultiplyElementsInAnArray {
    public static void main(String[] args) {
            int total = 0;
            int multiplicatinOfNumbers =1;
            int [] numbers = {15,20,25,20,10,5};
            for (int index = 0; index < numbers.length; index++){
                total += numbers[index];
                multiplicatinOfNumbers = total * total;

            }
            System.out.println("The total is "+multiplicatinOfNumbers);
        }
    }


