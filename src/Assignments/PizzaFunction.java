package Assignments;

import javax.swing.*;

public class PizzaFunction {
    private static final int NUMBEROFSLICESFORSUPERHUNGRY = 4;
    private static final int NUMBEROFSLICESFORHUNGRY = 2;
    private static final int NUMBEROFSLICESFORCLASSIC = 1;
    private static final int LARGESTBOXCONTAINS = 10;
    private static final int MEDIUMBOXCONTAINS = 6;
    private static final int SMALLBOXCONTAINS = 4;
    private static final int LARGESTBOXPRICE = 5000;
    private static final int LARGEBOXPRICE = 3000;
    private static final int SMALLBOXPRICE =1200;

    public static String boxSizes(String boxSize) {
        return boxSize;
    }

    public static int superHungry(int superHungryGuest) {
        return superHungryGuest;
    }

    public static int hungry(int hungryGuest) {
        return hungryGuest;
    }

    public static int classic(int classicGuest) {
        return classicGuest;
    }

    public static int calculateThatTotalNumberOfSuperHungryGuestWillConsumeTotalNumberOfLargestBoxSize(int numberOfSuperHungryGuest) {
        return numberOfSuperHungryGuest * NUMBEROFSLICESFORSUPERHUNGRY;
    }

    public static int calculateThatTotalNumberOfHungryGuestWillConsumeTotalNumberOfLargeBoxSize(int numberOfHungryGuest) {
        return numberOfHungryGuest * NUMBEROFSLICESFORHUNGRY;
    }

    public static int calculateThatTotalNumberOfClassicGuestWillConsumeTotalNumberOfClassicBoxSize(int numberOfClassicGuest) {
        return numberOfClassicGuest * NUMBEROFSLICESFORCLASSIC;
    }
public static int calculateTheToTalNumberOfSlicesThatTheCustomerWillNeed(int numberOfHungryGuest , int numberOfSuperHungryGuest, int numberOfClassicGuest ){
        return calculateThatTotalNumberOfHungryGuestWillConsumeTotalNumberOfLargeBoxSize (numberOfHungryGuest)+ calculateThatTotalNumberOfSuperHungryGuestWillConsumeTotalNumberOfLargestBoxSize(numberOfSuperHungryGuest)+ calculateThatTotalNumberOfClassicGuestWillConsumeTotalNumberOfClassicBoxSize(numberOfClassicGuest);

}
public static int calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(int theToTalNumberOfSlicesThatTheCustomerWillNeed, int largestBox){
        int result =0;
        if (theToTalNumberOfSlicesThatTheCustomerWillNeed < largestBox){
             result=1;
        }else{
            for (int index  = 0; index  < Integer.MAX_VALUE; index ++) {
                if (index * largestBox > theToTalNumberOfSlicesThatTheCustomerWillNeed){
                    result =index;

                    break;
                }

            }
        }
        return result;
}

    public static int calculateNumberOfLargeBoxToRecommendToCustomerToPurchase(int theToTalNumberOfSlicesThatTheCustomerWillNeed, int mediumBox){
        int result =0;
        if (theToTalNumberOfSlicesThatTheCustomerWillNeed < mediumBox){
            result=1;
        }else{
            for (int index  = 0; index  < Integer.MAX_VALUE; index ++) {
                if (index * mediumBox > theToTalNumberOfSlicesThatTheCustomerWillNeed){
                    result =index;
                    break;
                }

            }
        }
        return result;
    }


    public static int calculateNumberOfSmallBoxToRecommendToCustomerToPurchase(int theToTalNumberOfSlicesThatTheCustomerWillNeed, int smallBox){
        int result =0;
        if (theToTalNumberOfSlicesThatTheCustomerWillNeed < smallBox){
            result=1;
        }else{
            for (int index  = 0; index  < Integer.MAX_VALUE; index ++) {
                if (index * smallBox > theToTalNumberOfSlicesThatTheCustomerWillNeed){
                    result =index;
                    break;
                }

            }
        }
        return result;
    }

    public static int calculateLargestBoxesContainTotalNumberOfSlices(int numberOfLargestBoxToPurchase){
        return numberOfLargestBoxToPurchase * LARGESTBOXCONTAINS;

}
public static int calculateMediumBoxesContainTotalNumberOfSlices(int numberOfMediumBoxesToPurchase){
        return numberOfMediumBoxesToPurchase * MEDIUMBOXCONTAINS;
}
    public static int calculateSmallBoxesContainTotalNumberOfSlices(int numberOfSmallBoxesToPurchase){
        return numberOfSmallBoxesToPurchase * SMALLBOXCONTAINS;
    }
public static int leftOverSlicesForLargestBox(int TotalNumberOfSlicesRecommendedForTheUserToPurchase,int TotalNumberOfSlicesNeeded){
        int result =0;
        if (TotalNumberOfSlicesRecommendedForTheUserToPurchase <= TotalNumberOfSlicesNeeded){
            result = TotalNumberOfSlicesRecommendedForTheUserToPurchase - TotalNumberOfSlicesNeeded;
        }else JOptionPane.showMessageDialog(null,"You do not have any left overs, meanwhile you need to increase your order to meet up your target");
return result;
}
public static int calculatePrice(int numberOfLargebox){
        return numberOfLargebox*LARGESTBOXPRICE;

}
    public static void main(String[] args) {
        int total = 21;
        int large = 10;
        System.out.println(calculateNumberOfLargestBoxToRecommendToCustomerToPurchase(total, large));
    }
}
