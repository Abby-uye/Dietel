package Chapter2;

import java.util.Scanner;

public class DietelExercise233 {
    public static void main(String[] arg){
        Scanner bmi = new Scanner(System.in);

        System.out.print("Input  weight in kilograms: ");
        int weightInKilograms = bmi.nextInt();

        System.out.print("Input  hieght in kilograms: ");
        int hieghtInMeters = bmi.nextInt();

        int bodyMassIndex = weightInKilograms / hieghtInMeters * hieghtInMeters;

        System.out.printf("%s%d%n" , "your bmi is:",  bodyMassIndex );

        System.out.print(" Hello, According to the National Heart, Lung, and Blood Institute (NHLBI), the BMI categories are:Underweight = <18.5Normal weight = 18.5–24.9Overweight = 25–29.9Obesity = bMI of 30 or greater");
    }
}

