package chapter6;

import java.util.Scanner;

public class TemperatureConversions {
public static double convertKelvinToCelsius(double kelvin){
    return kelvin - 273.15;
}
    public static double convertCelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a celsius temperature and i will tell you the kelvin equivalent");
        double celsius = scanner.nextDouble();
        System.out.println("The kelvin equivalent of the celsius temperature you entered is: " + convertCelsiusToKelvin(celsius));
        System.out.println("Enter a kelvin temperature and i will tell you the celsius equivalent");
        double kelvin = scanner.nextDouble();
        System.out.println("The kelvin equivalent of the celsius temperature you entered is: " + convertKelvinToCelsius(kelvin));
    }
    }

