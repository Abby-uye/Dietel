package ConceptPractise;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] numbers = new int[2][2];
        int counter = 0;
        int item =0;
        for ( counter = 0; counter <=numbers.length; counter++){
            for ( item =0;item<=numbers[counter].length;item++) {
                System.out.println("Enter number" + (counter + 1) + ": ");
                int userInput = input.nextInt();
                numbers[counter][item] = userInput;

            }
            System.out.println(numbers[counter][item]);
            System.out.println();
            }
    }
}
