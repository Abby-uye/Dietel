package Assignments;

import java.util.Scanner;

public class DaysOfChristmas {
    public static void main(String[] args) {
        Scanner daysOfChristmas = new Scanner(System.in);
        System.out.print(""" 
                press 1 -> for first day of christmas lyrics
                press 2 -> for second day of christmas lyrics
                press 3 -> for third day of christmas lyrics 
                press 4 -> for fourth day of christmas lyrics
                press 5 -> for fifth day of christmas lyrics
                press 6 -> for sixth day of christmas lyrics
                press 7 -> for seventh day of christmas  lyrics
                press 8 -> for eight day of christmas lyrics
                press 9 -> for ninth day of christmas lyrics
                press 10 -> for tenth day of christmas lyrics 
                press 11 -> for 11th day of christmas lyrics 
                press 12 -> for 12th day of christmas song lyrics
                """);
        int userInput = daysOfChristmas.nextInt();
        switch (userInput){
            case 1:
                System.out.println("first day of christmas: ");
                System.out.println("On the first day of Christmas\n" +
                        "My true love sent to me\n" +
                        "A partridge in a pear tree!");
                break;

            case 2:
                System.out.println("second day of christmas: ");
                System.out.println("On the second day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                break;

            case 3:
                System.out.println("third day of christmas: ");
                System.out.println("On the third day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                break;
            case 4:
                System.out.println("fourth day of christmas: ");
                System.out.println("On the fourth day of Christmas (what's a calling bird)\n" +
                        "My true love sent to me\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 5:
                System.out.println("fifth day of christmas: ");
                System.out.println("On the fifth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 6:
                System.out.println("sixth day of christmas: ");
                System.out.println("On the sixth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 7:
                System.out.println("seventh day of christmas: ");
                System.out.println("On the sixth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 8:
                System.out.println("eight day of christmas: ");
                System.out.println("On the eighth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Eight maids a milking'\n" +
                        "Seven swans a swimming'\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds (calling birds)\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 9:
                System.out.println("ninth day of christmas: ");
                System.out.println("On the eighth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Eight maids a milking'\n" +
                        "Seven swans a swimming'\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds (calling birds)\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 10:
                System.out.println("tenth day of christmas:" +
                        "");
                System.out.println("On the tenth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Ten lords a leaping'\n" +
                        "Nine ladies dancing'\n" +
                        "Eight maids a milking'\n" +
                        "Seven swans a swimming'\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 11:
                System.out.println("eleventh day of christmas:");
                System.out.println("On the tenth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Ten lords a leaping'\n" +
                        "Nine ladies dancing'\n" +
                        "Eight maids a milking'\n" +
                        "Seven swans a swimming'\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            case 12 :
                System.out.println("twelfth day of christmas: ");
                System.out.println("On the twelfth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Twelve drummers drumming'\n" +
                        "Eleven pipers piping'\n" +
                        "Ten lords a leaping'\n" +
                        "Nine ladies dancing'\n" +
                        "Eight maids milking'\n" +
                        "Seven swans a swimming'\n" +
                        "Six geese a laying'\n" +
                        "Five golden rings!\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves\n" +
                        "And a partridge in a pear tree!");
                    break;
            default:
                System.out.println("Happy new year");
        }
    }
}
