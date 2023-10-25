package assignmentTdd;

import Assignments.CeaserCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class CeaserCipherTdd {
        @Test
        void TestThatCanEncrypt(){
            String  actual = String.valueOf(CeaserCipher.encrypt("hello"));
            String expected = "khoor";
            assertEquals(expected,actual);

        }
        @Test
        void TestThatCanDecrypt(){
            String actual = String.valueOf(CeaserCipher.decrypt("khoor"));
            String expected = "hello";
            assertEquals(expected,actual);
        }

    }


