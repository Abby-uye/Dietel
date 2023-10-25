package Assignments;

import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> productOfPrimeFactor(int number) {
        int digit;
        if (number < 0){
        digit = number * -1;
        }else{
        digit = number;
        }
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        int index = 2;
        while (index <= digit){
            while (digit % index == 0){
                listOfNumbers.add(index);
                digit /= index;
            }index++;
        }
        return listOfNumbers;
            }

    public static void main(String[] args) {
        System.out.println(productOfPrimeFactor(30));
    }
        }
