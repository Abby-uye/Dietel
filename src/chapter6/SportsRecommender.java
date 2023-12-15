package chapter6;

public class SportsRecommender {
    public static void sportsRecommender(int celsius){
        if (celsius>= 20 && celsius <= 30 ) System.out.println("It is a lovely weather for sports today");
        else if (celsius >= 10&& celsius <= 40 )  {
            System.out.println("Its a reasonable weather for sports today");
            System.out.println("Please exercise with care today and watch out for weather");
        }
    }

    public static void main(String[] args) {
        sportsRecommender(28);
    }
}
