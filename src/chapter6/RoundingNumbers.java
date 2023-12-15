package chapter6;

public class RoundingNumbers {
public static void roundNumbers(double number){
    System.out.println("The number before rounding is: "+number);
    int numberAfterFloor = (int) Math.floor(number);
    System.out.println("The number after rounding is: " + numberAfterFloor);
}

    public static void main(String[] args) {
        roundNumbers(39.65);
    }
}
