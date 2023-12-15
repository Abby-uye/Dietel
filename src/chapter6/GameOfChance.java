package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfChance {
    private enum STATUS {CONTINUE,WON,LOST};
    private static final int SNAKE_EYES =2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12 ;
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static int rollDice(){
        int die1 = 1+randomNumbers.nextInt(6);
        int die2 = 1+randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player 1 rolled %d + %d = %d ",die1,die2,sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bankBalance = 1000;
        System.out.println("Enter the amount you want to wager ");
        int wager = scanner.nextInt();
        while (wager > bankBalance) {
            System.out.println("You balance is too low for the wager amount, enter an amount lower than you balance");
            wager = scanner.nextInt();
        }
            int myPoint = 0;
            int sumOfDice = rollDice();
            STATUS gameStatus;
            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = STATUS.WON;
                    bankBalance+= wager;
                    System.out.println("Your new account balance is: "+ bankBalance);
                    break;

                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = STATUS.LOST;
                    bankBalance-= wager;
                    System.out.println("Your new account balance is "+ bankBalance);
                    if (bankBalance <=0){
                        System.out.println("Sorry your ass is busted");
                    }
                    break;
                default:
                    gameStatus = STATUS.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    System.out.println("You are up big now is the time ");
                    break;
            }
            while (gameStatus == STATUS.CONTINUE) {
                sumOfDice = rollDice();
                if (sumOfDice == myPoint) {
                    gameStatus = STATUS.WON;

                } else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = STATUS.LOST;
                    }
                    if (gameStatus == STATUS.WON) {
                        System.out.println("Player wins");
                        System.out.println("Take another chance Champ");
                    } else {
                        System.out.println("player losses");
                        System.out.println("oh! are you broke yet?");

                    }

                }

            }

        }
    }


