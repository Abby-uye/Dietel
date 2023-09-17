package Chapter4;

import Assignments.TestDrillerUtme;

import java.util.Scanner;

public class TestDrillerUtmeTest {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("How many copies do you want to buy: ");
        int input = scanner.nextInt();
        TestDrillerUtme.testdriller(input);
    }
}
