package Chapter2;

import java.util.Scanner;

 public class DietelExercise228 {
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter radius of a circle:");
        double userRadius = radius.nextDouble();

        double pi = 3.14159;
        System.out.printf(" The diameter of the circle is %f%n", 2 * userRadius );
        System.out.printf("The circumference of the circle is %f%n",   2 * pi * userRadius);
        System.out.printf("The area of the circle is %f%n" , pi * userRadius * userRadius);


    }
  }


