//package tdd;
//
//import ConceptPractise.DataExtraction;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DataExtractionTdd {
//    @Test
//    void canExtractData() {
//        DataExtraction dataExtraction = new DataExtraction();
//        int[][] dataset = {
//                {4, 2, 4, 1},
//                {6, 8, 3, 6},
//                {2, 6, 7, 8},
//                {5, 8, 2, 7}
//        };
//        //Given
//        int row = 2;
//        int startPosition = 2;
//        int endPosition = 4;
//        //when
//        int[] result = dataExtraction.extract(dataset, row, startPosition, endPosition);
//        int[] expected = {8, 3, 6};
//
//        //assert
//        assertEquals(8, result[0]);
//        assertEquals(3, result[1]);
//        assertEquals(6, result[2]);
//        assertEquals(3, result.length);
//    }
//}
//    @Test
////    void testThatCanExtractColumn() {
//        DataExtraction dataExtraction = new DataExtraction();
//        int[][] dataset = {
//                {4, 2, 4, 1},
//                {6, 8, 3, 6},
//                {2, 6, 7, 8},
//                {5, 8, 2, 7}
//        };
//        //Given
//        int column = 2;
//        int startPosition = 2;
//        int endPosition = 4;
//        //when
//        int[] result = dataExtraction.extractByColumn(dataset, column, startPosition, endPosition);
//
//        //assert
//        assertEquals(8, result[1]);
//       assertEquals(6, result[1]);
//       assertEquals(8, result[1]);
//        assertEquals(3, result.length);
//   }
//}