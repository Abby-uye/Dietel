package chapter3;

import java.util.Scanner;

public class DietelExercise317Test {
    public static void main(String[] args) {
        Scanner heartRate = new Scanner(System.in);
        DietelExercise317 client1 = new DietelExercise317("uye","Heaven","female",27,03,2005,5.5,60.2);
        System.out.println("enter your first name");
       String userFirstName = heartRate.nextLine();
        client1.setFirstName(userFirstName);
     System.out.println(client1.getFirstName());

        System.out.println("Enter your last name");
        String userLastName = heartRate.nextLine();
        client1.setLastName(userLastName);
     System.out.println(client1.getLastName());


        System.out.println("Enter your gender");
        String gender = heartRate.nextLine();
        client1.setGender(gender);
     System.out.println(client1.getGender());

        System.out.println("Enter your day of birth ");
        int birthDay = heartRate.nextInt();
        client1.setDayOfBirth(birthDay);
     System.out.println(client1.getDayOfBirth());

        System.out.println("Enter your month of birth ");
        int birthMonth = heartRate.nextInt();
        client1.setMonthOfBirth(birthMonth);
     System.out.println(client1.getMonthOfBirth());

        System.out.println("Enter your year of birth  ");
        int birthYear = heartRate.nextInt();
        client1.setYearOfBirth(birthYear);
     System.out.println(client1.getYearOfBirth());

        System.out.println("Enter your height in inches ");
        double heightInInches = heartRate.nextDouble();
        client1.setHeightInInches(heightInInches);
     System.out.println(client1.getHeightInInches());

        System.out.println("Enter your weight in pounds");
        double weightInPounds = heartRate.nextDouble();
        client1.setWeightInPounds(weightInPounds);
     System.out.println(client1.getWeightInPounds());

        client1.setAge(birthYear);
        System.out.println("i am " + client1.getAge()+" years of age");

        client1.setMaximumHeartRate(client1.getAge());
        System.out.println("my maximum heart rate is " + client1.getMaximumHeartRate());

        client1.setBmi(weightInPounds,heightInInches);
        System.out.println("Bmi is " + client1.getBmi());

        client1.setTargetHeartRate(client1.getMaximumHeartRate());
        System.out.println("Target heart rate is " + client1.getTargetHeartRate());




    }
}
