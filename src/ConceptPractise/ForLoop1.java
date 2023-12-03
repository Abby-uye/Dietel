package ConceptPractise;

public class ForLoop1 {
    public static void main(String[] args) {
//        for(int natural = 1; natural<= 10;natural++){
//            System.out.println("the natural numbers are " + natural);
//        }
        for( int index = 0;index<10;index++){
            for (int item = 0; item <= index; item++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
