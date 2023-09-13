package ClassWork;

import java.util.Random;
import java.util.Scanner;
public class ValueRandom{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner number = new Scanner(System.in);
        int dice = random.nextInt(6);
        for(int count = 0; count <3;count++){
            System.out.println("Roll the dice");
            int randomNumber = number.nextInt();
            if (randomNumber == dice){
                System.out.println("you won !!");
            }else System.out.println("You loose try again");
        }
    }
}