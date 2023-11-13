package Assignments;

public class Students {
    private String numberOfStudents;
    private String numberOfSubjects;
    public Students (String numberOfStudents,String numberOfSubjects){

        this.numberOfSubjects = numberOfSubjects;
        this.numberOfStudents = numberOfStudents;

    }

    public void setNumberOfStudents(String numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
public String getNumberOfStudents(){
        return numberOfStudents;
}
    public void setNumberOfSubjects(String numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;

    }
    public String getNumberOfSubjects() {
        return numberOfSubjects;
    }
}
