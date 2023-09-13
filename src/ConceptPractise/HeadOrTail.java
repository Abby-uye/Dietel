package ConceptPractise;

import java.util.Random;
import java.util.Scanner;

public class HeadOrTail {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner number = new Scanner(System.in);
        int coin = random.nextInt(2);
        for (int count = 0 ; count <2; count++){
            System.out.println("Flip the coin");
            int play = number.nextInt();
            if (play == coin){
                System.out.println("You won yayy!!");
            }else System.out.println("You loos try again");
        }

    }
}