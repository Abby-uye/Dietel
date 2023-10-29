package ClassWork;

import java.util.ArrayList;

public class DiffrentFunctions {
    public static int[] removeDuplicate(int[] numbers) {
        int count = 0;
        ArrayList<Integer> duplicatedList = new ArrayList<>();
        for (int index = 0; index <= numbers.length - 1; index++) {
            count = numbers[index];
            for (int item = index+1 ; item <= numbers.length-1; item++) {
                if (count == numbers[item]) {
                    duplicatedList.add(numbers[item]);
                }
            }

        }
        return convertListToArray(duplicatedList);
    }

    public static int[] convertListToArray(ArrayList<Integer> numbers) {
        int[] convertedList = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            convertedList[i] = numbers.get(i);
        }
        return convertedList;
    }

    public static String reversWord(String word) {
        String reversed = "";

        for (int index = word.length() - 8; index >= 0; index--) {
            char character = word.charAt(index);
            reversed += String.valueOf(character);
        }

        return reversed;
    }

    public static String reverseWord2(String word) {
        reversWord(word);
        String reversed = "";
        for (int index = word.length() - 2; index > 0; index--) {
            char character = word.charAt(index);
            reversed += String.valueOf(character);

        }

        return reversed;
    }

    public static boolean palindrome(String word) {
        String reverse = "";
        boolean result = false;
        for (int index = word.length() - 1; index >= 0; index--) {
            char character = word.charAt(index);
            reverse += String.valueOf(character);
        }
        if (reverse.equals(word)) {
            result = true;
        }
        return result;
    }

    public static ArrayList<Integer> dominantElements(int[] numbers) {
        return null;

    }

    public static boolean checkArray(int[] numbers, int number) {
        boolean check = false;
        for (int item = 0; item < numbers.length; item++) {
            if (numbers[item] == number) {
                check = true;
            }
        }
        return check;
    }

    public static boolean checkIndices(String numbers, int start, int stop, int target) {
        boolean answer = false;
        int[] checker = new int[numbers.length()];
        for (int index = 0; index < numbers.length() - 1; index++) {
            char character = numbers.charAt(index);
            if (Character.isDigit(character)) {
                int numberCheck = Character.getNumericValue(character);
                checker[index] = numberCheck;
            } else {
                String number = String.valueOf(numbers.charAt(index));
                int numberCheck = Integer.parseInt(number);
                checker[index] = numberCheck;
            }

            if (checker[start] < target && checker[stop] > target) {

                answer = true;
            }

        }
        return answer;
    }







}



