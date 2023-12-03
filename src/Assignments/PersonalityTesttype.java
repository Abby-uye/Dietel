package Assignments;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class PersonalityTesttype {
    private static final String[] [] answers = new String[4][5];
     public  static String userName  = "";

    public static String[] [] aAndbQuestions() {

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
        String personalityType = "";
        String [] personalityTypeA = {"E", "S",  "T",  "J"};
        String [] personalityTypeB = {"I", "N", "F", "P"};
        System.out.println("Hello "+ userName + " You Selected");
        System.out.println();
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
            if (aCount > bCount) personalityType += personalityTypeA[index];
            else personalityType += personalityTypeB[index];
            System.out.println("number of A selected " + aCount);
            System.out.println("Number of B selected " + bCount);
            System.out.println();
            }
        System.out.println(personalityType);
        displayPersonalityResult(personalityType);
    }

    private static void displayPersonalityResult(String personalType) {
        switch (personalType){
            case "ISTJ" -> {
                System.out.println("ISTJ - The Duty Fulfiller");
                System.out.println("""
                        Serious and quiet, interested in security and peaceful living. Extremely thorough, responsible, and dependable.
                        Well-developed powers of concentration. Usually interested in supporting and promoting traditions and establishments.
                        Well-organized and hard working, they work steadily towards identified goals.
                        They can usually accomplish any task once they have set their mind to it.""");
            }
            case "ISTP"->{
                System.out.println("ISTP - The Mechanic");
                System.out.println("""
                        Quiet and reserved, interested in how and why things work.
                        Excellent skills with mechanical things. Risk-takers who live in the current moment.
                        Usually interested in and talented at extreme sports. Uncomplicated in their desires.
                        Loyal to their peers and to their internal value systems, but not overly concerned with respecting laws and rules if they get in the way of getting something done.
                        Detached and analytical, they excel at finding solutions to practical problems.""");
            }
            case "ISFJ"->{
                System.out.println("ISFJ - The Nurturer");

                System.out.println("""
                        Quiet, kind, and conscientious. Can be depended on to follow through.
                        Usually puts the needs of others above their own needs. Stable and practical,
                        they value security and traditions. Well-developed sense of space and function.
                        Rich inner world of observations about people. Extremely perceptive of other's feelings.
                        Interested in serving others.""");
            }

        case "ISFP"->{
            System.out.println("ISFP - The Artist");
            System.out.println("""
                    Quiet, serious, sensitive and kind. Do not like conflict, and not likely to do things to generate conflict.
                    Loyal and faithful. Extremely well-developed senses, and aesthetic appreciation for beauty.
                    Not interested in leading or controlling others. Flexible and open-minded. Likely to be original and creative. Enjoy the present moment.""");

        }
        case "INFJ"->{
            System.out.println("INFJ - The Protector");
            System.out.println("""
                    Quietly forceful, original, and sensitive. Tend to stick to things until they are done. Extremely intuitive about people, and concerned for their feelings.
                    Well-developed value systems which they strictly adhere to. Well-respected for their perserverence in doing the right thing.
                    Likely to be individualistic, rather than leading or following.""");
        }
       case "INFP"->{
           System.out.println("INFP - The Idealist");
           System.out.println("""
                   Quiet, reflective, and idealistic. Interested in serving humanity. Well-developed value system, which they strive to live in accordance with. Extremely loyal.
                   Adaptable and laid-back unless a strongly-held value is threatened. Usually talented writers. Mentally quick, and able to see possibilities.
                   Interested in understanding and helping people.""");
       }
       case "INTJ"->{
           System.out.println("INTJ - The Scientist");
           System.out.println("""
                   Independent, original, analytical, and determined. Have an exceptional ability to turn theories into solid plans of action.
                   Highly value knowledge, competence, and structure. Driven to derive meaning from their visions.
                   Long-range thinkers. Have very high standards for their performance, and the performance of others.
                   Natural leaders, but will follow if they trust existing leaders.""");
       }
        case "INTP"->{
            System.out.println("INTP - The Thinker");
            System.out.println("""
                    Logical, original, creative thinkers. Can become very excited about theories and ideas.
                    Exceptionally capable and driven to turn theories into clear understandings.
                    Highly value knowledge, competence and logic. Quiet and reserved, hard to get to know well.
                    Individualistic, having no interest in leading or following others.""");
        }
        case "ESTP"->{
            System.out.println("ESTP - The Doer");
            System.out.println("""
                    Friendly, adaptable, action-oriented. "Doers" who are focused on immediate results.
                    Living in the here-and-now, they're risk-takers who live fast-paced lifestyles. Impatient with long explanations.
                    Extremely loyal to their peers, but not usually respectful of laws and rules if they get in the way of getting things done. Great people skills.""");
        }
        case "ESTJ"->{
            System.out.println("ESTJ - The Guardian");
            System.out.println("""
                    Practical, traditional, and organized. Likely to be athletic.
                    Not interested in theory or abstraction unless they see the practical application.
                    Have clear visions of the way things should be.
                    Loyal and hard-working. Like to be in charge.
                    Exceptionally capable in organizing and running activities. "Good citizens" who value security and peaceful living.""");
            }
            case "ESFP"->{
                System.out.println("ESFP - The Performer");
                System.out.println("""
                        People-oriented and fun-loving, they make things more fun for others by their enjoyment. Living for the moment, they love new experiences.
                        They dislike theory and impersonal analysis. Interested in serving others. Likely to be the center of attention in social situations.
                        Well-developed common sense and practical ability.""");
            }
        case "ESFJ"->{
            System.out.println("ESFJ - The Caregiver");
            System.out.println("""
                    Warm-hearted, popular, and conscientious. Tend to put the needs of others over their own needs.
                    Feel strong sense of responsibility and duty. Value traditions and security.
                    Interested in serving others. Need positive reinforcement to feel good about themselves.
                    Well-developed sense of space and function.""");
        }
        case "ENFP"->{
            System.out.println("ENFP - The Inspirer");
            System.out.println("""
                    Enthusiastic, idealistic, and creative. Able to do almost anything that interests them. Great people skills.
                    Need to live life in accordance with their inner values.
                    Excited by new ideas, but bored with details. Open-minded and flexible, with a broad range of interests and abilities.""");
        }
        case "ENFJ"->{
            System.out.println("ENFJ - The Giver");
            System.out.println("""
                    Popular and sensitive, with outstanding people skills.
                    Externally focused, with real concern for how others think and feel. Usually dislike being alone.
                    They see everything from the human angle, and dislike impersonal analysis. Very effective at managing people issues, and leading group discussions.
                    Interested in serving others, and probably place the needs of others over their own needs.""");
        }
        case "ENTP"->{
            System.out.println("ENTP - The Visionary");
            System.out.println("""
                    Creative, resourceful, and intellectually quick. Good at a broad range of things. Enjoy debating issues, and may be into "one-up-manship".
                     They get very excited about new ideas and projects, but may neglect the more routine aspects of life.
                    Generally outspoken and assertive. They enjoy people and are stimulating company. Excellent ability to understand concepts and apply logic to find solutions.""");
        }
        case "ENTJ"->{
            System.out.println("ENTJ - The Executive");
            System.out.println("""
                    Assertive and outspoken - they are driven to lead.
                    Excellent ability to understand difficult organizational problems and create solid solutions.
                    Intelligent and well-informed, they usually excel at public speaking.
                    They value knowledge and competence, and usually have little patience with inefficiency or disorganization.""");
        }
        }
    }

    public static void main(String[] args) {
        print_selected_questions();
    }
}
