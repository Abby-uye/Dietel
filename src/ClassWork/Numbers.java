package ClassWork;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                0->sunday
                1->monday
                2->tuesday
                3->Wednesday
                4->Thursday
                5->Friday
                6->saturday""");
        int userInput = scanner.nextInt();
        while (userInput>6){
            userInput++;
        }
        switch (userInput) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid number");
        }

            }
        }



