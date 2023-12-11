package chapter6;

import javax.swing.*;

public class Palindrome {
    public static void palindromeDigits (){
        String word = (JOptionPane.showInputDialog(null, "Enter some letters to check if its palindrome "));
        StringBuilder newWord = new StringBuilder();
        for (int index  = word.length()-1; index >= 0; index --) {
            newWord.append(word.charAt(index));
        }
        if (newWord.toString().equals(word)) System.out.println("The word you entered is palindrome");
    }

    public static void palindromeNumbers(){
        String numbers = JOptionPane.showInputDialog("Enter some numbers to check if its palindrome");
        int number = Integer.parseInt(numbers);
        int answer = number;
        StringBuilder newNumber = new StringBuilder();
        for (int index =0; index< numbers.length();index++){
            int newNumbers = number % 10;
            newNumber.append(String.valueOf(newNumbers));
            number = number / 10;
        }
        int result = Integer.parseInt(newNumber.toString());
        if (result == answer) System.out.println("Yay! The number you entered is a palindrome number");
        else JOptionPane.showMessageDialog(null,"oops! the number you entered is not a palindrome number");

    }

    public static void main(String[] args) {
        palindromeNumbers();
    }
}
