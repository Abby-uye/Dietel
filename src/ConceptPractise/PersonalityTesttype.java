package ConceptPractise;

import java.util.Arrays;
import java.util.Scanner;
public class PersonalityTesttype {
    private static final String[] [] answers = new String[4][5];
     public  static String userName  = "";

    public static String[] [] aAndbQuestions() {
        //package Assignments;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        userName = input.nextLine();

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

        int counter = 0;

        for (int index = 0; index < answers.length; index++) {
            int count =0;


        for (int item = counter; item < aQuestions.length; item+=4) {
            System.out.println("Enter A or B to to choose answer");
            System.out.println("A." + aQuestions[item] + "B." + bQuestions[item]);
            String answerOption = input.nextLine().toUpperCase();

            while (!(answerOption.equals("A") || answerOption.equals("B"))) {
                System.out.println("Invalid output");
                System.out.println("Enter A or B to to choose answer");
                System.out.println("A.  " + aQuestions[item] + "    B. " + bQuestions[item]);
                answerOption = input.nextLine().toUpperCase();

            }
            if (answerOption.equals("A")) {
                answers[index][count] =  answerOption + "." + aQuestions[item] ;
            } else if (answerOption.equals("B")) {
                answers[index][count] = answerOption +"."+ bQuestions[item] ;
            }
        count++;
        }

            System.out.println();
        counter++;
        }
        return answers;
    }

    public static void print_selected_questions() {
        String [] [] replies = aAndbQuestions();
        System.out.println("Hello "+ userName + " You Selected");
        for (int index = 0; index < 4; index++) {
            int bCount = 0;
            int aCount = 0;
            for(int indices = 0; indices < replies[index].length;indices++){
                System.out.println(replies[index][indices]);
                if (replies[index][indices].startsWith("A")) {
                    aCount++;
                } else if (replies[index][indices].startsWith("B")) {
                    bCount++;
                }
            }
            System.out.println("number of A selected " + aCount);
            System.out.println("Number of B selected " + bCount);
                System.out.println();
            }

    }







//                if (userInputStorage[index][item].equalsIgnoreCase("A")) {
//                    aCount++;
//                } else if (userInputStorage[index][item].equalsIgnoreCase("B")) {
//                    bCount++;
//                }
//                if (Objects.equals(answers[item], "A")) {
//                    aCount++;
//                } else {
//                    bCount++;
//                }
//            }
//        }
//        if (aCount > bCount) {
//            typeChecker = "Extroverted";
//        } else if (bCount > aCount) {
//            typeChecker = "introverted";
//
//        }
//        System.out.println(Arrays.toString(answers));
//
//        return typeChecker;



    public static void main(String[] args) {

        print_selected_questions();
//        aAndbQuestions();q

    }
}
//}