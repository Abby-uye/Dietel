package ClassWork;

public class ForLoop {
    public static void main(String[] args) {
        int number = 1;
        int number1 = 1;
        for (number = 6; number <= 20; number++) {
            for (number1 = 6; number1 <= 20; number1 = number1+2) {
                System.out.println(number+" "+number1);
            }
            System.out.println();
        }
    }
}