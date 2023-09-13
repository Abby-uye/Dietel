package ClassWork;

public class AccoutSetAndGet {
    private String name;
    private int balance;
    private int withdraw;
    private int deposit;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    public void setDeposit(int deposit) {
        balance = balance + deposit;
        this.deposit = balance;
    }

    public int getDeposit(){
        return balance;
    }
public void setWithdraw(int withdraw){
        balance = balance - withdraw;
        this.withdraw = balance;
    }
public int getWithdraw(){
        return balance;
}

public int getBalance(){
      return balance;
}

}
