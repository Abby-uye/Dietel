package ConceptPractise;

public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(12,45,40);
        System.out.println(time.buildstring());
    }
}
class SimpleTime{
    private  int hour;
    private int minute;
    private int seconds;
    public SimpleTime(int hour,int minute,int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
public String buildstring(){
        return String.format("%24s: %s%n%24s: %s","this.toUniversalString()",this.toUniversalString(),"toUniversalString",toUniversalString());
}
public String toUniversalString(){
        return String.format("%02d:%02d:%02d",this.hour,this.minute,this.seconds);

}
}