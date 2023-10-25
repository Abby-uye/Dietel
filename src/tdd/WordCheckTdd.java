package tdd;

import ClassWork.WordsCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordCheckTdd {
    @Test
    void testThatIsAnagram(){
        WordsCheck anagram = new WordsCheck();
        boolean theAnagramToCheck = WordsCheck.isAnagram("mary","army");
        assertTrue(theAnagramToCheck);
    }
}
