package ConceptPractise;

public class Pattern1 {
    public static void main(String[] args) {
//        int star = 1;
//        while (star <= 10){
//            System.out.println("*");
//            star+=1;
//        }
//    }
//

        int number = 5;
        int number2 =1;
        int number3 = 5;
//        for (int row = 0; row < number; row++){
//            for (int column = 0;column<number;column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int row = 1; row<=number;row++){
//            for (int column =1; column<=row;column++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
    //
    //        for (int row = number; row>=0;row--){
    //           for (int column =row; column>0;column--){
    //                System.out.print("*  ");
    //           }
    //            System.out.println();
    //       }
//        for (int row =number;row>0;row--){
//            for (int column =row;column >=0;column--){
//                System.out.print("  ");
//            }
//            for (int column2 = 0;column2 < number2;column2++){
//                System.out.print("* ");
//
//            }number2++;
//            System.out.println();
////        }
//        for (int row =0;row<5;row++){
//            for (int column = 0;column <= row; column++){
//                System.out.print("  ");
//            }for (int column2 =number;column2>0;column2--){
//                System.out.print("* ");
//            }number--;
//            System.out.println();
//        }
//        for (int row =1;row <= 5;row++){
//            for (int column =number;column>=0;column--){
//                System.out.print("  ");
//            }number--;
//           for (int column2 =1;column2<row;column2++){
//                System.out.print("* ");
//           }for (int column2 =1;column2<=row;column2++){
//                System.out.print("* ");
//           }
//            System.out.println();
//       }
    for (int row = 1;row <=5;row++){
        for (int column = 1;column<=row;column++){
            System.out.print("  ");
        }
       for (int column2 =number-1;column2>0;column2--){
           System.out.print("* ");
       }number--;
       for (int column3 = number3;column3>0;column3--){
          System.out.print("* ");
       }number3--;
        System.out.println();
    }
    }
}