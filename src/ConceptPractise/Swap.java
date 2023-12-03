package ConceptPractise;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        swap(a,b);
        System.out.println(a + " "+ b);

    }
    public static void swap (int a,int b){
        int swap = b;
        b = a;
        a = swap;
        System.out.println(a+" "+b);
    }
}
