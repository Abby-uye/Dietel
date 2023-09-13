
    public class Accounts {
        private int balance;

        public void deposit(int  balance){
            this.balance = balance;
        }

        public void withdrawal(int balance){
            this.balance = balance;
        }
        public int checkBalance(){
            return balance;
        }

    }
