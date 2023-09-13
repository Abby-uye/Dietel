package chapter3;

import java.util.Scanner;

public class DietelExercise316Test {
    public static void main(String[] args) {
        Scanner heartRates = new Scanner(System.in);
        DietelExercise316 heartRate = new DietelExercise316("uye","Heaven",27,03,2005);

        System.out.println("Enter your first name");
        String firstname = heartRates.nextLine();
        heartRate.setFirstName(firstname)  ;
        System.out.print("My name is "+heartRate.getFirstName());

        System.out.println("Enter your last name");
        String lastName = heartRates.nextLine();
        heartRate.setLastName(lastName);
        System.out.println(heartRate.getLastName());

        System.out.println("Enter your day of birth");
        int dayOfBirth = heartRates.nextInt();
        heartRate.setDayOfBirth(dayOfBirth);
        System.out.print("i was born: "+heartRate.getDayOfBirth()+"/");

        System.out.println("Enter your month of birth");
        int monthOfBirth= heartRates.nextInt();
        heartRate.setMonthOfBirth(monthOfBirth);
        System.out.print(heartRate.getMonthOfBirth()+"/");

        System.out.println("Enter your year of birth");
        int yearOfBirth = heartRates.nextInt();
        heartRate.setYearOfBirth(yearOfBirth);
        System.out.println(heartRate.getYearOfBirth());

        heartRate.setMaximumHeartRate(heartRate.getAge());
        System.out.println("My maximum heart rate is"+heartRate.maximumHeartRate());

        heartRate.setAge(heartRate.getYearOfBirth());
        System.out.println("I am "+heartRate.getAge()+" years old");

            heartRate.setTargetHeartRate(heartRate.getTargetHeartRate());
        System.out.println(heartRate.getTargetHeartRate());





    }
}
