package Chapter2;

import java.util.Scanner;

public class DietelExercise234 {
        public static void main(String[] arg){
            Scanner population = new Scanner(System.in);

            System.out.print("Input  current world population: ");
            double worldPopulation = population.nextDouble();

            System.out.print("Input annual world population growth rate : ");
            double annualGrowthRate = population.nextDouble();

            System.out.printf("%s%f%n","Estimated world population after one year is: ", worldPopulation + annualGrowthRate);

            System.out.printf("%s%f%n","Estimated world population after two years is: ", annualGrowthRate * 2 + worldPopulation);

            System.out.printf("%s%f%n","Estimated world population after three years is: ", annualGrowthRate * 3 + worldPopulation);

            System.out.printf("%s%f%n","Estimated world population after four years is: ", annualGrowthRate * 4 + worldPopulation);

            System.out.printf("%s%f%n","Estimated world population after five years is: ", annualGrowthRate * 5 + worldPopulation);
        }
    }

