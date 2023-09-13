package ClassWork;

import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("""
                0->Sunday
                1->Monday
                2->Tuesday
                3->Wednesday
                4->Thursday
                5->Friday
                6->saturday""");
        int day = days.nextInt();
        switch (day) {
            case 0 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still sunday");
                    case 1 -> System.out.println("Today is sunday future day is Monday");
                    case 2 -> System.out.println("Today is sunday future day is Tuesday");
                    case 3 -> System.out.println("Today is sunday future day is wednesday");
                    case 4 -> System.out.println("Today is sunday future day is Thursday");
                    case 5 -> System.out.println("Today is sunday future day is Friday");
                    case 6 -> System.out.println("Today is sunday future day is Saturday");

                }
            }
            case 1 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Monday");
                    case 1 -> System.out.println("Today is Monday future day is Tuesday");
                    case 2 -> System.out.println("Today is Monday future day is wednesday");
                    case 3 -> System.out.println("Today is Monday future day is Thursday");
                    case 4 -> System.out.println("Today is Monday future day is Friday");
                    case 5 -> System.out.println("Today is Monday future day is Saturday");
                    case 6 -> System.out.println("Today is Monday future day is Sunday");
                }
            }
            case 2 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Tuesday");
                    case 1 -> System.out.println("Today is Tuesday future day is wednesday");
                    case 2 -> System.out.println("Today is Tuesday future day is Thursday");
                    case 3 -> System.out.println("Today is Tuesday future day is Friday");
                    case 4 -> System.out.println("Today is Tuesday future day is Saturday");
                    case 5 -> System.out.println("Today is Tuesday future day is Sunday");
                    case 6 -> System.out.println("Today is Tuesday future day is monday ");

                }
            }
            case 3 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Wednesday");
                    case 1 -> System.out.println("Today is Wednesday future day is Thursday");
                    case 2 -> System.out.println("Today is Wednesday future day is Friday");
                    case 3 -> System.out.println("Today is Wednesday future day is Saturday");
                    case 4 -> System.out.println("Today is Wednesday future day is Sunday");
                    case 5 -> System.out.println("Today is Wednesday future day is monday ");
                    case 6 -> System.out.println("Today is Wednesday future day is Tuesday");

                }

            }
            case 4 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Thursday");
                    case 1 -> System.out.println("Today is Thursday future day is Friday");
                    case 2 -> System.out.println("Today is Thursday future day is Saturday");
                    case 3 -> System.out.println("Today is Thursday future day is Sunday");
                    case 4 -> System.out.println("Today is Thursday future day is monday ");
                    case 5 -> System.out.println("Today is Thursday future day is Tuesday");
                    case 6 -> System.out.println("Today is Thursday future day is Wednesday");
                }
            }
            case 5 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Friday");
                    case 1 -> System.out.println("Today is Friday future day is Saturday");
                    case 2 -> System.out.println("Today is Friday future day is Sunday");
                    case 3 -> System.out.println("Today is Friday future day is monday ");
                    case 4 -> System.out.println("Today is Friday future day is Tuesday");
                    case 5 -> System.out.println("Today is Friday future day is Wednesday");
                    case 6 -> System.out.println("Today is Thursday future day is Thursday");
                }
            }
            case 6 -> {
                System.out.println("Enter future day");
                int futureDay = days.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Saturday");
                    case 1 -> System.out.println("Today is Saturday future day is Sunday");
                    case 2 -> System.out.println("Today is Saturday future day is monday ");
                    case 3 -> System.out.println("Today is Saturday future day is Tuesday");
                    case 4 -> System.out.println("Today is Saturday future day is Wednesday");
                    case 5 -> System.out.println("Today is Saturday future day is Thursday");
                    case 6 -> System.out.println("Today is Friday future day is Monday");
                }
            }
            default -> System.out.println("Not a day of the week");
        }
    }
}