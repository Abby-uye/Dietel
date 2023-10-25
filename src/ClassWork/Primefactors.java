package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Primefactors {
public static int [] primefactor(int number) {
    ArrayList<Integer> results = new ArrayList<>();

    int divisor = 2;
    while (number > 1) {
        if (number % divisor == 0) {
            results.add(divisor);
            number = number / divisor;
            divisor = 2;

        } else {
            ++divisor;
        }
    }
 return convertArray(results);
}
public static int[] convertArray(ArrayList<Integer> numbers){
    int [] convertedList = new int[numbers.size()];
    for (int i = 0; i < numbers.size(); i++) {
        convertedList[i] = numbers.get(i);
    }
    return convertedList;
}
public static void main (String [] args){
    System.out.println(Arrays.toString(primefactor(30)));
}

}

