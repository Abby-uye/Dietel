package Chapter5;

public class IntegersDivisibleByThree {
    public static void main(String[] args) {
        int divisibleNumber = 0;
        for (int number = 1; number <= 30; number ++){
            if (number % 3 == 0) divisibleNumber += number;
        }
        System.out.println("The sum of number divisible by 3 is: "+ divisibleNumber);
    }
}
