package Chapter4;

import java.util.Scanner;

public class pependicularToAnAxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 ");
        int x1 = scanner.nextInt();

        System.out.println("Enter y1 ");
        int y1 = scanner.nextInt();

        System.out.println("Enter x2 ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 ");
        int y2 = scanner.nextInt();

        if (x1 == y1 && x2 == y2 ){
            System.out.println("It is  perpendicular to an axis");
        }
    }
}
