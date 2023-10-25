package ConceptPractise;

import java.util.ArrayList;

public class StringBuildersPractice {
    public static void main(String[] args) {


        ArrayList<ArrayList<StringBuilder>> twoDStringBuilderList = new ArrayList<>();

        int numRows = 3;
        int numCols = 3;

        for (int i = 0; i < numRows; i++) {
            ArrayList<StringBuilder> rowList = new ArrayList<>();
            for (int j = 0; j < numCols; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append("Row ").append(i).append(", Column ").append(j);
                rowList.add(sb);
            }
            twoDStringBuilderList.add(rowList);
        }

        System.out.println(twoDStringBuilderList.get(1).get(2).toString());
    }
}