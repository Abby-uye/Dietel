package chapter6;

public class DistanceBetweenPoints {
    public static double calculateDistance(double x1Coordinate,double y1Coordinate ,double x2Coordinate,double y2Coordinate){
        double subtractXCoordinates =x1Coordinate - x2Coordinate;
        double squareXCoordinates = subtractXCoordinates *subtractXCoordinates;
        double subtractYCoordinates =y1Coordinate - y2Coordinate;
        double squareYCoordinates = subtractYCoordinates *subtractYCoordinates;
        double squaredResult = squareXCoordinates + squareYCoordinates;
        return Math.sqrt(squaredResult);
    }

    public static void main(String[] args) {
        System.out.println(calculateDistance(2, 4, 2, 6));
    }
}
