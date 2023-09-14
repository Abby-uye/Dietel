package Chapter4;

import java.util.Scanner;

public class DietelExercise417 {

    private int miles;
    private int gallon;


    public void setMiles(int miles) {
        this.miles = miles;

        }


    public int getMiles() {
        return miles;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public int getGallon() {
        return gallon;
    }

    public double amountUsed(int miles, int gallon) {
        double amountUsed = (double) miles / gallon;
        return amountUsed;


    }
}

