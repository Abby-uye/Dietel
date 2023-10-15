package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCustomerItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0;
        int [][] customerCart = new int[3][3];
        for(int row =0;row < 3;row++){
            for(int column =0;column<3;column++){
                System.out.println("Enter price of  item"+(column+1));
                 customerCart[row][column]= input.nextInt();
            }

        }
        System.out.print("          item1     item2     item3");
        System.out.println();
        for (int[] cart :customerCart){
            System.out.print("customer" +(index+1)+"  ");
            for (int cartItem:cart){
                System.out.print(cartItem+ "   \t  ");
            }

            System.out.println();
        index++;
        }
    }

}
