package ConceptPractise;

public class CallDiffrentFunctions {

    public static int collectNumber(int number) {
        return number;
    }

    public static int displayNumber(int number) {
        return number;
    }

    public static void main(String[] args) {
           int  result = displayNumber(collectNumber(4));
        System.out.println(result);
    }

}
