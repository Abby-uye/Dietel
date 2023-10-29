package Assignments;

import java.sql.SQLOutput;
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
        String personalityType = "";
        String [] personalityTypeA = {"E", "S",  "T",  "J"};
        String [] personalityTypeB = {"I", "N", "F", "P"};
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
                System.out.println("Key ISTJ Characteristics");
                System.out.println("""
                        Calm
                        Concerned with rules
                        Decisive
                        Honest
                        Independent
                        Insensitive
                        Level-headed
                        Stubborn
                        Straight-forward
                        Reserved
                        Responsible""");
                System.out.println("ISTJ Strengths and Weaknesses");
                System.out.println("Strentghs");

                System.out.println("""
                        ISTJs are planners: They like to carefully plan things out well in advance. 
                        They enjoy an orderly life. They like things to be well-organized and pay great attention to detail.
                        When things are in disarray, people with this personality type may find themselves unable to rest until they have set everything straight and the work has been completed.
                        
                        ISTJs are both responsible and realistic:
                        They take a logical approach to achieving their goals and completing projects and can work steadily toward accomplishing these tasks. 
                        They can ignore distractions to focus on the task at hand and are often described as dependable and trustworthy.
                        
                        ISTJs also place a great deal of emphasis on traditions and laws: 
                        They prefer to follow rules and procedures that have previously been established. 
                        In some cases, ISTJs can seem rigid and unyielding in their desire to maintain structure.""");

                System.out.println("Weaknesses");

                System.out.println("""
                        ISTJs can be stubborn: Their love of order and rules means they can sometimes be stubborn and stuck in their ways. 
                        It also means that they resist trying new things or looking for alternative solutions to problems.
                        
                        ISTJs can seem insensitive: While ISTJs are loyal and protective, their tendency to be direct and honest sometimes leads to hurt feelings. 
                        Others may feel that they are insensitive or even cold.
                        
                        ISTJ tend to blame themselves: Because they are responsible and hardworking, they also tend to take on unwarranted self-blame when things go wrong""");

                System.out.println("Personal Relationships");
                System.out.println("""
                        STJs prefer spending time alone or with small groups of close friends. 
                        People with this personality type are usually very loyal and devoted to family and friends 
                        but may struggle to understand their own emotions and the feelings of others. 
                        They can be quite reserved and sometimes fail to pick up on the emotional signals given by other people. 
                        However, once they are close to a person and develop an understanding of that person's feelings and needs, 
                        they will expend a great deal of effort toward supporting those needs.""");

                System.out.println("Career Paths");
                System.out.println("""
                        Because of this need for order, they tend to do better in learning and work environments that have clearly defined schedules, 
                        clear-cut assignments, and a strong focus on the task at hand. When learning new things, 
                        ISTJs do best when the material is something they view as useful with real-world applications. 
                        Concrete, factual information appeals to ISTJs, while theoretical and abstract information has little value unless they can see some type of practical use for it.
                        While they may exert tremendous energy into projects they see as valuable, they will avoid wasting time and energy on things that they view as useless or unpractical.
                                               
                        ISTJs tend to do well in careers that require order, structure, and perseverance.
                         Jobs that involve dealing with concrete facts and figures (accounting, library science, computer programming, etc.) are all good options. 
                         Jobs that require accuracy, respect for rules and stability often appeal to those with an ISTJ """);


                System.out.println("Tips for Interacting With ISTJs");
                System.out.println("Friendships");
                System.out.println("""
                       ISTJs tend to get along best with friends who are similar to themselves.
                       While they tend to be a bit serious and by the book, they do like to have fun. 
                       They might not be willing to jump into new things, but you can be a great friend by helping them pursue hobbies and activities that they enjoy. """);

                System.out.println("Parenting");
                System.out.println("""
                        ISTJ parents tend to be quite focused on tradition and are good at providing security and stability to their children. 
                        Children of ISTJ parents often find that their parents will treat them with care and respect and that they also expect the same treatment in return.
                                                
                        Parents of ISTJ children will find that providing consistency can help their children feel more secure. 
                        Sticking to routines, introducing change slowly, and giving them time to adjust to new situations are all ways to help an ISTJ chil""");

                System.out.println("Relationship");
                System.out.println("""
                        While people of any personality type can be compatible, ISTJ tends to be most compatible with people who share their interests and characteristics.
                        Some other types that may be most compatible include other ISTJs and ISTPs, ISFJs, or ESTJs.
                                               
                        While ISTJs may experience deep feelings, they often struggle to show that side of themselves in romantic relationships.
                        You can be an understanding partner by not expecting them to bare their soul to you right off the bat. 
                        Sometimes it may seem that your partner is not considering your feelings, 
                        but you can help them see your side by rationally presenting facts and logical explanations for your side of the argument. """);
            }
                case "ISTP" ->{
                    System.out.println("ISTP: The Crafter (Introverted, Sensing, Thinking, Perceiving");

                    System.out.println("Key Characteristics");

                    System.out.println("""
                            Goal-directed: People with an ISTP personality are results-oriented. When there is a problem,
                            they want to quickly understand the underlying cause and implement some type of solution.
                            Open to new experiences: ISTPs enjoy new experiences and may often engage in thrill-seeking or risk-taking behaviors.
                            They often engage in risky or fast-paced hobbies such as motorcycling, hang gliding, bungee jumping, surfing, or ice hockey. In some cases,                          
                            they may seek out adventure by choosing careers in areas such as racing, flying, or firefighting.
                            
                            Objective: They prefer to make judgments based on objective criteria rather than personal beliefs or values.
                            Reserved but even-tempered: ISTPs are often described as quiet but with an easygoing attitude towards others.
                            They can be talkative at work or in settings where they have a great deal in common with others.
                            
                            Emotionally detached: ISTPs are not well attuned to the emotional states of others, and they can sometimes be seen as cold, unfeeling, or insensitive.
                            They also distance themselves from their own emotions, ignoring their feelings until they become overwhelming.
                           
                            Level-headed: One common misconception about ISTPs is that they are the stoic, silent type.
                            While they tend to be reserved, this does not mean they do not experience strong emotions.
                            Instead, they are good at keeping a cool head, maintaining objectivity, and coping with crises.""");


                    System.out.println("Career Paths for an ISTP");

                    System.out.println("""
                         ISTPs tend to be curious and even adventurous, but they also have a strong need to be alone at times.
                         You can be a great friend by asking them to get out and pursue new things, but be ready to respect their need for peace and quiet when they are not feeling up to going out.
                         Because ISTPs are introverted, they often do well in jobs that require working alone.
                         ISTPs tend to dislike too much structure and do well in careers where they have a lot of freedom and autonomy.
                         Because they are very logical, they often enjoy work that involves reasoning and hands-on experience.
                         In particular, ISTPs like doing things that have practical, real-world applications.""");

                    System.out.println("Strengths");

                    System.out.println("""
                            Logical
                                                        
                            Learns by experience
                                                        
                            Action-oriented
                                                        
                            Realistic and practical
                                                        
                            Enjoys new things
                                                        
                            Self-confident and easygoing""");

                    System.out.println("Weaknesses");

                    System.out.println("""
                            Difficult to get to know
                                                        
                            Insensitive
                                                        
                            Grows bored easily
                                                        
                            Risk-taker
                                                        
                            Does not like commitment""");

                    System.out.println("Tips for Interacting With ISTPs");
                    System.out.println("Friendships");
                    System.out.println("""
                            ISTPs tend to be curious and even adventurous, but they also have a strong need to be alone at times.
                            You can be a great friend by asking them to get out and pursue new things, 
                            but be ready to respect their need for peace and quiet when they are not feeling up to going out.""");

                    System.out.println("Parenting");
                    System.out.println("""
                                      If you are a parent to an ISTP child, you are probably well aware of their independent, adventurous nature.
                                      You can encourage their confidence by providing safe and healthy opportunities for them to explore things on their own.
                                      Provide rules and guidance, but be careful not to hover. Give your child plenty of hands-on learning, outdoor adventures,
                                       
                                       and opportunities to experiment with how things work.""");

                    System.out.println("Relationship");
                    System.out.println("""
                            Because ISTPs live so strongly in the present moment, long-term commitments can be a real challenge.
                             You can strengthen your relationship with your ISTP partner by being willing to take things day to day and by respecting their fierce need for independence.""");
            }
                    case "ISFJ"->{
                        System.out.println("ISFJ: Introverted, Sensing, Feeling, Judging");

                        System.out.println("Key ISFJ Characteristics");

                        System.out.println("""
                                Caring
                                Compassionate
                                Dependable
                                Industrious
                                Kind-hearted
                                Loyal
                                Organized
                                Practical
                                Protective
                                Sensitive
                                Warm""");

                        System.out.println("""
                                They Tend to Repress Their Emotions
                                
                                One challenge that ISFJs have to grapple with is their tendency to repress or ignore emotions. 
                                Those with this personality type are particularly well-tuned into the emotions and feelings of others.
                                                                
                                While ISFJs are good at understanding their own emotions, they often struggle to express them. Rather than share their feelings, 
                                they may bottle them up, sometimes to the point that negative feelings toward other people can result.
                                                                
                                When dealing with life struggles, such as illness or the death of a loved one, 
                                they may keep quiet about what they are experiencing to avoid burdening others with their troubles.
                                                                
                                They Are Practical
                                
                                An ISFJ practicality can be another key strength, but it can also be a weakness when it limits their ability to consider new ideas.
                                People with this personality prefer concrete facts over abstract theories. As a result, they tend to learn best by doing.
                                                                
                                This also means that they usually value learning for its practical applications.
                                They also tend to become more interested in new things when they can see and appreciate how they might solve a real-world problem.
                                                                
                                They Are Creatures of Habit
                                
                                ISFJs enjoy structure and strive to maintain this order in all areas of their lives.
                                They thrive in highly structured and consistent environments where they are given step-by-step instructions and clear expectations.
                                                                
                                Their preference to keep things the way they are rather than change. But this does not mean ISFJs aren't adaptable.
                                 They simply prefer to have time to think about and prepare for big changes.""");

                        System.out.println("Strengths");
                        System.out.println("""
                                Reliable
                                                               
                                Practical
                                                               
                                Sensitive
                                                               
                                Eye for detail""");
                        System.out.println("Weaknesses");

                        System.out.println("""
                                Dislikes abstract concepts
                                                                
                                Avoids confrontation
                                                                
                                Dislikes change
                                                                
                                Neglects own needs""");

                        System.out.println("ISFJ Personal Relationships");

                        System.out.println("""
                                Because they are quiet, people sometimes misinterpret this as standoffish behavior. 
                                However, ISFJs are compassionate and caring toward others,
                                often working to secure the safety and well-being of other people without asking for thanks or anything in return.
                                                                
                                ISFJs are often described as kind, reliable, and trustworthy.
                                                                
                                Because they are hard-working, dependable, and rarely seek accolades for their own accomplishments,
                                 ISFJs are sometimes taken for granted by those around them. In some cases, people might even try to take advantage of this reliability.
                                                                                                                                
                                ISFJs tend to have a small group of very close friends.
                                While they may be quiet and reserved around people they don’t know well,
                                they are more likely to "let loose" when they are around these close confidants.
                                They place a high value on these close friendships and are always willing to support and care for the people to whom they are close.""");

                        System.out.println("Career Paths for ISFJs");

                        System.out.println("""
                                ISFJs have many characteristics that make them well-suited to particular careers.
                                Because they are so attuned to the feelings of others, jobs in mental health or the healthcare industry are a good fit.
                                                                
                                They are also meticulous and orderly, making them suited to jobs that involve planning, structure, or attention to detail.
                                 Their commitment to their work, reliability, and ability to work independently make them attractive to a wide variety of employers.
                                                                
                                Because of their solid people skills and desire to create order, they often do well in management or administrative roles.
                                 They excel at coming up with plans and helping other people work together to achieve a common goal.""");

                        System.out.println("Tips for Interacting With ISFJs");

                        System.out.println("Friendships");

                        System.out.println("""
                                If you are friends with an ISFJ, you are probably already aware that they tend to be warm and selfless.
                                Even though they are quite social for introverts, they are not always good at sharing their own feelings.
                                Asking them how they are doing and being willing to talk can help them to open up.
                                                                
                                You can help be a good friend by paying attention to their needs.
                                Take the time to see what they might need you to do for them.""");

                        System.out.println("Parenting");

                        System.out.println("""
                                ISFJs are natural caregivers and are very nurturing toward their children.
                                They are good at giving their kids structure and order, but sometimes have a difficult time enforcing discipline.
                                                                
                                If you are the parent of an ISFJ child, be aware of your child's need to have time alone.
                                Also, be aware that your child may be willing to give up things that are important to them to make other people happy.
                                Encourage them to pursue their interests and goals and remind them that meeting their own needs is important as well.""");

                        System.out.println("Relationships");

                        System.out.println("""
                                ISFJs are very faithful to their partners and approach relationships with an intensity of emotion and great devotion.
                                While they have strong feelings, they are not always good at expressing them.
                                Who should ISFJs marry or date? In terms of compatibility,
                                ISFJs often get along with with other types that share the sensing function, including ISTJs, ISFPs, and ESFPs.
                                                                
                                Your ISFJ partner may often be focused on taking care of your needs, but you should take care to reciprocate these actions.
                                Showing your partner that you appreciate them can help them to feel more satisfied.""");






            }




        }
    }


//                if (userInputStorage[index][item].equalsIgnoreCase("A")) {
//                    aCount
//                    ++;
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
    }
}
//}