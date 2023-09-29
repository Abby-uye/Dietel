package task;

public class SumOfEvenumbers {
    public static void main(String[] args) {
        int evenNumber = 0;
        int sum = 0;
        for (int number =1 ; number <= 10;number++){
            if (number % 2 == 0){
                evenNumber = number;
                 sum = sum +evenNumber;
            }
        }System.out.println("This is the sum of  the even numbers"+sum);
    }
}
