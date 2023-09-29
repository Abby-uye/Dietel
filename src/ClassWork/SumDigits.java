package ClassWork;

public class SumDigits {
    public static int sumDigits(int number) {
        String convert = String.valueOf(number);
        int converted = convert.length();

        int sum = 0;
        int pick = 0;
        for (int numbers = 0;numbers <= converted; numbers++){
            pick = number / power(10,numbers)%10;
           sum = sum + pick;
        }return sum;

    }

    public static  int power(int first,int second){
        int result = 1;
        for (int count = 0; count < second;count ++){
            result *= first;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1111111111));
    }
}
