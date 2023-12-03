package ConceptPractise;

import java.util.Arrays;

public class SwapArrayElements {
    public  int [] swap(int [] numbers){
       int [] temporaryVariable = temproaoryArray(numbers);
        int[] newArray = new int[numbers.length];
        for (int index = 0; index <numbers.length; index+=2) {
            int temp =temporaryVariable [index+1];
            temporaryVariable[index+1] = temporaryVariable[index];
            temporaryVariable[index] = temp;
            newArray[index] = temp;
            if (numbers.length %2 != 0){
                if (index == numbers.length-1){
                    newArray[index] = temporaryVariable[numbers.length];
                    break;
                }

            }
            newArray[index+1] =temporaryVariable[index+1];
        }
   return newArray;
    }
    public  int [] swapIndex(int [] numbers){
            if (numbers.length % 2 ==0){
                int temp = numbers[(numbers.length/2)-1];
                numbers[(numbers.length/2)-1]=numbers[numbers.length/2] ;
                 numbers[numbers.length/2] = temp;
            }if(numbers.length %2 != 0){
                int temp = numbers[(numbers.length/2)];
                   System.out.println(temp);
                  numbers[(numbers.length/2)] = numbers[numbers.length/2+1];
                  numbers[(numbers.length/2)+1] = temp;
                }

        return numbers;
    }
    public static int[] temproaoryArray(int [] numbers){
        int [] temproryArray = new int[numbers.length+1];
        int count = 0;
        for (int elements : numbers){
            temproryArray[count] = elements;
            count++;
        }
        return temproryArray;
    }

    public static void main(String[] args) {
        SwapArrayElements swap = new SwapArrayElements();
        int [] numbers = {42,15,18,12,13};
       System.out.println(Arrays.toString(swap.swapIndex(numbers)));

    }

}
