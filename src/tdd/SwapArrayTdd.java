package tdd;

import ConceptPractise.SwapArrayElements;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapArrayTdd {
    @Test
    void testThatCanSwapEvenPosition() {
        SwapArrayElements swap = new SwapArrayElements();
        int[] numbers = {42, 18, 41, 22, 11, 12};
        int[] actual = swap.swap(numbers);
        int[] expected = {18, 42, 22, 41, 12, 11};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testThatCanSwapOddPosition() {
        SwapArrayElements swap = new SwapArrayElements();
        int[] numbers = {42, 18, 41, 22, 15};
        int[] actual = swap.swap(numbers);
        int[] expected = {18, 42, 22, 41, 15};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testThatCanSwapIndexPosition() {
        SwapArrayElements swap = new SwapArrayElements();
        int[] numbers = {42, 15, 18, 12, 13, 33};
        int[] actual = swap.swapIndex(numbers);
        int[] expected = {42, 15, 12, 18, 13, 33};
        assertArrayEquals(expected, actual);
    }
    @Test
    void testThatCanSwapOddIndexPosition() {
        SwapArrayElements swap = new SwapArrayElements();
        int[] numbers = {42, 15, 18, 12, 13};
        int[] actual = swap.swapIndex(numbers);
        int[] expected = {42, 15, 12, 18, 13};
        assertArrayEquals(expected, actual);
    }

}
