package Assignments;

import java.util.Scanner;

public class LogisticRidersPay {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" enter the total number of delivers you made today");
        int numberOfDeliveries = input.nextInt();
        paySlip(numberOfDeliveries);

    }


    public static void paySlip (int  numberOfDeliveries){
        int commission  = 0;
        int base = 5000;
        int payment = 0;
        if (numberOfDeliveries < 50) {
            commission = 160 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);
        } else if (numberOfDeliveries > 49 && numberOfDeliveries < 60) {
            commission = 200 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);
            
        } else if (numberOfDeliveries > 59 && numberOfDeliveries < 70) {
            commission = 250 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);

        }else
            commission = 500 * numberOfDeliveries;
        payment = base + commission;
        System.out.println("Your pay for the day is " + payment);



    }

}
