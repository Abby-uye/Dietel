package chapter6;

public class GreatestCommonDivisor {
    public static int gcd(int firstNumber, int secondNumber){
        while (secondNumber !=0){
            int temp = secondNumber;
            System.out.println("This is what the temporary variable is holding right now" + temp);
            secondNumber = firstNumber % secondNumber;
            System.out.println("This is the second number after modulo" +secondNumber);
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        System.out.println(gcd(60, 90));
    }
}
