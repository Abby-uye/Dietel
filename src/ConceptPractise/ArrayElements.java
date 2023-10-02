package ConceptPractise;

import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char [][]  numbers = {
                {'x', ' ','|',' ' , 'o',' ','|',' ','x'},
                {'x',' ','|',' ','x',' ','|',' ','o'}, {'o',' ','|',' ','x',' ','|',' ','x'}
        };
        for (int column =0;column <numbers.length;column++){
            for (int row = 0;row<numbers[column].length;row++){
                System.out.print(numbers [column] [row]);
            }
            System.out.println();
        }

            }
        }



