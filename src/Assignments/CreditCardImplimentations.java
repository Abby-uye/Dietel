package Assignments;

import java.util.Scanner;



public class CreditCardImplimentations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your credit card number");
        String creditCardNumber = input.next();
        char firstCharacter = creditCardNumber.charAt(0);
        char secondCharacter = creditCardNumber.charAt(1);
        String creditCardType = "";
        String creditCardValidation = "";
        if (firstCharacter == '4'){
            creditCardType = "Visa Cards";
        } else if (firstCharacter == '6') {
            creditCardType = "Discover Cards";
        } else if (firstCharacter == '5') {
            creditCardType = "Master Cards";
        }else if (firstCharacter == '3' && secondCharacter == '7'){
            creditCardType = "American Visa Cards";
        }else{
            creditCardType = "Invalid Cards";
        }
        int evenPosition = 0;
        int oddPosition =0;
        int totalSum =0;

    for (int index =0;index<creditCardNumber.length();index+=2){
        String numbers = String.valueOf(creditCardNumber.charAt(index));
        int multiply = Integer.parseInt(numbers)*2;

        if(multiply > 9){
            int firstValue = multiply%10;
            int secondValue = multiply / 10;
             evenPosition += firstValue+secondValue;
        }else evenPosition +=multiply;

    }for (int index = 0;index<creditCardNumber.length();index+=2){

        String numbers = String.valueOf(creditCardNumber.charAt(index));
        int even = Integer.parseInt(numbers);
          oddPosition += even;
            }totalSum = evenPosition+oddPosition;
        if (creditCardType == "Invalid Cards"){
            creditCardValidation ="Invalid";
        }
        if (totalSum % 10 ==0){
            creditCardValidation  = "valid" ;
        }else creditCardValidation="invalid";

        System.out.print("***********************************\n");
        System.out.printf("** Credit Card Type: %s%n** Credit Card Number: %s%n** Credit Card Length: %d%n** Credit Card Validity: %s%n ",creditCardType,creditCardNumber,creditCardNumber.length(),creditCardValidation);
        System.out.println("**********************************");
    }
}
