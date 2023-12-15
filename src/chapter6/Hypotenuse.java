package chapter6;

public class Hypotenuse {
    public static double hypotenuse(double side1, double side2){
        double side1Square  = side1 * side1;
        double side2Square = side2 * side2;
        double result = side1Square + side2Square;
        return Math.sqrt(result);
    }

    public static void main(String[] args) {
        System.out.println(hypotenuse(5, 12));
    }
}
