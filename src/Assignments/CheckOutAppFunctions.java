package Assignments;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CheckOutAppFunctions {
private static String storeName;
private static String location;
private static  String customerName;
private static String cashierName;
private static String phoneNumber;
public static ArrayList<String> customerItems = new ArrayList<>();
public static ArrayList<Integer> numberOfItems = new ArrayList<>();
public static ArrayList<Integer> PriceOfItemPerUnit = new ArrayList<>();
 public static String products = "";
 public static int unitOfItem = 0;
 public static int priceperUnit = 0;

    public void setStoreName(String name) {
        this.storeName = name;
    }
    public String getStoreName() {
        return storeName.toLowerCase();
    }
    public void setStoreLocation(String location) {
        this.location = location;
    }
        public String getStoreLocation() {
            return location.toLowerCase();
        }

    public  void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public static String getPhoneNumber(){
        return phoneNumber;
    }
public static void dateAndTime(){
    System.out.println(LocalDateTime.now());
}

    public void setCustomerName(String customerName) {
    this. customerName = customerName;

    }
public String getCustomerName(){
        return customerName.toLowerCase();
}
    public static ArrayList<String> saveCustomerItem(String products) {
       customerItems.add(products);
return customerItems;
    }
public  static ArrayList<Integer> numberOfItems(int number){
        numberOfItems.add(number);
        return numberOfItems;
}

    public static ArrayList<Integer> priceOfItems(int unitPrice) {
        PriceOfItemPerUnit.add(unitPrice);
        return PriceOfItemPerUnit;

    }

public  static  Object  customerAddMoreItem(String answer){
        if (answer.equalsIgnoreCase(" yes")){
                 saveCustomerItem(products);
                 numberOfItems(unitOfItem);
                 priceOfItems(priceperUnit);
            }
            else{

}
    return null;
    }

    public  void setCashierName(String cashierName){
        this.cashierName = cashierName;
    }


    public String getCashierName() {
        return cashierName;
    }

public static String displayDesign(){
    return ">".repeat(50);
}
public static void displayReciept(){
    System.out.printf(storeName+ " MAIN BRANCH\n"+"LOCATION: "+location+"\n"+"TEL: "+phoneNumber+"\n"+"\n"+"CUSTOMER NAME:"+customerName+"\n"+displayDesign()+"\n"+displayDesign());
}
}
