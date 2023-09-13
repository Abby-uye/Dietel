package Assignments;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int naturalNumber = 1;
        int counter = 0;
        while (counter != 10){
            System.out.println("Enter a numbers");
            naturalNumber = input.nextInt();
             if (naturalNumber > 0) {
                total += naturalNumber;
            } else if (naturalNumber < 0) {
                System.out.println("Enter a positive number");
            }
             counter++;
            }
            System.out.println(total);
        }


    }
