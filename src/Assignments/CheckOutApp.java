package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("What is the customer's name: ");
        String customerName = inputs.nextLine();
        System.out.println("What is your name: ");
        String cashierName = inputs.nextLine();
        String sentinel = "No";
        String addMore = "";
        boolean addMoreCheck = false;
        ArrayList<Integer> quantitity = new ArrayList<>();
        ArrayList<String> nameOfProduct = new ArrayList<>();
        ArrayList<Integer> pricesOfItem = new ArrayList<>();
        ArrayList<Double> total = new ArrayList<>();
        int itemTotal = 0;
        int itemPrice = 0;
        int numberOfItem = 0;
        do {
            System.out.println("Please enter the name of product you want to buy");
            String productName = inputs.nextLine();
            nameOfProduct.add(productName);

            System.out.println("How many pieces");
            String numberOfItems = inputs.nextLine();
            if (numberOfItems.matches("\\d+")) {
                numberOfItem = Integer.parseInt(numberOfItems);
                quantitity.add(numberOfItem);
            } else {
                System.out.println("Enter a correct input");
                System.out.println("How many pieces");
                numberOfItems = inputs.nextLine();
            }

            System.out.println("What is the price of item per unit: ");
            String priceOfItem = inputs.nextLine();
            if (priceOfItem.matches("\\d+")) {
                itemPrice = Integer.parseInt(priceOfItem);
                pricesOfItem.add(itemPrice);

            } else {
                System.out.println("Enter the correct item price:");
                System.out.println("What is the price of item per unit: ");
                priceOfItem = inputs.nextLine();
            }

            double totalPerSetOfItem = (double) itemPrice * numberOfItem;
            total.add(totalPerSetOfItem);

            System.out.println("Want to add more? ");
            addMore = inputs.nextLine().toLowerCase();
            if (addMore == "No") {
                addMoreCheck = true;
            }

        } while (addMoreCheck);

        double subTotal = 0;
        double billTotal = 0;
        for (int item : pricesOfItem) {
            for (int items : quantitity) {
                subTotal += item * items;
            }
        }

        double discount = (double) 8 / 100 * subTotal;
        double vat = (double) 17.50 / 100 * subTotal;
        billTotal = subTotal - discount + vat;

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
                """, cashierName, customerName);
        for (int count = 0; count < quantitity.size(); count++) {
            System.out.printf("""
                                %s     %d      %d        %f%n

                            ----------------------------------------------------------------
                                 SubTotal:         %.2f%n          Discount:         %.2f%n             Vat @ 17.5:    %.2f%n
                             -----------------------------------------------------------------
                             ------------------------------------------------------------------
                                                  Bill Total:     %f%n
                            -------------------------------------------------------------------
                             -------------------------------------------------------------------
                                         This Is Not A Receipt Kindly Pay %f%n
                            -------------------------------------------------------------------
                            -------------------------------------------------------------------
                            """, nameOfProduct.get(count), quantitity.get(count), pricesOfItem.get(count),
                    total.get(count), subTotal, discount, vat, billTotal, billTotal);
        }
        System.out.println("Enter amount tendered by customer: ");
        String tenderedAmount = inputs.next();
        double tenderedCash = 0;
        if (tenderedAmount.matches("\\d+")) {
            tenderedCash = Integer.parseInt(tenderedAmount);
        } else {
            System.out.println(" Enter amount tendered by customer: ");
            tenderedAmount = inputs.next();
        }
        double balance = tenderedCash - billTotal;

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
                             
                """, customerName, cashierName);
        for (int index = 0; index < quantitity.size(); index++) {


            System.out.printf("""
                          
                    %s     %d      %d        %f%n
                    ----------------------------------------------------------------
                         SubTotal:     %f%n      Discount:         %.2f%n          Vat @ 17.5:    %.2f%n
                     -----------------------------------------------------------------
                     ------------------------------------------------------------------
                                             Bill Total:     %f%n
                                             Amount paid:    %f%n
                                             Balance :     %f
                                             
                    -------------------------------------------------------------------
                     -------------------------------------------------------------------
                                 Thank You For Your Patronage
                    -------------------------------------------------------------------
                    -------------------------------------------------------------------
                    """, nameOfProduct, quantitity.get(index), pricesOfItem.get(index), total.get(index), subTotal, discount, vat, billTotal, billTotal,tenderedAmount,balance);
        }
    }
}
