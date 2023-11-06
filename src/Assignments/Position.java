package Assignments;

public class Position {
    public int [] calculatePosition (int [] total) {
        int position = 1;
        int[] sortScore = new int[total.length];
        for (int index = 0; index < total.length; index++) {
            for (int index1 = index; index1 < total.length - 1; index1++) {
                if (total[index] < total[index1+1]) {
                    int temp = total[index];
                    total[index] = total[index1+1];
                    total[index1+1] = temp;
                }

            }
        }
        return total;
    }
}
