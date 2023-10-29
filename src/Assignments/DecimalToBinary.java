package Assignments;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101101"));
    }

    public static ArrayList decimalToBinaryCheck(int binary) {
        ArrayList<Integer> conversion = new ArrayList<>();
        ArrayList<Integer> converted = new ArrayList<>();
        conversion.add(binary);
        while (binary > 1){
                int divisor = binary / 2;
                conversion.add(divisor);
                binary = binary / 2;
            }
        for (int modulo: conversion) {
            converted.add(modulo%2);
            System.out.println(modulo);
        }
        System.out.println(conversion);
            return converted;
        }
   public  static int  binaryToDecimal(String number){
        int sum = Integer.parseInt(String.valueOf(number.charAt(0)));
        int theNum;
       for (int index = 1; index < number.length(); index++) {
           int num =  Integer.parseInt(String.valueOf(number.charAt(index)));
           theNum = (sum * 2)+num;
           sum = theNum;
       }
        return sum;
   }
    }
