package Chapter5;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number And i will print you a diamond");
        int diamondRow = input.nextInt();
        for (int row  = 0; row  < diamondRow; row ++) {
            for (int column1 = diamondRow; column1 >=0 ; column1--) {
                System.out.print("7 ");
            }for (int column2 = 0; column2 <= row; column2++) {
                System.out.print("f ");
            }for (int column3 = 0; column3<=row;column3++){
                System.out.print("* ");
            }for (int column4 = diamondRow;column4>0;column4--){
                System.out.print("9 ");
            }
            System.out.println();
        }
    }
}
