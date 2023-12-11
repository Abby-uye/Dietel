package chapter6;

import javax.swing.*;
import java.security.SecureRandom;

public class CoinTossing {
    public enum coin{
        HEAD,TAIL
    }
    public static coin flip(){
        SecureRandom random = new SecureRandom();
        int coin = random.nextInt(1,3);
        if (coin == 1) return CoinTossing.coin.HEAD;
        else
            return CoinTossing.coin.TAIL;
    }

    public static void main(String[] args) {
        coin newCoin;
        int headCount =0;
        int tailCount = 0;
        while (true){
            String play = JOptionPane.showInputDialog(null, "press Toss to play the game and Exit to exit the game");
            if(play.equalsIgnoreCase("Toss")){
                newCoin = flip();
                if (newCoin == coin.HEAD) headCount++;
                else if (newCoin == coin.TAIL) tailCount++;
            } else if (play.equalsIgnoreCase("Exit")) {
                System.out.println("The number of tail counts is " +tailCount);
                System.out.println("The number of head count is " + headCount);
                System.exit(2);

            }
        }

    }
}
