package chapter3;

import java.util.Scanner;

public class Number312Test {
    public static void main(String[] args) {
        Scanner petrolStation = new Scanner(System.in);
        Number312 buyPetrol = new Number312("Yaba", "Fuel", 70, 500, 30);

        //System.out.printf("The location of the petrol Station is %s %n",buyPetrol.getLocation());
       //System.out.printf("The type of petrol is %s%n", buyPetrol.getPetrolType());
       //System.out.printf("The quantity of petrol you bought is %d liters%n",buyPetrol.getQuantityOfPurchase());
        //System.out.printf("The price per liter is %.2f$%n", buyPetrol.getPricePerLiter());
        //System.out.printf("The discount on your petrol purchase is %.1f$%n", buyPetrol.getPercentageDiscount());
        //System.out.printf("The total amount you are going to pay for your purchase is %.2f ", buyPetrol.getPurchaseAmount());

        System.out.print("Enter your location: ");
        String userLocation = petrolStation.nextLine();
         buyPetrol.setLocation(userLocation);
        System.out.printf(" The location of the fuel Station is %s%n",buyPetrol.getLocation());

        System.out.print("\nEnter the type of petrol:");
        String userType = petrolStation.nextLine();
        buyPetrol.setPetrolType(userType);
        System.out.printf("The type of of petrol is %s%n",buyPetrol.getPetrolType());

        System.out.print("\nEnter the quantity of petrol you are purchasing: ");
        int userInput3 = petrolStation.nextInt();
        buyPetrol.setQuantityOfPurchase(userInput3);
        System.out.printf("The quantity of petrol you are purchasing is is %s%n liter",buyPetrol.getQuantityOfPurchase());


        System.out.print("\nEnter the price  of petrol per liter:");
        double userInput4 = petrolStation.nextDouble();
        buyPetrol.setPricePerLiter(userInput4);
        System.out.printf("The price per liter is %.2f$%n", buyPetrol.getPricePerLiter());

        System.out.print("\nEnter the discount in your purchase: ");
        double userInput5 = petrolStation.nextDouble();
        buyPetrol.setPercentageDiscount(userInput5);
        System.out.printf("The discount on your petrol purchase is %.1f$%n", buyPetrol.getPercentageDiscount());

        System.out.printf("\nThe total amount you are going to pay for your purchase is %.2f ", buyPetrol.getPurchaseAmount());


















    }
}
