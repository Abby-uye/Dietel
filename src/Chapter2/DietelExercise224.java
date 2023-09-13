package Chapter2;

import java.util.Scanner;

public class DietelExercise224 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("\n Enter first number: ");
        int firstUserInput =numbers.nextInt();

        System.out.println("\n Enter second number: ");
        int secondUserInput =numbers.nextInt();

        System.out.println("\n Enter third number: ");
        int thirdUserInput =numbers.nextInt();

        System.out.println("\n Enter fourth number: ");
        int fourthUserInput =numbers.nextInt();

        System.out.println("\n Enter fifth number: ");
        int fifthUserInput =numbers.nextInt();

        if(firstUserInput > secondUserInput && (fifthUserInput > thirdUserInput) && (firstUserInput >fourthUserInput)&&(firstUserInput > fifthUserInput)){
            System.out.printf("%d %s%n", firstUserInput ," is the largest number");
        }

        if(firstUserInput < secondUserInput && (fifthUserInput < thirdUserInput) && (firstUserInput < fourthUserInput)&&(firstUserInput < fifthUserInput)){
            System.out.printf("%d %s%n", firstUserInput , "is the smallest  number");
        }

        if( secondUserInput > firstUserInput && (secondUserInput > thirdUserInput) && (secondUserInput >fourthUserInput)&&(secondUserInput > fifthUserInput)){
            System.out.printf("%d %s %n", secondUserInput ," is the largest number");
        }

        if( secondUserInput < firstUserInput && (secondUserInput < thirdUserInput) && (secondUserInput < fourthUserInput)&&(thirdUserInput < fifthUserInput)){
            System.out.printf("%d %s%n", secondUserInput ," is the smallest number");
        }

        if( thirdUserInput > firstUserInput && (  thirdUserInput > secondUserInput ) && (thirdUserInput > fourthUserInput)&&(thirdUserInput > fifthUserInput)){
            System.out.printf("%d %s %n", thirdUserInput ," is the largest number");
        }

        if( thirdUserInput < firstUserInput && (  thirdUserInput < secondUserInput ) && (thirdUserInput < fourthUserInput)&&(thirdUserInput < fifthUserInput)){
            System.out.printf("%d %s %n", thirdUserInput ,"i s the smallest number");
        }

        if( fourthUserInput > firstUserInput && (fourthUserInput > secondUserInput) && (fourthUserInput > thirdUserInput)&&(fourthUserInput > fifthUserInput)){
            System.out.printf("%d %s %n ", fourthUserInput ," is the largest number");
        }
        else
            System.out.printf("%d%s%n ",fourthUserInput," is the smallest number");

        if( fifthUserInput < firstUserInput && (fifthUserInput < secondUserInput) && (fifthUserInput < thirdUserInput)&&(fifthUserInput< fourthUserInput)){
            System.out.printf("%d %s%n", fifthUserInput ," is the smallest number");

        }else
            System.out.printf("%d %s%n", fifthUserInput , " is the largest number");



    }
}
