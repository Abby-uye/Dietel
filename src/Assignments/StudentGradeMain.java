package Assignments;

import java.util.Arrays;

public class StudentGradeMain {
    public static void main(String[] args) {
       Students student = new Students(5);
        Subject subject = new Subject(4);
        SavingDisplay display = new SavingDisplay();
       Scores score = new Scores();
        System.out.println("How many students do you have");
        System.out.println(student.getNumberOfStudents());
        System.out.println("How many subjects do they offer");
        System.out.println(subject.getNumberOfSubjects());
        score.setScores();
        SavingDisplay.displaySaving();
        System.out.println(SavingDisplay.displayDesign());
        System.out.println(SavingDisplay.displayDesign());


    }

}
