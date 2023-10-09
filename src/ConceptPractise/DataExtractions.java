package ConceptPractise;

import java.util.Scanner;

public class DataExtractions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the row you want to access");
        int row = input.nextInt();
        System.out.println("Enter start position");
        int startPosition = input.nextInt();
        System.out.println("Enter end position");
        int endPosition = input.nextInt();
        int[][] dataSet = {
                {2,4,5,6},
                {5,7,9,7},
                {9,6,7,8},
                {6,8,7,5}

        };

    }
}
