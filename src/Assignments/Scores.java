package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Scores extends Students {
    public Scores(String numberOfStudents, String numberOfSubjects) {
        super(numberOfStudents, numberOfSubjects);
        int numberOfStudent;
        int numberOfSubject;
        try {
            numberOfStudent = Integer.parseInt(numberOfStudents);
            numberOfSubject = Integer.parseInt(numberOfSubjects);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input for the number of students or subjects");
        }

        if (!numberOfStudents.matches("\\d+")) {
            throw new IllegalArgumentException("Input must be a digit");
        }

        if (numberOfStudent <= 0) {
            throw new IllegalArgumentException("Number of students must be greater than 0");
        }

        if (numberOfSubject <= 0) {
            throw new IllegalArgumentException("Number of subjects must be greater than 0");
        }
    }



    private ArrayList<String> allStudents = new ArrayList<>();
    private ArrayList<String> sub = new ArrayList<>();
    private int[][] allSubjects = new int[Integer.parseInt(super.getNumberOfStudents())][Integer.parseInt(super.getNumberOfSubjects())];
    int[] total = new int[Integer.parseInt(super.getNumberOfStudents())];
    double[] average = new double[Integer.parseInt(super.getNumberOfStudents())];

    int [] position = new int [total.length];


    public void setScores() {
        Scanner input = new Scanner(System.in);
        for (int student = 0; student < Integer.parseInt(super.getNumberOfStudents()); student++) {
            String studentAtIndex = String.format("Student " + String.valueOf(student + 1));
            allStudents.add(studentAtIndex);
            for (int subject = 0; subject < Integer.parseInt(super.getNumberOfSubjects()); subject++) {
                System.out.println("Entering Score for Student " + (student + 1));
                System.out.println("Enter Score for subject " + (subject + 1));
                String scores = input.nextLine();
                while (!scores.matches("\\d+")) {
                    System.out.println("Invalid input. Please enter a valid score for Student " + (student + 1) + " and subject " + (subject + 1));
                    scores = input.nextLine();
                }
                int score = Integer.parseInt(scores);
                allSubjects[student][subject] += score;
            }
        }
    }
    public void calculateTotalScoresForEachStudent() {
        for (int index = 0; index < allStudents.size(); index++) {
            for (int score = 0; score < allSubjects[index].length; score++) {
                total[index] += allSubjects[index][score];

            }

        }
    }

    public  void getPosition() {
        for (int index = 0; index < total.length; index++) {
            int count = 1;
            for (int item = 0; item < total.length; item++) {
                if (total[item] <= total[index]) {
                    position[index] = count;
                } else {
                    position[index] = ++count ;
                }
            }
        }
    }


    public void addSub() {
        for (int item = 0; item < Integer.parseInt(super.getNumberOfSubjects()); item++) {
            String addSub = String.format("SUB" + String.valueOf(item + 1));
            sub.add(addSub);
        }
    }


    public void calculateAverageScores() {
            for (int score = 0; score < Integer.parseInt(super.getNumberOfStudents()); score++) {
                average[score] = (double) total[score] / Integer.parseInt(super.getNumberOfSubjects());
            }
        }



    public void displaySub() {
        addSub();
        System.out.print("Subject   ");
        for (int student = 0; student < Integer.parseInt(super.getNumberOfSubjects()); student++) {
            System.out.print(sub.get(student) + "      ");
        }
        System.out.print("Total      ");
        System.out.print("Average   ");
        System.out.println("Position");
        System.out.println();
    }

    public void display(){
        calculateTotalScoresForEachStudent();
        calculateAverageScores();
        getPosition();

        for (int student = 0; student < Integer.parseInt(super.getNumberOfStudents()); student++) {
            System.out.print(allStudents.get(student) + "      ");
            for (int subject = 0; subject < Integer.parseInt(super.getNumberOfSubjects()); subject++) {
                System.out.print(allSubjects[student][subject] + "\t\t");
            }

            System.out.print(total[student]+ "     ");
            System.out.printf("%.1f%s",average[student], "            ");
            System.out.print(position[student]);
            System.out.println();
        }
    }

    public void displaySubjectSummary() {
        System.out.println("SUBJECT SUMMARY");
        for (int index = 0; index < Integer.parseInt(super.getNumberOfSubjects()); index++) {
            System.out.println("Subject " + (index + 1));
            int highestScore = MIN_VALUE;
            int lowestScore = MAX_VALUE;
            int total = 0;
            double average = 0;
            int passCount = 0;
            int failCount = 0;
            for (int item = 0; item < Integer.parseInt(super.getNumberOfStudents()); item++) {
                if (allSubjects[item][index] > highestScore) {
                    highestScore = allSubjects[item][index];
                } else if (allSubjects[item][index] < lowestScore) {
                    lowestScore = allSubjects[item][index];
                }
                if (allSubjects[item][index] > 60) {
                    passCount++;
                } else if (allSubjects[item][index] < 60) {
                    failCount++;

                }
                total += allSubjects[item][index];
                average = (double) total / Integer.parseInt(super.getNumberOfStudents());
            }
            System.out.println("The highest scoring student  for subject " + (index + 1) + " is: " + highestScore);
            System.out.println("The lowest scoring student  for subject " + (index + 1) + " is: " + lowestScore);
            System.out.println("Total score is: " + total);
            System.out.printf("Average score is: %.1f", average);
            System.out.println("Number of passes: " + passCount);
            System.out.println("Number of fails: " + failCount);
            System.out.println();
        }
    }

public  void classSummary() {
    int[] failCount = new int[Integer.parseInt(super.getNumberOfSubjects())];
    int[] passCount = new int[Integer.parseInt(super.getNumberOfSubjects())];
    int theHighestScore =0;
    int theLowestScore =MAX_VALUE;
    int theHighestScorer = 0;
    int theLowestScorer =0;
    int inHighestSubject =0;
    int inLowestSubject=0;
    int [] graduatingStudentScore = new int[Integer.parseInt(super.getNumberOfStudents())];
    int classTotal =0;
    double classAverage = 0;

    for (int index = 0; index < Integer.parseInt(super.getNumberOfSubjects()); index++) {
        int highestScore = MIN_VALUE;
        int lowestScore = MAX_VALUE;
        for (int item = 0; item < Integer.parseInt(super.getNumberOfStudents()); item++) {
            if (allSubjects[item][index] > highestScore) {
                highestScore = allSubjects[item][index];
                theHighestScorer = item;
            } else if (allSubjects[item][index] < lowestScore) {
                lowestScore = allSubjects[item][index];
            }
            if (allSubjects[item][index] >= 60) {
                passCount[index]++;
            } else if (allSubjects[item][index] <= 60) {
                failCount[index]++;
            }if (allSubjects[item][index] > theHighestScore){
                theHighestScore =allSubjects[item][index];
                theHighestScorer = item;
                inHighestSubject = index;
            }if (allSubjects[item][index]< theLowestScore){
                theLowestScore = allSubjects[item][index];
                theLowestScorer =item;
                inLowestSubject = index;
            }
            graduatingStudentScore[item] += allSubjects[item][index];
            classTotal+=allSubjects[item][index];
        }
    }classAverage = (double) classTotal / Integer.parseInt(super.getNumberOfStudents());
    int hardestSubject = 0;
    int cheapestSubject = 0;
    int count = 0;
    int counter = 0;
    for (int index = 0; index < Integer.parseInt(super.getNumberOfSubjects()); index++) {
        if (failCount[index] > count) {
            count = failCount[index];
            hardestSubject = index;
        }
        if (passCount[index] > counter) {
            counter = passCount[index];
            cheapestSubject = index;
        }
    }int bestGraduatingScore =0;
    int worstGraduatingScore =MAX_VALUE;
    int worstGraduatingStudent =0;
    int bestGraduatingStudent =0;

    for (int index = 0; index < Integer.parseInt(super.getNumberOfStudents()); index++) {
        if (graduatingStudentScore[index] > bestGraduatingScore){
            bestGraduatingScore = graduatingStudentScore[index];
            bestGraduatingStudent = index;
        }if (graduatingStudentScore[index] < worstGraduatingScore){
            worstGraduatingScore = graduatingStudentScore[index];
            worstGraduatingStudent = index;
        }

    }
    String design = "=";
    String failDesign = "!";
    String summary = "CLASS SUMMARY";
    System.out.println("The hardest subject is subject " + (hardestSubject + 1) + " with " + count + " number of failures");
    System.out.println("The easiest subject is subject " + (cheapestSubject + 1) + " with  " + counter + " number of passes");
    System.out.println("The overall highest score is scored by student "+ (theHighestScorer+1)+" in subject "+(inHighestSubject+1)+" scoring "+theHighestScore);
    System.out.println("The overall lowest score is scored by student "+(theLowestScorer+1)+ " in subject "+(inLowestSubject+1)+" scoring "+theLowestScore);
    System.out.printf("%s%n%n",design.repeat(80));
    System.out.printf("%50s%n",summary);
    System.out.println(design.repeat(80));
    System.out.println("The best graduating student is student "+(bestGraduatingStudent+1)+" scoring "+bestGraduatingScore);
    System.out.printf("%s%n%n",design.repeat(80));
    System.out.println(failDesign.repeat(80));
    System.out.println("The worst graduating student is student "+(worstGraduatingStudent+1)+" scoring "+worstGraduatingScore);
    System.out.printf("%s%n%n",failDesign.repeat(80));
    System.out.println(design.repeat(80));
    System.out.println("The class to total is: "+classTotal);
    System.out.printf(" The class average is: %.1f%n ",classAverage);
    System.out.println(design.repeat(80));

}

    public ArrayList getAllStudents() {
        return allStudents;
    }

    public int[][] getGetAllSubject() {
        return allSubjects;
    }

}


