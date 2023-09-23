package Chapter4;

import java.util.Scanner;

public class Decrypting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four digit integers to decrypt");
        int userInput = input.nextInt();
        while (userInput < 1111 || userInput > 9999){
            System.out.println("Enter four digit integers");
             userInput = input.nextInt();

        }
        int digit1 = userInput / 1000;
        int digit2 = userInput / 100 % 10;
        int digit3 = userInput / 10 % 10;
        int digit4 = userInput % 10;

        digit1 = (digit1 -7);
        digit2 = (digit2 -7) ;
        digit3 = (digit3 -7) ;
        digit4 = (digit4 -7) ;

        int swap = digit1;
        digit1 = digit3;
        digit3 = swap;
        swap = digit2;
        digit2 = digit4;
        digit4 = swap;

        System.out.printf("The decrypted key is %d %d %d %d",digit1, digit2, digit3, digit4);
    }
}
