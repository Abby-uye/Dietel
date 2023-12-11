package Chapter5;

public class ModifiedTrianglePrinting {
    public static void main(String[] args) {
    int number =10;
    int number2 =10;
        for (int row =1;row<=10;row++){
        for (int column =0;column<row;column++){
            System.out.print("* ");
        }
        System.out.println();
    }
        System.out.println();
        for (int row = 10;row>0;row--){
        for (int column =0;column<row;column++){
            System.out.print("* ");
        }
        System.out.println();
    }
        System.out.println();
        for(int row = 0;row<10;row++){
        for (int column =0;column<row;column++ ){
            System.out.print("  ");
        }
        for (int column3 =number;column3>0;column3-- ){
            System.out.print("* ");
        }number--;
        System.out.println();
    }
   for (int row = 1;row<=10;row++){
        for (int column = number2;column > 0;column--){
            System.out.print("  ");
        }number2--;
        for (int column1 = 0;column1<row;column1++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

}
