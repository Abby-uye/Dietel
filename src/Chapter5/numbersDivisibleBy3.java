package Chapter5;

public class numbersDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int index = 0;index<30;index++){
            if (index %3 == 0){
                sum+=index;
            }
        }
        System.out.println(sum);
    }
}
