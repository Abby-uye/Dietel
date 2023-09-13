package ConceptPractise;

import java.util.Scanner;

public class ProgramingLanguages {
    public static void main(String[] args) {
        Scanner language = new Scanner(System.in);
        System.out.println("Enter a number between 1 and ten to see what programming language to learn first");
        int flip = language.nextInt();
        switch (flip){
            case 1-> System.out.println("Python");
            case 2-> System.out.println("java");
            case 3-> System.out.println("Kotlin");
            case 4-> System.out.println("Go");
            case 5-> System.out.println("Ada");
            case 6-> System.out.println("C++");
            case 7-> System.out.println("C");
            case 8-> System.out.println("C#");
            case 9-> System.out.println("Css");
            case 10-> System.out.println("Html");
            default -> System.out.println("Enter a number between 1 and 10");
        }


    }
}
