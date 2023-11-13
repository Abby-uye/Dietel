package Assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            Scores score;

            while (true) {
                try {
                    System.out.println("How many students do you have");
                    String numberOfStudent = input.next();
                    System.out.println("How many subjects do they offer");
                    String numberOfSubjects = input.next();
                    score = new Scores(numberOfStudent, numberOfSubjects);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("You have entered an invalid digit, please check and enter a valid digit " + e.getMessage());
                }
            }

            SavingDisplay display = new SavingDisplay();
            score.setScores();
            SavingDisplay.displaySaving();
            System.out.println(SavingDisplay.displayDesign());
            System.out.println(SavingDisplay.displayDesign());
            score.displaySub();
            System.out.println(SavingDisplay.displayDesign());
            score.display();
            System.out.println(SavingDisplay.displayDesign());
            System.out.println(SavingDisplay.displayDesign());
            score.classSummary();
        }

    }


