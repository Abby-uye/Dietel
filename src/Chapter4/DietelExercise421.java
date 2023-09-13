package Chapter4;

import java.util.Scanner;

public class DietelExercise421 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int largest =0;
        for (int marketers =1;marketers <=10;marketers++){
            System.out.println("Enter the the total number of sales you made: ");
            int sales = input.nextInt();
            System.out.println(sales);
            if (sales > largest ){
                largest = sales;
                System.out.println("The largest number of sales is "+largest);
            }else System.out.println(" ");
        }
        System.out.println("The winner is the marketer with the total sales of "+largest);
    }
}
