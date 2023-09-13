package Chapter2;

import java.util.Scanner;

public class DietelExercise235 {

        public static void main(String[] arg){
            Scanner pyramid = new Scanner(System.in);

            System.out.print("Enter the number of years used to build the pyramid of Giza: ");
            double numberOfYears = pyramid.nextDouble();

            System.out.print(" what are the estimated number of stones that was used to build the pyramid of Giza? : ");
            double numberOfStones  = pyramid.nextDouble();


            System.out.print("Enter average weight of each stone used to build the pyramid of Giza: ");
            double averageWeightOfStones = pyramid.nextDouble();

            int oneMinute = 60;
            int oneHour = 24;
            int oneYear = 365;

            double estimatedWeightPerMinute = averageWeightOfStones *  oneMinute / oneMinute;

            double estimatedWeightPerHour = averageWeightOfStones  * oneMinute * oneMinute / oneHour;

            double estimatedWeightPerYear = averageWeightOfStones  * oneMinute * oneMinute * oneHour * oneYear / oneYear;

            System.out.printf("%s%f%n" , " average weight per minute is: ",estimatedWeightPerMinute  );

            System.out.printf("%s%f%n" , " average weight per hour is: ", estimatedWeightPerHour );


            System.out.printf("%s%f%n" ,  "average weight per year is:" , estimatedWeightPerYear );

        }
    }

