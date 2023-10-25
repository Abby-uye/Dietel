package Assignments;

public class CeaserCipher {

    public static String encrypt(String word) {
        String result = "";
        for (int alpha = 0; alpha <= word.length() - 1; alpha++) {
            char character = word.charAt(alpha);
            char newLetter = (char) (character + 3);
            result += newLetter;

        }

        return result;
    }


    public static String decrypt(String word) {
        String result = "";
        for (int alpha = 0; alpha <= word.length() - 1; alpha++) {
            char character = word.charAt(alpha);
            char newLetter = (char) (character - 3);
            result += newLetter;
        }
            return result;

    }
}