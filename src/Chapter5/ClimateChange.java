package Chapter5;

import java.util.Locale;
import java.util.Scanner;

public class ClimateChange {
public static void question1() {
    Scanner userAnswer = new Scanner(System.in);
    int answerCount = 0;
    System.out.println("What is climate change? ");
    System.out.println("""
            A -> Climate change refers to significant changes in global temperature, 
            precipitation, 
            wind patterns and other measures of climate that occur over several decades or longer.
                            
            B -> definition of climate change says it is “a broad range of global phenomena created predominantly by burning fossil fuels, 
            which add heat-trapping gases to Earth’s atmosphere.
            These phenomena include the increased temperature trends described by global warming, but also encompass changes such as sea-level rise; ice mass loss in Greenland,
            Antarctica, the Arctic and mountain glaciers worldwide; shifts in flower/plant blooming; and extreme weather events.
                            
            C -> Climate change refers to long-term shifts in temperatures and weather patterns.
            Such shifts can be natural, due to changes in the sun’s activity or large volcanic eruptions”
                            
            D -> Climate change is a long-term shift in global or regional climate patterns.
            Often climate change refers specifically to the rise in global temperatures from the mid-20th century to present.
                            
            E -> None of the above""");

    String answer1 = userAnswer.nextLine();
    switch (answer1.toUpperCase()) {
        case "A", "B", "C", "D" -> {
            System.out.println("correct! ");
            answerCount++;
        }
        case "E" -> {
            System.out.println("Wrong answer, read more on climate change");
            answerCount++;
        }
        default -> System.out.println("Wrong answer, read more on climate change");
    }

    if (answerCount >=1) {
        System.out.println("ok");
    }


}

    public static void main(String[] args) {

question1();

    }
}
