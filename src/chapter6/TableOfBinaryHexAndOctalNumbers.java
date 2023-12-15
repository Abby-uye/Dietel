package chapter6;

import java.util.Scanner;

public class TableOfBinaryHexAndOctalNumbers {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\t\t\tOctal\t\tHexadecimal");

        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexadecimal = Integer.toHexString(i);

            System.out.printf("%d\t\t\t%s\t\t\t%s\t\t\t%s\n", i, binary, octal, hexadecimal);
        }

    }
}
