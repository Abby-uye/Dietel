package chapter6;

import javax.swing.*;

public class CalculatingTheSumOfDigits {
    public static  int sumOfDigits(int digits){
        String digit = String.valueOf(digits);
        int result = 0;
        for (int index  = 0; index  < digit.length(); index ++) {
            result+= digits % 10;
            digits = digits / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a multi-digit number amd ill tell you the sum"));
        number =sumOfDigits(number);
        JOptionPane.showMessageDialog(null, "The sum of the digits is "+ number);
    }
}
