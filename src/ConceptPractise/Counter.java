package ConceptPractise;

public class Counter {
    public static void main(String[] args) {
        int [] array = {49,83,90,78,34,56,};
        int total =0;

        for (int counter = 0;counter < array.length; counter++){
            total+=array[counter];

        }
        System.out.printf("Total of array elements is %d%n",total);
    }
}
