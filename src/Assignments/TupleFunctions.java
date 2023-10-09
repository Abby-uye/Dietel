package Assignments;

import java.util.Arrays;

public class TupleFunctions {
    public static String [] reverseAnArray (int [] numbers){
        String [] reversedArray = new String[numbers.length];
        int count = 0;
        for (int index = numbers.length-1;index>=0;index--){
            reversedArray[count] = String.valueOf(numbers[index]);
            count++;
        }
        return reversedArray;
    }

  public static String[] unpackTuple(int[] numbers) {
        String [] unpackedArray = new String[2];
        int count = 0;
        int count1 = 1;
        for ( int index = 1; index<= 1; index++){
            unpackedArray[count] = String.valueOf(numbers[3]);
        }
      for ( int index = 1; index<= 1; index++){
          unpackedArray[count1] = String.valueOf(numbers[0]);
      }
  return unpackedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(unpackTuple(new int[]{40, 20, 76, 45,})));
    }
}
