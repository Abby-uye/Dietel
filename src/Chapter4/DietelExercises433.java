package Chapter4;

public class DietelExercises433 {
    public static void main(String[] args) {
        int number = 1;
        int secondNumber = 0;
        while (number <= 8) {
            while (secondNumber <= 8) {
                System.out.print("*");
                System.out.print(" ");
                System.out.println();
                secondNumber += 1;
            }
            number+=1;

        }
    }
}