package ClassWork;

public class WordsCheck {


    public static boolean isAnagram(String word, String anotherWord) {
        boolean check = false;
        String temp = "";
        for (int index = 0; index < word.length(); index++) {
            for (int item = 0; item < word.length(); item++) {

                if (word.charAt(index) == anotherWord.charAt(item)) {
                    temp = String.valueOf(index);
                }
            }
        }
        for (int indeces = 0; indeces < temp.length(); indeces++) {
            if (word.charAt(indeces) == temp.charAt(indeces)) {
                check = true;
                break;
            } else return false;
        }

        return check;
    }
    }