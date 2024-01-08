package chapter7;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] initialArray = new int[11];

        for (int index = 0; index < 36000; index++) {
            int die1 = random.nextInt(1, 7);
            int die2 = random.nextInt(1, 7);
            int sum = die1 + die2;
            if (sum == 2) initialArray[0] ++;
            else if (sum ==3) initialArray[1]++;
            else if (sum ==4) initialArray[2]++;
            else if (sum ==5) initialArray[3]++;
            else if (sum ==6) initialArray[4]++;
            else if (sum ==7) initialArray[5]++;
            else if (sum ==8) initialArray[6]++;
            else if (sum ==9) initialArray[7]++;
            else if (sum ==10) initialArray[8]++;
            else if (sum ==11) initialArray[9]++;
            else if (sum ==12) initialArray[10]++;
        }
        System.out.printf("2: %d%n 3: %d%n 4: %d%n 5: " +
                "%d%n 6: %d%n 7: %d%n 8: %d%n 9: %d%n 10: %d%n 11: %d%n 12: %d%n",initialArray[0],initialArray[1],initialArray[2],
                initialArray[3],initialArray[4],initialArray[5],initialArray[6],initialArray[7],initialArray[8],initialArray[9],initialArray[10]);
    }


}
