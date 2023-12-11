package Chapter5;

import javax.swing.*;
import java.math.BigDecimal;

public class FairTax {
    public static double expenseAmount(){
        int housingExpense = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your housing expense"));
        int feedingExpense = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your food expense"));
        int clothingExpense = Integer.parseInt(JOptionPane.showInputDialog("Enter your clothing Expense"));
        int transportationExpense = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your transportation expense"));
        int educationExpense = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your education expense"));
        int healthCareExpense = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your health Care expense "));
        int vacationExpense = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your vacation expense"));
        return housingExpense+feedingExpense+clothingExpense+transportationExpense+educationExpense+healthCareExpense+vacationExpense;
    }
    public void taxAmountToPay(){
        double expenseAmount = expenseAmount();
       BigDecimal taxAmount = BigDecimal.valueOf( expenseAmount * ((double) 30 /100));
       JOptionPane.showMessageDialog(null,"Your fair Tax amount is: "+taxAmount);
    }

    public static void main(String[] args) {
        FairTax thisCitizen = new FairTax();
        thisCitizen.taxAmountToPay();
    }
}
