package chapter7;

public class VariableLengthArgumentList {
    public double average(double ...numbers) {
        double total =0;
        int count = 0;
        for (double number: numbers) {
            count++;
            total+=number;
        }
        String number = String.format("%.2f",total/count);
        return Double.parseDouble(number);
    }

}
