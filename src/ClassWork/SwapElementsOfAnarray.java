package ClassWork;

public class SwapElementsOfAnarray {
    public static int[] swap(int[] numbers, int firstNumber, int secondNumber){

            numbers[firstNumber]= numbers[firstNumber]+numbers[secondNumber];
            numbers[secondNumber] = numbers[firstNumber] - numbers[secondNumber];
            numbers[firstNumber] = numbers[firstNumber]-numbers[2];


   return numbers;
    }

}
