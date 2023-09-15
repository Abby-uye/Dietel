package ConceptPractise;

public class StaticMethods {
    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeek(2));
    }
    public static String getDaysOfTheWeek(int dayNum){
        String dayName  = " ";
        switch (dayNum){
            case 0 -> dayName ="Sunday";
            case 1 -> dayName = "Monday";
            case 2-> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
        }
return dayName;
    }
}

