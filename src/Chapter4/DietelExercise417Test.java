package Chapter4;

import java.util.Scanner;

public class DietelExercise417Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DietelExercise417 driver = new DietelExercise417();

        System.out.println("Enter the miles driven per trip:");
        int miles = input.nextInt();
        driver.setMiles(miles);
        System.out.println(driver.getMiles());

        System.out.println("Enter the amount of gallons used: ");

        System.out.println(driver.getGallon());

        double total =0;

       int numberOfTrips =0;
        while (miles != -1) {

            int gallons = input.nextInt();
            driver.setGallon(gallons);
            System.out.println(driver.getGallon());
            double amountUsed = driver.amountUsed(miles,gallons);
            System.out.printf("%s%.2f%n ","The miles covered per gallon for this trip is ",amountUsed);


            total = total + amountUsed;
            if (numberOfTrips>0)System.out.println("The total miles covered for all trip is " + total);
            System.out.println("Enter The miles driven per trip:");
            miles= input.nextInt();
            System.out.println("Enter the amount of gallons used: ");
            numberOfTrips++;
        }





    }
}