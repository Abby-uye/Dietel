package Assignments;

import java.util.Scanner;

public class LogisticsRidersPayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" enter the total number of delivers you made today");
        int numberOfDeliveries = input.nextInt();
        LogisticRidersPay.paySlip(numberOfDeliveries);

    }
}
