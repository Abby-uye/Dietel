package Chapter5;

public class ModifyInterestRate {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + 0.06, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();

        System.out.println();
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + 0.07, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();

        System.out.println();
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + 0.08, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();

        System.out.println();
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + 0.09, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();

        System.out.println();
        System.out.printf("%s %20s%n","Year", "Amount On Deposit" );
        for (int year = 1;year<=10;year++){
            double amount = principal * Math.pow(1.0 + 0.10, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();
    }
}
