package Chapter2;

import java.util.Scanner;

public class DietelExercise232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first random numbers: ");
        int userInput1 = input.nextInt();
        System.out.println("Enter second random numbers: ");
        int userInput2 = input.nextInt();
        System.out.println("Enter thirdrandom numbers: ");
        int userInput3 = input.nextInt();
        System.out.println("Enter fourth random numbers: ");
        int userInput4 = input.nextInt();
        System.out.println("Enter fifth random numbers: ");
        int userInput5 = input.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        if (userInput1 < 0) {
            negative++;
        } else if (userInput1 > 0) {
            positive++;
        } else if (userInput1 == 0) {
            zero++;
        }
        if (userInput2 < 0) {
            negative++;
        } else if (userInput2 > 0) {
            positive++;
        } else if (userInput2 == 0) {
            zero++;
        }
        if (userInput3 < 0) {
            negative++;
        } else if (userInput3 > 0) {
            positive++;
        } else if (userInput3 == 0) {
            zero++;
        }

        if (userInput4 < 0) {
            negative++;
        } else if (userInput4 > 0) {
            positive++;
        } else if (userInput4 == 0) {
            zero++;
        }

        if (userInput5 < 0) {
            negative++;
        } else if (userInput5 > 0) {
            positive++;
        } else if (userInput5 == 0) {
            zero++;
        }
        System.out.printf("%s%d%n %s%d%n %s%d%n" ,"The number of negative number is ",negative, "The number of positive number is ",positive,"The number of zero is ",zero);


    }

    }

