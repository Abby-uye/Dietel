package ConceptPractise;

public class ClassSetTimeTest {
    public static void main(String[] args) {
        ClassSetTime time  = new ClassSetTime();
        disPlayMethod("After object is created",time);
        System.out.println();
        time.setTime(13,27,6);
        disPlayMethod("After calling set time ",time);
        System.out.println();
        try {
            time.setTime(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception %s%n%n",e.getMessage());
        }
        disPlayMethod("After calling setTime with invalid values",time);

    }
public static void disPlayMethod(String header,ClassSetTime time){
    System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",header,time.toUniversalString(),time.toString());
}
}
