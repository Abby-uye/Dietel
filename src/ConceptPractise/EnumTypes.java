package ConceptPractise;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class EnumTypes {
    public static void main(String[] args) {

        enum colors{RED,YELLOW,BLUE}

    String name = showInputDialog(null,"What is your name");
        if (name.startsWith("b")){
            showMessageDialog(null,"Your favorite color is"+colors.BLUE);
        }

}
}