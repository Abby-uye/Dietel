package chapter6;

public class PerfectNumbers {
    public  static boolean isPerfect(int number){
        int result =0;
        for (int index = 1; index < number; index++) {
        int numberCheck = number % index;
            if (numberCheck == 0) {
                result+=index;
            }
        }
        return result == number;
    }


    public static void main(String[] args) {
        for (int index = 1; index < 3000; index++) {
            if (isPerfect(index)) {
                System.out.println(index);
                for (int number = 1; number < index; number++) {
                    if (index % number == 0){
                        System.out.println(number);
                    }
                }
                System.out.println();
                System.out.println();
            }
        }
    }
}
