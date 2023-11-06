package assignmentTdd;


import org.junit.jupiter.api.Test;
import Assignments.Students;
import Assignments.Subject;
import Assignments.Scores;
import static org.junit.jupiter.api.Assertions.*;
public class Studenttdd {
    @Test
    void  testThatCanInputAccurateNumberOfStudentsConstructor(){
       Students student = new Students(5);
      int expected = 5;
      assertEquals(5 , student.getNumberOfStudents());
    }
    @Test
    void  testThatCanInputAccurateNumberOfStudentsConstructorException() {
        Students student = new Students(0);
        try {
            student = new Students(0);
        } catch (IllegalArgumentException e) {
            System.out.printf("IllegalException while initializing student:", e.getMessage());
        }
    }
    @Test
    void  testThatCanInputAccurateNumberOfStudentsSetName(){
        Students student = new Students(5);
        student.setNumberOfStudents(8);
        int expected = 8;
        assertEquals(expected , student.getNumberOfStudents());
    }
    @Test
    void testThatCanTestSubjectConstructor(){
        Subject subject = new Subject(6);
        int expected = 6;
        assertEquals(expected,subject.getNumberOfSubjects());
    }
@Test
    void testThatCanSetNumberOfSubject(){
    Subject subject = new Subject(6);
    subject.setNumberOfSubjects(8);
    int expected = 8;
    assertEquals(expected,subject.getNumberOfSubjects());
}
@Test
    void testThatCanAddScore(){
     Scores  score = new Scores();


}
}
