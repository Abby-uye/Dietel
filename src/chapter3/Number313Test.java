package chapter3;

public class Number313Test {
    public static void main(String[] args) {
        Number313 tesla = new Number313("model x", "2023", 45000000);
        Number313 tesla2 = new Number313("model y", "2023", 45000000);
        double price = tesla.getPrice();
        double discount = price * 0.05;

        double price2 = tesla.getPrice();
        double discount2 = tesla.getPrice();
//        tesla.price(5/100 * tesla.setPrice(6899999));
//        tesla2.setPrice(7/100 * tesla2.setPrice(675555));
        System.out.printf("The discounted price for tesla is %.2f%n %s %.2f",discount,"The discounted price for tesla2 is",discount2);
    }
}
