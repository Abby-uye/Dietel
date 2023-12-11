package chapter6;

public class BeautifyingString {
    public static String addFullStop(String word){
        if (! word.endsWith(".")) word+=".";
        return word;
    }
    public static String firstCharacterIsUpperCase(String word){
        String firstCharacter = String.valueOf(word.charAt(0)).toUpperCase() ;
        word = firstCharacter += word.substring(1);
        return word;
    }

    public static String beautifyingString(String word){
        word = addFullStop(word);
        word = firstCharacterIsUpperCase(word);
        return word;

    }
    public static void main(String[] args) {
        System.out.println(beautifyingString("my name is abby"));
    }
}
