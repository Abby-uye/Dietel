package ClassWork;

import java.util.Scanner;

public class StrringArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userInput = {"Abc21f","13cpz","A1l"};
        System.out.println(returnDigit(userInput));
    }
public static int returnDigit(String[] letters){
        int count =0;
        String checker = "";
        for (int item = 0;item <letters.length;item++){
            checker = letters[item];
            for (int index =0; index < checker.length();index++){
                switch (checker.charAt(index)) {
                    case '1','2', '3','4','5','6','7','8','9','0' -> count++;
                }
            }
        }return count;


    }

}
