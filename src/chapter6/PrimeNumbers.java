package chapter6;

public class PrimeNumbers {
    public static boolean isPrime( int number){
        for (int numbers = 2; numbers <= Math.sqrt(number) ; numbers++) {
            if (number % numbers ==0)return false;
        }
        return true;
   }

    public static void main(String[] args) {
        for (int index = 0; index <10000 ; index++) {
            if (isPrime(index)) System.out.println(index);
        }
    }
}
