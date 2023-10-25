package Assignments;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class DecimalToBinary {

    public static ArrayList decimalToBinaryCheck(int binary) {
        ArrayList<Integer> conversion = new ArrayList<>();
        ArrayList<Integer> converted = new ArrayList<>();

        while (binary > 0){
                int divisor = binary / 2;
                conversion.add(divisor);
            }
        for (int modulo: conversion) {
            converted.add(modulo%2);
        }
            return converted;
        }
   public  static int  binaryToDecimal(String number){
        int [] conversion =  new int[number.length()];
        int sum = 0;
       for (int index = 0; index < number.length(); index++) {
           int num =  Integer.parseInt(String.valueOf(number.charAt(index)));
           int theNum = (0 * 2)+num;
           conversion[index] = (theNum);
       }
       for (int  item : conversion) {
           sum+=item;

       }
        return sum;
   }


    }
