package ClassWork;

public class HcfLenghtOfNumbers {


    public static int[] hcf(int numbers) {
        int result = 0;
        int count = 0;
        int[] expected = new int[numbers];
        for (int index = numbers-1; index >= 0; index--) {
            result = index *= 2;
            if (result % 2 == 0) {
                expected[count] = result;
            }
            count++;

        }
    return expected;
    }
}

