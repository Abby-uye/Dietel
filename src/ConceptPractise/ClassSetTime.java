package ConceptPractise;

public class ClassSetTime {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour,int minute,int seconds){
        if (hour<0||hour>23||minute<0||minute>59||seconds<0||seconds>59){
            throw new IllegalArgumentException("hour minute and / or seconds was out of range");
        }
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
    }
public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,seconds);
}
public String toString(){
        return String.format("%d:%02d:%02d %s",(( hour == 0|| hour==12)? 12 : hour % 12),minute,seconds,(hour < 12 ? "Am" : "Pm"));
}


}
