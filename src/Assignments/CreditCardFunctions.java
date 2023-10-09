package Assignments;

public class CreditCardFunctions {
     int[] cardNumbers;
     int[] doubledCardNumbers ;
     int result = 0;
     int oddTotal = 0;
     boolean validNumber = true;
     int sumOfOddAndSingleNumbers =0;
     String creditCardType = "";
     int creditCardLen = 0;
    public  int [] creditCardNumber (int[] cardNumbers){
        this.cardNumbers = cardNumbers;
        doubledCardNumbers = new int[cardNumbers.length/2];
        int count = cardNumbers[0];
        int result = 0;
        int sum =0;
        int seperator =0;
        for (int index = 0; index < cardNumbers.length;index+=2){
           result = count * 2;
            count = cardNumbers[index];
           if (result >= 10 || result<=99){
               while (result!= 0){
                   seperator = result % 10;
                   sum +=result;
                    result /= 10;
                   doubledCardNumbers = new int[]{result};
               }
           }else count = cardNumbers[index];
        }
return doubledCardNumbers = new int[] {result};
    }
    public String creditCardType(){

        if (cardNumbers [0] == 4){
            creditCardType.equals("VisaCard");
        } else if (cardNumbers [0] ==5) {
            creditCardType.equals("MasterCard");
        } else if (cardNumbers[0] == 37) {
            creditCardType.equals("AmericanExpressCards");
        } else if (cardNumbers[0] == 6) {
            creditCardType.equals("DiscoverCard");
        }else creditCardType.equals("Invalid");
    return creditCardType;
    }
    public int creditCardLenght(){
        int count = 1;
        for (int item = 0;item<=cardNumbers.length;item++){
            count+=count;
        }return count;
    }
public int addSingleNumbers(){
        int count = 0;
    for (int index = 0;index<doubledCardNumbers.length;index++ ){
           result +=doubledCardNumbers[count];
        }
    return result;
    }
public int sumNumbersAtOddPosition(){
        int count = 1;
        for (int index =0; index<cardNumbers.length; index++){
            oddTotal+=cardNumbers[count];

        }return oddTotal;
}
public boolean sumOddAndSingleNumbers(){

        sumOfOddAndSingleNumbers = result+oddTotal;
        if (sumOfOddAndSingleNumbers %2 == 0){
            validNumber = true;
            System.out.println("Credit Card Validity Status: Valid");
        } else if (sumOfOddAndSingleNumbers %2 != 0) {
            validNumber = false;
            System.out.println("Credit Card Validity Status: Invalid");
        }

    return validNumber;
    }

}
