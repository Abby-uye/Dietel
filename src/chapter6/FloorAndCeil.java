package chapter6;

public class FloorAndCeil {
    public static int ciel(double number){
        return (int) (number%10);
    }
    public static int floor(double number){
        return (int) (number%10);
    }

    public static void main(String[] args) {
        System.out.println(floor(5.9));
    }
}
