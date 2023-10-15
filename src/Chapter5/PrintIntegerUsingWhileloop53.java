package Chapter5;

public class PrintIntegerUsingWhileloop53 {
    public static void main(String[] args) {
        int index = 1;


        while (index <= 20) {
            System.out.print(index);

            if (index % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }

            index++;
        }
    }
}