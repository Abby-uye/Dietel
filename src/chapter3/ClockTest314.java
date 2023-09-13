package chapter3;

public class ClockTest314 {
    public static void main(String[] args) {

        Clock314 flamingo = new Clock314(60, 60, 24);
        int hour = flamingo.getHour();
        hour = 24;
        int minute = flamingo.getMinutes();
        minute = 60;
        int seconds = flamingo.getSeconds();
        minute = 60;

        if ((hour < 23) && (minute < 59) && (seconds < 59)) {
            flamingo.displayTime();

        }
        else
            System.out.print("00: 00: 00:");

    }
}
