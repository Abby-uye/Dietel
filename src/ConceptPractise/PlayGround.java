package ConceptPractise;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class PlayGround {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        String [] name = {"uye","Abby","queen"} ;
////        for (int item = 0;item < name.length;item++){
//            System.out.println("Enter a list of six friends name"+ (item +1,+":");
//            String userInput = input.nextLine();
//            name[item] = userInput;
//        }for(int item = 0;item <name.lenght;item++){
//        System.out.println("name at index"+(item+1),+"has the value of :" ,+ name[item]);

//    for (String index : name){
//        System.out.println("Enter a list of six friends name");
//           String userInput = input.nextLine();
//           name[Integer.parseInt(index)] = userInput;
//
//    } System.out.println(Arrays.toString(name));

//        for (String index : name) {
//            System.out.println(index);

//        }

//
//    }
//
//public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your card number");
//         int[] cardNumbers  = new int[]{input.nextInt()};
//            int[] doubledCardNumbers = new int[cardNumbers.length / 2];
//            int count = cardNumbers[0];
//                int result = 0;
//            for (int index = 0; index < cardNumbers.length; index += 2) {
//                result = count * 2;
//                if (result >= 10 || result <= 99) {
//                    result = result % 10;
//                    result += result;
//                    System.out.println(result);
//                }
//            }
//        System.out.println(Arrays.toString(doubledCardNumbers));
//        }
//    }
//public static int[] extractedData(int[][]dataset,int column,int start,int stop){
//
//    int[] output = new int[(stop - start)];
//    int count = 0;
//    for (int item = start;item< stop;item++){
//
//        output[count] = dataset[item][column]-1;
//        System.out.println(Arrays.toString(dataset[item]));
//        count++;
//
//    }
//    return output;
//}
//
//    public static void main(String[] args) {
//        int [][] numbers = {{11,2,3},
//                            {13,5,7},
//                            {9,7,10}};
//        System.out.println(Arrays.toString(extractedData(numbers, 2, 1, 3)));
//
//    }

//    public static void main(String[] args) {
//        String name = "Abigail";
//        for (int index = name.length(); index >= 0; index--) {
//            String charName = String.valueOf(name.charAt(index));
//            System.out.println(charName);
//        }
//    }
//}

//    public static int[] removeDuplicate(int[] numbers) {
//        int count = 0;
//        ArrayList<Integer> duplicatedList = new ArrayList<>();
//        for (int index = 0; index <= numbers.length - 1; index++) {
//            count = numbers[index];
//            for (int item = index + 1; item <= index; item++) {
//                if (count == numbers[item]) {
//                    duplicatedList.add(numbers[item]);
//                }
//            }
//
//        }
//        return convertListToArray(duplicatedList);
//    }
//
//    public static int[] convertListToArray(ArrayList<Integer> numbers) {
//        int[] convertedList = new int[numbers.size()];
//        for (int i = 0; i < numbers.size(); i++) {
//            convertedList[i] = numbers.get(i);
//        }
//        return convertedList;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(removeDuplicate(new int[]{2, 3, 4, 5, 6, 7, 8, 2, 4, 5})));
//    }
//}
//

//public static int[] ascendingArray(int[] array){
//    for (int index  = 0; index  < array.length; index ++) {
//        for (int item = index; item < array.length ; item++) {
//            if (array[item] < array[index]){
//                int temp =array[index];
//                array[index] = array[item];
//                array[item] = temp;
//            }
//        }
//    }
//        return array;
//    }

        public static void getHighestScore(int[][] array) {
            int numberOfStudent =4;
            int numberOfSubject =3;
            for (int index = 0; index < numberOfSubject;index++ ) {
                System.out.println("Subject "+(index+1));
                int highestScore = MIN_VALUE;
                int lowestScore = MAX_VALUE;
                int total = 0;
                double average = 0;
                int passCounter =0;
                int failCounter =0;
                int highestScoringStudent=0;
                int lowestScoringStudent =0;
                for (int item = 0; item < numberOfStudent; item++) {
                    if (array[item][index] > highestScore){
                        highestScore = array[item][index];
                        highestScoringStudent=item;
                    } else if (array[item][index]<lowestScore) {
                        lowestScore = array[item][index];
                        lowestScoringStudent =item;
                    }if(array[item][index] >= 60) {
                        passCounter++;

                    } else if (array[item][index]<=60) {
                        failCounter++;

                    }
                    total+=array[item][index];
                    average = (double) total /numberOfStudent;

                }

                System.out.println("The highest scoring student  for subject "+ (index+1)+" is: student "+(highestScoringStudent+1)+" scoring "+highestScore);
                System.out.println("The lowest scoring student  for subject "+(index+1)+" is: student "+(lowestScoringStudent+1)+" scoring "+lowestScore);
                System.out.println("Total score is: " +total);
                System.out.println("Average score is: "+average);
                System.out.println("Number of passes: "+passCounter);
                System.out.println("Number of fails: "+failCounter);
                System.out.println();
            }
}

    public static void classSummary(int[][]array) {
        int[] failCount = new int[3];
        int[] passCount = new int[3];
        int numberOfStudent = 4;
        int numberOfSubject = 3;
        int theHighestScore =0;
        int theLowestScore =MAX_VALUE;
        int theHighestScorer = 0;
        int theLowestScorer =0;
        int inHighestSubject =0;
        int inLowestSubject=0;
        int [] graduatingStudentScore = new int[numberOfStudent];
        int classTotal =0;
        double classAverage = 0;

        for (int index = 0; index < numberOfSubject; index++) {
            int highestScore = MIN_VALUE;
            int lowestScore = MAX_VALUE;
            for (int item = 0; item < numberOfStudent; item++) {
                if (array[item][index] > highestScore) {
                    highestScore = array[item][index];
                    theHighestScorer = item;
                } else if (array[item][index] < lowestScore) {
                    lowestScore = array[item][index];
                }
                if (array[item][index] >= 60) {
                    passCount[index]++;
                } else if (array[item][index] <= 60) {
                    failCount[index]++;
                }if (array[item][index] > theHighestScore){
                    theHighestScore =array[item][index];
                    theHighestScorer = item;
                    inHighestSubject = index;
                }if (array[item][index]< theLowestScore){
                    theLowestScore = array[item][index];
                    theLowestScorer =item;
                    inLowestSubject = index;
                }
                graduatingStudentScore[item] += array[item][index];
                classTotal+=array[item][index];
            }
        }classAverage = (double) classTotal / numberOfStudent;
            int hardestSubject = 0;
            int cheapestSubject = 0;
            int count = 0;
            int counter = 0;
            for (int index = 0; index < numberOfSubject; index++) {
                if (failCount[index] > count) {
                    count = failCount[index];
                    hardestSubject = index;
                }
                if (passCount[index] > counter) {
                    counter = passCount[index];
                    cheapestSubject = index;
                }
            }int bestGraduatingScore =0;
            int worstGraduatingScore =MAX_VALUE;
            int worstGraduatingStudent =0;
            int bestGraduatingStudent =0;

        for (int index = 0; index < numberOfStudent; index++) {
            if (graduatingStudentScore[index] > bestGraduatingScore){
                bestGraduatingScore = graduatingStudentScore[index];
                bestGraduatingStudent = index;
            }if (graduatingStudentScore[index] < worstGraduatingScore){
                worstGraduatingScore = graduatingStudentScore[index];
                worstGraduatingStudent = index;
            }

        }
        String design = "=";
        String failDesign = "!";
            String summary = "CLASS SUMMARY";
            System.out.println("The hardest subject is subject " + (hardestSubject + 1) + " with " + count + " number of failures");
            System.out.println("The easiest subject is subject " + (cheapestSubject + 1) + " with  " + counter + " number of passes");
            System.out.println("The overall highest score is scored by student "+ (theHighestScorer+1)+" in subject "+(inHighestSubject+1)+" scoring "+theHighestScore);
            System.out.println("The overall lowest score is scored by student "+(theLowestScorer+1)+ " in subject "+(inLowestSubject+1)+" scoring "+theLowestScore);
            System.out.printf("%s%n%n",design.repeat(80));
            System.out.printf("%50s%n",summary);
            System.out.println(design.repeat(80));
            System.out.println("The best graduating student is student "+(bestGraduatingStudent+1)+" scoring "+bestGraduatingScore);
            System.out.printf("%s%n%n",design.repeat(80));
            System.out.println(failDesign.repeat(80));
            System.out.println("The worst graduating student is student "+(worstGraduatingStudent+1)+" scoring "+worstGraduatingScore);
            System.out.printf("%s%n%n",failDesign.repeat(80));
            System.out.println(design.repeat(80));
            System.out.println("The class to total is: "+classTotal);
            System.out.println("The class average is: "+classAverage);
            System.out.println(design.repeat(80));



    }
  public static void main(String[] args) {
        int [][] array = {{70,69,9},{8,50,6},{6,60,2},{4,70,8}};
        classSummary(array);

    }
        }



