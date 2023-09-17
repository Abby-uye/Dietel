package Assignments;

public class LogisticRidersPay {


    public static int paySlip (int  numberOfDeliveries){
        int commission;
        int base = 5000;
        int payment;
        if (numberOfDeliveries < 50) {
            commission = 160 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);
        } else if (numberOfDeliveries > 49 && numberOfDeliveries < 60) {
            commission = 200 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);
            
        } else if (numberOfDeliveries > 59 && numberOfDeliveries < 70) {
            commission = 250 * numberOfDeliveries;
            payment = base + commission;
            System.out.println("Your pay for the day is " + payment);

        }else
            commission = 500 * numberOfDeliveries;
        payment = base + commission;
        System.out.println("Your pay for the day is " + payment);


        return payment ;
    }

}
