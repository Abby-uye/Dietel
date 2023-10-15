package ConceptPractise;

import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        String name = "Abigail";
        for (int index = name.length(); index >= 0; index--) {
            String charName = String.valueOf(name.charAt(index));
            System.out.println(charName);
        }
    }
}