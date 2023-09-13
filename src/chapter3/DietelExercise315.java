package chapter3;

public class DietelExercise315 {
    private String name;
    private double balance;

    public DietelExercise315(String name, double balance){
        this.name =name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }
        public void setDeposit (double depositAmount){
        if (depositAmount >0.0) {
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void callMethod(){
        System.out.println("In callMethod method");
    }

    public static void anotherMethod(){
        callMethod();
    }

    //public static void displayAccount(DietelExercise315 account1,DietelExercise315 account2){
      //  account1.name = name;
      //  account2.name = name;
       // account1.balance = balance;
       // account2.balance = balance;
   // }
}
