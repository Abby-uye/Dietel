package chapter7;

import java.util.Scanner;

public class twoByThreeArrayT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 0;
        int[][] t = new int[2][3];
        for (int row = 0; row < t.length; row++) {
            for (int index = 0; index < t[0].length; index++) {
            }
        }
        for (int column = 0; column < t.length; column++) {
            for (int index = 0; index < t[column].length; index++) {
                t[column][index] = 0;
            }
        }
//        t[0][0] = 0;
//
//        for (int column = 0; column < t.length; column++) {
//            for (int index = 0; index < t[column].length; index++) {
//                t[column][index] = scanner.nextInt();
//                if (t[column][index] < smallest) {
//                    smallest = t[column][index];
//
//                }
//                System.out.printf("%d %d %d", t[0][0], t[0][1], t[0][2]);
//                System.out.println(t[0][2] + t[1][2]);
//            }

        for (int column = 0; column < t.length-1; column++) {
            System.out.print("   ");
            for (int index = 0; index < t[column].length; index++) {
                System.out.print( index+1  + "  ");
            }
            System.out.println();
        } for (int column = 0; column < t.length; column++) {
            System.out.print(column+1+ ": ");
            for (int index = 0; index < t[column].length; index++) {
                System.out.print(t[column][index] + "  ");
            }
            System.out.println();
        }
    }
}
