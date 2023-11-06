package Assignments;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CheckOutAppFunctions function = new CheckOutAppFunctions();
function.setCustomerName("uye");
        System.out.println(function.getCustomerName());
        System.out.println(function.saveCustomerItem("bread"));

    }
}
