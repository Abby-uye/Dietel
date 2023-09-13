package ClassWork;

import java.util.Scanner;

public class CollectUserScore {
    public static void main(String[] args) {
        Scanner score =new Scanner(System.in);
        System.out.println("Enter your score:");
        int userScore = score.nextInt();
        if(userScore > 90 && userScore == 100){
            System.out.println("congratulations! you were graded A in the last exam, weldone you did great");
        } else if (userScore > 80 && userScore <= 90) {
            System.out.println("congratulations! you were graded B in your last exam,you can do better");

        } else if (userScore > 70 && userScore <= 80 ) {
            System.out.println("you were graded C in your last exam, you can do better");

        } else if (userScore > 60 && userScore <= 70) {
            System.out.println("Your were graded D in your last exam, read some more");

        }else System.out.println("You were graded F in your last exam, olodo");

    }
}
