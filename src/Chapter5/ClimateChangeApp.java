package Chapter5;

import javax.swing.*;

public class ClimateChangeApp {
    public static void main(String[] args) {
        ClimateChange climateChange = new ClimateChange();
        int answer = climateChange.userResponse();
        if (answer == 5)JOptionPane.showMessageDialog(null,"Excellent !");
        else if (answer == 4 )JOptionPane.showMessageDialog(null,"Very good !");
        else JOptionPane.showMessageDialog(null,"Time to brush up on your knowledge of global warming");
    }
}
