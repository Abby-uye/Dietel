package chapter3;

public class Clock314 {
    private int seconds;
    private int minutes;
    private int hour;

    public Clock314(int seconds,int minutes, int hour) {
       this.seconds = seconds;
       this.minutes = minutes;
        this.hour = hour;
    }
        public void setSeconds(int seconds ) {
             this.seconds = seconds;
        }

    public void setMinutes(int minutes ) {
        this.minutes = minutes;
    }

    public void setHour(int hour ) {
        this.hour = hour;
    }

    public int getSeconds(){
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }

    public int getHour(){
        return hour;
    }
    public void displayTime(){
        System.out.printf("%d: %d: %d",hour,minutes,seconds);

    }





}

