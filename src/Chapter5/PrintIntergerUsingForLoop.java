package Chapter5;

public class PrintIntergerUsingForLoop {
    public static void main(String[] args) {
      int  index = 0;
      for (index =1;index<=20;index++){
          System.out.print(index);
          if (index % 5 == 0){
              System.out.println();
          }else System.out.printf("\t");

      }
    }
}
