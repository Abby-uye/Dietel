package ConceptPractise;

public class DataExtraction {

    public int[] extract(int[][] dataset, int row, int startPosition, int endPosition) {
        int[] rowData = dataset[row - 1];
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;

        for (int index = startPosition - 1; index < endPosition; index++) {
            extractedData[count] = rowData[index];
            count++;
        }
        return extractedData;
    }
}
//    public int[] extractByColumn(int[][] dataset, int column, int startPosition, int endPosition) {
//        int [] columnData = new int[]
//    }
//
//}
//
