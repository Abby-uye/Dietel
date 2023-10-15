package Chapter5;

public class SumOddInterges53 {
    public static void main(String[] args) {
        int total =0;
        for(int item = 1;item<=100;item+=2){
            System.out.println(item);
            total+=item;
        }
        System.out.println(total);
    }
    }
