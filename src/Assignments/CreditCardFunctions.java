package Assignments;

public class CreditCardFunctions {
    public static void main(String[] args) {
        int [] numbers = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
//        creditCardNumber(numbers);
    }
int [] cardNumbers ={};
   public static String cardValidation(String cardNumbers){
       int sum =0;
       int oddPositionSum = 0;
       int totalSum =0;
       String  valid = "Valid";
       String invalid = "Invalid";
       for (int item =0;item<cardNumbers.length();item+=2){
           String number = String.valueOf(cardNumbers.charAt(item));
           int result = (Integer.parseInt(number)) * 2;
           if (result >=10){
               while (result!=0){
                   int seperator = result % 10;
                   sum+=seperator;
                   result/=10;
               }
           }else sum+=result;
       }for (int index =1;index<cardNumbers.length();index+=2){
           oddPositionSum  += cardNumbers.charAt(index);
       }totalSum = sum + oddPositionSum;
       if ( totalSum / 10 ==0){
        return valid;

       }else return invalid;

    }
//    public static String creditCardType(){
//        String creditCardType ="";
//        switch (cardNumbers(0)charAt{
//            case 4 -> creditCardType.equals("VisaCard");
//            case 5 -> creditCardType.equals("MasterCard");
//            case 37 -> creditCardType.equals("American Express Cards");
//            case 6 -> creditCardType.equals("Discover  Card");
//            default -> creditCardType.equals("Invalid");
//        }
//
//    return creditCardType;
//    }

}
