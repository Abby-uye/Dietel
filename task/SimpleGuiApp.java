package task;

import javax.swing.*;

public class SimpleGuiApp {

    public static String s (){
        return "Click";
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        JLabel label = new JLabel(s());
        JButton button = new JButton(s());


        frame.add(label);
        frame.add(button);


        frame.setVisible(true);
    }
}

