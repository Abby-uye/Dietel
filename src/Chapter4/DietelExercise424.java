package Chapter4;

import java.util.Scanner;

public class DietelExercise424 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Enter result: 1 = pass, 2 = fail");
            int result = input.nextInt();
            while (result != 1 && result != 2) {
                System.out.println("Enter result: 1 = pass, 2 = fail");
                result = input.nextInt();
            }
                if (result == 1) {
                    passes = passes + 1;
                } else if (result == 2) {
                    failures = failures + 1;

                }
                counter += 1;
                System.out.printf("Passed: %d%nFailed; %d%n", passes, failures);
                if (passes > 8) {
                    System.out.println("Bonus to instructor");
                }
            }
        }
    }
