package Assignments;

public class SideTriangle {
    public static void main(String[] args) {
        for (int row = 1; row <=5;row++){

            for (int column =0; column< row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 4; row >0 ;row--){
            for (int column = 0;column < row;column++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
