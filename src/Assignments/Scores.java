package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Scores {
    Students schoolStudents = new Students(3);
    Subject studentSubject = new Subject(2);

    //    private int [] subjects = new int[studentSubject.getNumberOfSubjects()];
//    private int [] students = new int[schoolStudents.getNumberOfStudents()];
    private ArrayList<String> allStudents = new ArrayList<>();
    private ArrayList<String> sub = new ArrayList<>();
    private int[][] allSubjects = new int[schoolStudents.getNumberOfStudents()][studentSubject.getNumberOfSubjects()];

    public void setScores() {
        Scanner input = new Scanner(System.in);
        for (int student = 0; student < schoolStudents.getNumberOfStudents(); student++) {
            String studentAtIndex = String.format("Student" + String.valueOf(student));
            allStudents.add(studentAtIndex);
            for (int subject = 0; subject < studentSubject.getNumberOfSubjects(); subject++) {
                System.out.println("Entering Score for Student " + (student + 1));
                System.out.println("Enter Score for subject " + (subject + 1));
                String scores = input.nextLine();
                int score = Integer.parseInt(scores);
                allSubjects[student][subject] += score;
            }
        }
    }

    public ArrayList getAllStudents() {
        return allStudents;
    }

    public int[][] getGetAllSubject() {
        return allSubjects;
    }

    public ArrayList subjectNumber() {
        for (int item = 0; item < studentSubject.getNumberOfSubjects(); item++) {
            String addSub = String.format("SUB" + String.valueOf(item));
            sub.add(addSub);
        }
            return sub;
    }
public int []calculateTotalScores(int [][] scores){
        int [] total = new int[scores.length];
    for (int index = 0; index < scores.length; index++) {
        for (int score = 0; score < scores[index].length; score++) {
            total[index] += scores[index][score];
        }
    }
return total;
}
public int [] calculateAverageScores(int[][] scores){
        int [] average = new int[scores.length];
    for (int index = 0; index < scores.length; index++) {
        for (int score = 0; score < scores[index].length; score++) {
            average[index] += scores[index][score] / (score+1);
        }
    }
return average;
    }

    }






