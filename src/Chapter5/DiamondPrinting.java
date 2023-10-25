package Chapter5;

public class DiamondPrinting {
    public static void main(String[] args) {
        int counter = 5;
        int count = 5;
        int counter2 = 5;
        int count2 = 5;
        for (int row = 1; row <5; row++) {
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
        for (int row = 1; row <=5; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("  ");
            }
            for (int column2 = counter2; column2 >= 1; column2--) {
                System.out.print("* ");
            }
            for (int column3 = count2; column3 > 1; column3--) {
                System.out.print("* ");
            }
            for (int column = 0; column < 5; column++) {
                System.out.print("  ");
            }
            System.out.println();
            counter2--;
            count2--;
        }
    }
}