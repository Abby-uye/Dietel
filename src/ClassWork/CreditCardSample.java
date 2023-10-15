package ClassWork;

public class CreditCardSample {
    public static void main(String[] args) {
        String number = "4575757548464938";
        String cardType = cardType(number);
        String cardValid = cardValidation(number);
        System.out.println("The card type is " + cardType);
        System.out.println("The card is " + cardValid);
    }

   public static String cardType(String numbers){
       String result;
       char firstCharacter = numbers.charAt(0);
       char secondCharacter = numbers.charAt(1);
       if (firstCharacter == '4'){
           result = "Visa Cards";
       } else if (firstCharacter == '6') {
           result = "Discover Cards";
       } else if (firstCharacter == '5') {
           result = "Master Cards";
       }else if (firstCharacter == '3' && secondCharacter == '7'){
           result = "American Visa Cards";
       }else{
           result = "Invalid Cards";
       }
       return result;
   }

   public static String cardValidation(String numbers){
        String result;
        int sumEvenPosition = 0;
       int sumOddPosition = 0;
        for (int i = 0; i < numbers.length(); i += 2) {
           String number = String.valueOf(numbers.charAt(i)); // convert char to string
           int multiply = Integer.parseInt(number) * 2; // convert string to int and multiply by 2
           if (multiply > 9) {
               int firstValue = multiply % 10;
               int secondValue = multiply / 10;
               multiply = firstValue + secondValue;
           }
               sumEvenPosition += multiply;
       }
       for (int i = 1; i < numbers.length(); i++) {
           String num = String.valueOf(numbers.charAt(i)); // convert char to string
           sumOddPosition += Integer.parseInt(num);
       }
       int total = sumEvenPosition + sumOddPosition;

       if (total % 10 == 0){
           result = "Valid";
       }else {
           result = "Invalid";
       }
       return result;
   }
}
