package Chapter5;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number And i will print you a diamond");
        int diamondRow = input.nextInt();
        int counter = diamondRow;
        int count = diamondRow;
        int counter2 = diamondRow;
        int count2 = diamondRow;
        int downSide = diamondRow;
        int downSideCount = diamondRow;
        for (int row = 1; row <diamondRow; row++) {
            for (int column = counter; column > 0; column--) {
                System.out.print("  ");
            }
            for (int column1 = 0; column1 < row; column1++) {
                System.out.print("* ");
            }
            for (int column2 = 1; column2 < row; column2++) {
                System.out.print("* ");
            }
            for (int column = count; column > 0; column--) {
                System.out.print("  ");
            }
            System.out.println();
            counter--;
            count--;
        }
        for (int row = 1; row <=downSide; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("  ");
            }
            for (int column2 = counter2; column2 >= 1; column2--) {
                System.out.print("* ");
            }
            for (int column3 = count2; column3 > 1; column3--) {
                System.out.print("* ");
            }
            for (int column = 0; column < downSideCount; column++) {
                System.out.print("  ");
            }
            System.out.println();
            counter2--;
            count2--;
        }

    }
}
