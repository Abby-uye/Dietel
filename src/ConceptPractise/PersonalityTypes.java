package ConceptPractise;

import java.util.Scanner;

public class PersonalityTypes {
    public static String[] aAndBQuestions() {
        Scanner input = new Scanner(System.in);
        String[] aQuestions = {"Expend energy, enjoy groups, ",
                "Interpret, literally ",
                "logical thinking,questioning ",
                "Organized, orderly  ",
                "More outgoing, think out loud  ",
                "Practical, realistic,experimental ",
                "candid,straight forward,frank B,",
                "Plan,schedule ",
                "Seek many task,public activities,interaction with others",
                "Standard, usual, conventional",
                "Firm, tend to criticise,hold the line,",
                "Regulated, structured,",
                "External,communicative, express yourself",
                "Focus on here and now, ",
                "Tough minded ,just",
                "Preparation, plan ahead",
                "Active, initiate",
                "Facts, things, what is ",
                "Matter of fact, issue oriented",
                "Control, govern"
        };

        String[] bQuestions = {"Conserve energy,enjoy one on one",
                "Look for meaning and possibilities",
                "empathetic feeling,accommodating",
                "flexible,adaptable",
                "more reserved,think to yourself",
                "Imaginative,innovative,theoretical",
                "Tactful,kind,encouraging",
                "Unplanned spontaneous",
                "Seek privacy, solitary activities with quiet to concentrate",
                "Different, novel, unique ",
                "Gentle tend to appreciate,conciliate",
                "Easy going, gentle,live and let live",
                "Internal reticent,keep to yourself",
                "Look to the future, global perspective,big picture",
                "Tender hearted, merciful",
                "Go with the flow,adapt as you go",
                "Reflective, deliberate",
                "Ideas, dreams, what could be, philosophical",
                "Sensitive, people oriented,compassionate",
                "Latitude, freedom"
        };
        String[] typeInput = new String[aQuestions.length];
        String userTypeInput = "";
        String sentinela = "a";
        String sentinelb = "b";

        for (int item = 0; item < typeInput.length; item++) {
            userTypeInput = input.next();

            while (!(userTypeInput.equalsIgnoreCase(sentinela) || userTypeInput.equalsIgnoreCase(sentinelb))) {
                userTypeInput = input.next();

            }
            typeInput[item] = userTypeInput;

        }
        return typeInput;

    }

    public static String checkType() {

        int aCount = 0;
        int bCount = 0;
        String typechecker = "";
        String[] userInputStorage = new String[aAndBQuestions().length / 4];
        for (int item = 0; item < aAndBQuestions().length; item += 4) {
            userInputStorage[item] = aAndBQuestions()[item];
            if (userInputStorage[item].equals("A")) {
                aCount++;
            } else if (userInputStorage[item].equals("B")) {
                bCount++;
            }
        }
        if (aCount > bCount) {
            typechecker = "Extroverted";
        } else if (bCount > aCount) {
            typechecker = "introverted";

        }
        return typechecker;
    }

    public static void main(String[] args) {
        checkType();
    }
}
