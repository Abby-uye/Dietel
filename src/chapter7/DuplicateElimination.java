package chapter7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateElimination {

    public int[] initializeArrayToMinusOne(int[] numbers) {
        Arrays.fill(numbers, -1);
        return numbers;

    }
    private static boolean inArray(ArrayList newList, Integer number){
        for (Object item : newList) {
            if (item == number){
                return true;
            }
        }
        return false;
    }
    private static int [] arrayListToArray(ArrayList initialArray){
        int [] newArray = new int[initialArray.size()];
        for (int index = 0; index < initialArray.size(); index++) {
            newArray[index] = (int) initialArray.get(index);
        }
        return newArray;
    }

    public int[] removeDuplicate(int[] initializedNumbers) {
        ArrayList<Integer> initialNewArray= new ArrayList<>();
        for (int initializedNumber : initializedNumbers) {
            if (!inArray(initialNewArray, initializedNumber)) {
                initialNewArray.add(initializedNumber);
            }
        }
        return arrayListToArray(initialNewArray);
    }

    public static void main(String[] args) {
        DuplicateElimination duplicateElimination = new DuplicateElimination();
        int[] numbers = new int[10];
        int[] initializedNumbers = duplicateElimination.initializeArrayToMinusOne(numbers);
        for (int row = 0; row < initializedNumbers.length; row++) {
           int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number that is >= 10 and <=100"));
           while (number <10 || number > 100){
               number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number that is >= 10 and <=100"));
           }
           initializedNumbers[row] =number;
        }
        int[] afterRemoveDuplicate = duplicateElimination.removeDuplicate(initializedNumbers);

        for (int i : afterRemoveDuplicate) {
            System.out.println(i);
        }
    }
}
