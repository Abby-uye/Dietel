package tdd;

import ConceptPractise.CallDiffrentFunctions;
import org.junit.jupiter.api.Test;

public class CallDifferentFunctions {
    @Test
    public void testThatICanCallDifferentFunctions(){
        CallDiffrentFunctions diffrentFunctions = new CallDiffrentFunctions();
        diffrentFunctions.displayNumber(diffrentFunctions.collectNumber(4));
    }
}
