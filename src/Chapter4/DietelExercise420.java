package Chapter4;

public class DietelExercise420 {

    private String name;
    private int amountEarned;
    private int tax;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCitizenEarnings(int amountEarned) {
        this.amountEarned = amountEarned;
    }


    public int getCitezenEarnings() {
        return amountEarned;
    }

    public void calculatedTax(int amountEarne) {
        if (amountEarned <= 30000){
            amountEarned = amountEarned *15 /100;
        }else amountEarned = amountEarned * 20 / 100;
        this.tax = tax;

    }
public int getTax(){
        return tax;
}
    }


