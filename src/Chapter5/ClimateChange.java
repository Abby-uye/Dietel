package Chapter5;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ClimateChange {
    public static String question1(){
        return """
            What is global warming?
                       
            a) An increase in the Earth's average temperature due to human activities releasing greenhouse gases.
                       
            b) A decrease in the Earth's average temperature caused by natural climate fluctuations.
                       
            c) The expansion of the ozone layer leading to warmer atmospheric conditions.
                       
            d) The cooling of the planet due to increased volcanic activity.""";
    }
    public static String question2 (){
        return """
                What is the primary cause of the observed increase in global temperatures according to proponents of human-induced climate change?
                                
                a) Natural climate fluctuations
                
                b) Increased solar activity
                
                c) Human activities releasing greenhouse gases
                
                d) Changes in ocean currents""";
    }
    public static String question3 (){
        return"""
                According to skeptics of human-induced global warming, what is the main factor contributing to changes in the Earth's climate?
                                
                a) Deforestation and land-use changes
                
                b) Volcanic activity
                
                c) Variability in solar radiation
                
                d) Industrial emissions of greenhouse gases""";
    }
    public static String question4 (){
        return"""
                How do advocates for addressing climate change suggest reducing greenhouse gas emissions?
                                
                a) Emphasizing technological innovations to capture and store carbon
                
                b) Supporting policies to limit industrial emissions
                
                c) Encouraging the use of renewable energy sources
                
                d) Promoting global afforestation initiatives""";
    }
    public static String question5 (){
        return"""
                Which of the following is a greenhouse gas that is released by human activities and speeds up global warming?
                                
                a) Carbon monoxide
                                
                b) Nitrogen dioxide
                                
                c) Methane
                                
                d) Sulfur dioxide""";
    }
    public int userResponse (){
        int answerCount = 0;
        String answer = JOptionPane.showInputDialog(null,question1());
        if (answer.equalsIgnoreCase("a")) answerCount ++;

        answer = JOptionPane.showInputDialog(null,question2());
        if (answer.equalsIgnoreCase("c")) answerCount ++;

        answer = JOptionPane.showInputDialog(null,question3());
        if (answer.equalsIgnoreCase("d")) answerCount ++;

        answer = JOptionPane.showInputDialog(null,question4());
        if (answer.equalsIgnoreCase("b")) answerCount ++;

        answer = JOptionPane.showInputDialog(null,question5());
        if (answer.equalsIgnoreCase("c")) answerCount ++;

        return answerCount;

    }

}

