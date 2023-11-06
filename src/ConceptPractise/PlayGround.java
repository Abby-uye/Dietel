package ConceptPractise;
import javax.swing.JOptionPane;
import java.util.ArrayList;
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

public static int[] ascendingArray(int[] array){
int [] numbers = new int[array.length];
    for (int index  = 0; index  < array.length; index ++) {
        for (int item = index; item < array.length-1 ; item++) {
            int temp =array.length+1;
            if (array[item] <array[item+1]){
                array[index] = temp;
                numbers[index] = array[index];


            }

        }
    }
        return numbers;
    }

    public static void main(String[] args) {
    int [] sort = {5,4,8,2,1,5,};

        System.out.println(Arrays.toString(ascendingArray(sort)));
        //JOptionPane.showMessageDialog(null, "Enter your name", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }



