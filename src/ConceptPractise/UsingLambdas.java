package ConceptPractise;

import java.util.stream.IntStream;

public class UsingLambdas {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n" , IntStream.rangeClosed(1,10).sum());

        System.out.printf("Sum of the even numbers from one to twenty is : %d%n",IntStream.rangeClosed(1,10)
                .map(x -> x * 2).sum());
    }
}
