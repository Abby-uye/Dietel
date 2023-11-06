package Assignments;

public class SavingDisplay {
    public static void displaySaving() {
        String symbol = ">>>>>>>>>>>";

            for (int index = 0; index < symbol.length(); index++) {
                System.out.print("Saving");
                for (int i = 0; i < 10; i++) {
                    System.out.print(">");
                }
                System.out.print("\r");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println();
        System.out.println("Saved successfully");
    }
public static String displayDesign(){
        String design = "-";
        return design.repeat(50);
}

}

