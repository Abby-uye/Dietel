package chapter6Tdd;

import chapter6.CAIDifficultyLevels;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static chapter6.CAIDifficultyLevels.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CAIDifficultyLevelsTDD {
    @Test
    void testThatCanEnterDifficulytyLevel(){
        assertEquals(1,CAIDifficultyLevels.difficultyLevels(1));
    }
@Test
    void testThatCanGetDifficultyLevel(){

    int randomDigit =CAIDifficultyLevels.setDifficultyLevel(1);
        assertTrue(randomDigit>=0&&randomDigit<10);
}
@Test
    void testThatCanGetRandomNumberWithTwoDigit(){
    int randomDigit =CAIDifficultyLevels.setDifficultyLevel(1);
    assertTrue(randomDigit>=0&&randomDigit<100);
}
}
