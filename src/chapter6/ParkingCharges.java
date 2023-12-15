package chapter6;

public class ParkingCharges {
    public static  double calculateCharges(int hoursParked){
        double threeHoursMinimumCharge  = 2.00;
        double extraChargePerHour = 0.50;
        double parkingCharges = 0.00;
        if (hoursParked <= 3 ) parkingCharges = threeHoursMinimumCharge;
        else if (hoursParked > 3 && hoursParked <= 23) parkingCharges = extraChargePerHour * (hoursParked-3);
        else if (hoursParked == 24) parkingCharges = 10.0;

        return parkingCharges;
    }

    public static void main(String[] args) {
        double yourParkingCharge = calculateCharges(22);
    }
}
