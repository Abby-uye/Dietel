package Chapter4;

import java.util.Scanner;

public class DietelExercise420Test {
    public static void main(String[] args) {
        Scanner tax = new Scanner(System.in);
        System.out.println("Enter your name");
        String citizen1Name = tax.nextLine();
        System.out.println("Enter your total earnings in a year");
        int citizen1Earning = tax.nextInt();

        System.out.println("Enter your name");
        String citizen2Name = tax.next();
        System.out.println("Enter your total earnings in a year");
        int citizen2Earning = tax.nextInt();

        System.out.println("Enter your name");
        String citizen3Name = tax.next();
        System.out.println("Enter your total earnings in a year");
        int citizen3Earning = tax.nextInt();

        if (citizen1Earning == 30000) {
            citizen1Earning = citizen1Earning * 15 / 100;
            System.out.println("Your tax deduction for the year is" + citizen1Earning);
        } else if (citizen1Earning > 30000) {
            citizen1Earning = citizen1Earning * 20 / 100;

        } else
            citizen1Earning = citizen1Earning * 10 / 100;

        System.out.println("your tax deduction for the year is" + citizen1Earning);

        if (citizen2Earning == 30000) {
            citizen2Earning = citizen2Earning * 15 / 100;
            System.out.println("Your tax deduction for the year is" + citizen2Earning);
        } else if (citizen2Earning > 30000) {
            citizen2Earning = citizen2Earning * 20 / 100;

        } else
            citizen2Earning = citizen2Earning * 10 / 100;

        System.out.println("your tax deduction for the year is $" + citizen2Earning);

        if (citizen3Earning == 30000) {
            citizen3Earning = citizen3Earning * 15 / 100;
            System.out.println("Your tax deduction for the year is $" + citizen3Earning);
        } else if (citizen1Earning > 30000) {
            citizen3Earning = citizen3Earning * 20 / 100;

        } else
            citizen3Earning = citizen3Earning * 10 / 100;

        System.out.println("your tax deduction for the year is $" + citizen3Earning);


    }


}







