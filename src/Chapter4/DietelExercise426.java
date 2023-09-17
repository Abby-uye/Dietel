package Chapter4;

public class DietelExercise426 {
    public static void main(String [] args){
        int row = 5;
        while (row >= 1){
            int column = 5;
            while (column >=1){
                System.out.println(row %2 == 0 ? "x":"o");
                ++column;
            }
            --row;
            System.out.println();

        }
    }
}
