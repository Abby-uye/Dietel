package Assignments;

public class Students {
    private int numberOfStudents;
    public Students (int numberOfStudents){
        if (numberOfStudents <= 0){
            throw new IllegalArgumentException("Number of students must be greater than 0");
        }
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
public  int getNumberOfStudents(){
        return numberOfStudents;
}

}
