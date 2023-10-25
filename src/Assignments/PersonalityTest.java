//package Assignments;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PersonalityTest {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String userName = input.nextLine();
//
//        String[] aQuestions = {"Expend energy, enjoy groups, ",
//                "Interpret, literally ",
//                "logical thinking,questioning ",
//                "Organized, orderly  ",
//                "More outgoing, think out loud  ",
//                "Practical, realistic,experimental ",
//                "candid,straight forward,frank B,",
//                "Plan,schedule ",
//                "Seek many task,public activities,interaction with others",
//                "Standard, usual, conventional",
//                "Firm, tend to criticise,hold the line,",
//                "Regulated, structured,",
//                "External,communicative, express yourself",
//                "Focus on here and now, ",
//                "Tough minded ,just",
//                "Preparation, plan ahead",
//                "Active, initiate",
//                "Facts, things, what is ",
//                "Matter of fact, issue oriented",
//                "Control, govern"
//        };
//
//        String[] bQuestions = {"Conserve energy,enjoy one on one",
//                "Look for meaning and possibilities",
//                "empathetic feeling,accommodating",
//                "flexible,adaptable",
//                "more reserved,think to yourself",
//                "Imaginative,innovative,theoretical",
//                "Tactful,kind,encouraging",
//                "Unplanned spontaneous",
//                "Seek privacy, solitary activities with quiet to concentrate",
//                "Different, novel, unique ",
//                "Gentle tend to appreciate,conciliate",
//                "Easy going, gentle,live and let live",
//                "Internal reticent,keep to yourself",
//                "Look to the future, global perspective,big picture",
//                "Tender hearted, merciful",
//                "Go with the flow,adapt as you go",
//                "Reflective, deliberate",
//                "Ideas, dreams, what could be, philosophical",
//                "Sensitive, people oriented,compassionate",
//                "Latitude, freedom"
//        };
//
//        String[] answers = new String[aQuestions.length];
//        StringBuilder storeValue = new StringBuilder();
//
//        for (int item = 0; item < aQuestions.length; item++) {
//            System.out.println("Enter A or B to to choose answer");
//            System.out.println("A." + aQuestions[item] + "B." + bQuestions[item]);
//            String answerOption = input.nextLine().toUpperCase();
//
//            while (!(answerOption.equals("A") || answerOption.equals("B"))) {
//                System.out.println("Invalid output");
//                 System.out.println("Enter A or B to to choose answer");
//                System.out.println("A.  " + aQuestions[item] + "    B. " + bQuestions[item]);
//                answerOption = input.nextLine().toUpperCase();
//
//            }
//            if (answerOption.equals("A")) {
//               storeValue.append("A  ").append(aQuestions[item]).append("\n");
//            } else if (answerOption.equals("B")) {
//                storeValue.append("B  ").append(bQuestions[item]).append("\n");
//            }
//            answers[item] = answerOption;
//
//        }
//        String[]ab = new String [aQuestions.length];
//        for (int items =0;items <ab.length;items++){
//
//        }
//        System.out.println(storeValue);
//
//        for (int item = 0; item < answers.length; item += 4) {
//            int aCount = 0;
//            int bCount = 0;
//            if (answers[item].equals("A")) {
//                System.out.printf("Hello %s  you selected A. %s", userName, aQuestions[item]);
//                aCount++;
//            } else if (answers[item].equals("B")) {
//                System.out.printf("Hello %s  you selected A. %s", userName, bQuestions[item]);
//                bCount++;
//           }
//            System.out.println("The number of A you selected s"+answers[item].equals("A"));
//            System.out.println("The number of B you selected s"+answers
//
//
//
//
//
