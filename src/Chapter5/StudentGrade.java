package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumAGrade=0;
        int sumBGrade=0;
        int sumCGrade =0;
        int sumDGrade = 0;
        int sumFGrade =0;
        for (int index = 0;index<5;index++){
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your grade: ");
            String grade = input.nextLine();
            int studentGrade = Integer.parseInt(grade);
            switch (studentGrade/10){
                case (9) ->sumAGrade++;

                case (10) ->sumAGrade++;

                case (8) -> sumBGrade++;

                case (7) ->sumCGrade++;

                case (6) -> sumDGrade++;

                default-> sumFGrade++;

            }

        }System.out.println("The number of students that got A grade are: " + sumAGrade);
        System.out.println("The number of students that got B grade are: " + sumBGrade);
        System.out.println("The number of students that got C grade are: " + sumCGrade);
        System.out.println("The number of students that got D grade are: " + sumDGrade);
        System.out.println("The number of student that got F grade are: " + sumFGrade);
    }
}
