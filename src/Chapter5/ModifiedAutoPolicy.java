package Chapter5;

import java.util.Scanner;

public class ModifiedAutoPolicy {
    Scanner input = new Scanner(System.in);
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel,
                              String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }


    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if (state == "CT" || state == "MA" || state =="ME" || state == "NH" || state == "NJ" || state=="NY" || state=="PA" || state == "VT"){
            this.state = state;
        }else System.out.println("Enter a northeast state");

    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
return noFaultState;
    }
}
