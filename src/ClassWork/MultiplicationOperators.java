package ClassWork;

public class MultiplicationOperators {

    public static int multiplication(int number, int number2) {
        int result = 0;
        if (number2 > 0) {
            for (int count = 1; count <= number2; count++) {
             result = result + number;
            }
        }
        else if (number2 < 0) {
            for (int count = 1; count <= number; count++){
                result = result + number2;
            }
        }
        if (number < 0 && number2 < 0) {
            int negative = -1;
            number = number * negative;
            number2 = number2 * negative;
            for (int count = 1; count <= number2; count++){
                result = result + number;
            }

        }

        return result;
    }
}
