package Assignments;

public class Subject {
    private int numberOfSubjects;
    public Subject(int numberOfSubjects){
        if (numberOfSubjects <= 0){
            throw new IllegalArgumentException("Number of subjects must be greater than 0");
        }
        this.numberOfSubjects = numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;

    }
    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }
}
