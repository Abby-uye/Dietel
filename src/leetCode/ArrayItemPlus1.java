package leetCode;

import java.util.Arrays;

public class ArrayItemPlus1 {
    public static int[] plusOne(int[] digits) {
        int result = 0;
        int firstDigit = 0;
        int secondDigits=0;
        int[] newDigit = new int [digits.length+1];

        for (int index : digits) {
            result = digits[digits.length - 1];
            result = result + 1;
        }
            if (result > 9){
                 firstDigit = result %10;
                 secondDigits = result/10;
                for (int item = 0;item< digits.length;item++){
                    newDigit[item] = digits[item];
                }
               newDigit[digits.length-1] = secondDigits;
              newDigit[digits.length] = firstDigit;
                return newDigit;
            }else {digits[digits.length-1] = result;
        }
        return digits;

    }

    public static void main(String[] args) {
       int [] theList = {1,2,3,4,9};
      int[]  result = plusOne(theList);
        System.out.println(Arrays.toString(result));
    }
}





