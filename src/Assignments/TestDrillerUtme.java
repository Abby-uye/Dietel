package Assignments;

import java.util.Scanner;

public class TestDrillerUtme {

    public static int testdriller(int copies) {
        Scanner input = new Scanner(System.in);
        int amount = 0;
        if (copies > 1 && copies < 5) {
            amount = 2000 * copies;
            System.out.println("The amount for the total copies is "+amount);
        } else if (copies >= 5 && copies < 10) {
            amount = 1800 * copies;
            System.out.println("The amount for the total copies is " +amount);

        } else if (copies >= 10 && copies <= 29) {
            amount = 1600 * copies;
            System.out.println("The amount for the total copies is "+amount);


        } else if (copies >= 30 && copies <= 49) {
            amount = 1500 * copies;
            System.out.println("The amount for the total copies is "+amount);

        } else if (copies >= 50 && copies <= 99) {
            amount = 1300 * copies;
            System.out.println("The amount for the total copies is "+amount);

        } else if (copies >= 100 && copies <= 199) {
            amount = 1200 * copies;
            System.out.println("The amount for the  total copies is "+amount);

        } else if (copies >= 200 && copies <= 499) {
            amount = 1100 * copies;
            System.out.println("The amount for the total copies is " + amount);

        } else if (copies > 500) {
            amount = 1000 * copies;
            System.out.println("The amount for the total copies is "+amount);

        }
        return amount;
    }
}



