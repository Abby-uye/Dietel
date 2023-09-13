import java.util.Scanner;
public class BikeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bike sony = new Bike();
        String honda = sony.setName(sony.setName("honda"));
        sony.setIsOn();
        System.out.printf("%s%s%s%s" , " The name of the bike is " ,sony.getName()," , The bike is on is " ,sony.getIsOn());


    }
}