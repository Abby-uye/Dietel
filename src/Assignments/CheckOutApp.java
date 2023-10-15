package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("What is the customer's name: ");
        String customerName = inputs.nextLine();
        System.out.println("What is your name: ");
        String cashierName = inputs.next();
        String sentinel = "No";
        String addMore = "";
        ArrayList<Integer> quantitity = new ArrayList<>();
        ArrayList<String> nameOfProduct = new ArrayList<>();
        ArrayList<Integer> pricesOfItem = new ArrayList<>();
        ArrayList<Double> total = new ArrayList<>();
        int itemTotal = 0;
        int itemPrice = 0;
        int numberOfItem = 0;
        do {
            System.out.println("Please enter the name of product you want to buy");
            String productName = inputs.next();
            nameOfProduct.add(productName);

            System.out.println("How many pieces");
            String numberOfItems = inputs.next();
            if (numberOfItems.matches("\\%d+")) {
                numberOfItem = Integer.parseInt(numberOfItems);
                quantitity.add(numberOfItem);
            } else {
                System.out.println("Enter a correct input");
                System.out.println("How many pieces");
                numberOfItems = inputs.next();
            }

            System.out.println("What is the price of item per unit: ");
            String priceOfItem = inputs.next();
            if (priceOfItem.matches("\\%d+")) {
                itemPrice = Integer.parseInt(priceOfItem);
                pricesOfItem.add(itemPrice);

            } else {
                System.out.println("Enter the correct item price:");
                System.out.println("What is the price of item per unit: ");
                priceOfItem = inputs.next();
            }

            double totalPerSetOfItem = (double) itemPrice * numberOfItem;
            total.add(totalPerSetOfItem);
            System.out.println("Want to add more? ");
            addMore = inputs.next();

        } while (!addMore.equals(sentinel));
        double subTotal = 0;
        for (int item : pricesOfItem) {
            for (int items : quantitity) {
                subTotal += item * items;
            }
        }

        double discount = (double) 8 / 100 * subTotal;
        double vat = (double) 17.50 / 100 * subTotal;
        double billTotal = subTotal - discount + vat;
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312 Herbert Maculay Way,Sabo,Yaba,Lagos.
                Tel: 09071272729
                Date: 11-10-2023,08:55:11 pm
                Cashier Name: %s%n
                Customer Name: %s%n
                --------------------------------------------------------------
                ---------------------------------------------------------------
                      ITEM       QUANTITY         PRICE          TOTAL(NGN)       
                ----------------------------------------------------------------
                %s     %d      %f        %f%n
                ----------------------------------------------------------------
                     SubTotal:     %f%n      Discount:         %f%n          Vat @ 17.5:    %f%n  
                 -----------------------------------------------------------------
                 ------------------------------------------------------------------
                                         Bill Total:     %f%n                       
                -------------------------------------------------------------------
                 -------------------------------------------------------------------
                             This Is Not A Receipt Kindly Pay %f%n                
                -------------------------------------------------------------------
                -------------------------------------------------------------------
                """, customerName, cashierName, nameOfProduct, quantitity, pricesOfItem, total, subTotal, discount, vat, billTotal, billTotal);

        System.out.println("Amount tendered by customer: ");
        String tenderedAmount = inputs.next();
        double tenderedCash = 0;
        if (tenderedAmount.matches("\\%d+")) {
            tenderedCash = Integer.parseInt(tenderedAmount);
        } else {
            System.out.println("Amount tendered by customer: ");
            tenderedAmount = inputs.next();
        }
    double balance =tenderedCash - billTotal;

        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312 Herbert Maculay Way,Sabo,Yaba,Lagos.
                Tel: 09071272729
                Date: 11-10-2023,08:55:11 pm
                Cashier Name: %s%n
                Customer Name: %s%n
                --------------------------------------------------------------
                ---------------------------------------------------------------
                      ITEM       QUANTITY         PRICE          TOTAL(NGN)       
                ----------------------------------------------------------------
                %s     %d      %f        %f%n
                ----------------------------------------------------------------
                     SubTotal:     %f%n      Discount:         %f%n          Vat @ 17.5:    %f%n  
                 -----------------------------------------------------------------
                 ------------------------------------------------------------------
                                         Bill Total:     %f%n                       
                -------------------------------------------------------------------
                 -------------------------------------------------------------------
                             This Is Not A Receipt Kindly Pay %f%n                
                -------------------------------------------------------------------
                -------------------------------------------------------------------
                """, customerName, cashierName, nameOfProduct, quantitity, pricesOfItem, total, subTotal, discount, vat, billTotal, billTotal);

    }
}