package Chapter5;

public class SumationOfSequence {
    public static void main(String[] args) {
        long sum = 0;
        for (int index =1;index<=100;index++){
            sum = sum + index;
            System.out.printf("%d = %d%n",index,sum);
        }
    }
}
