package chapter7Tdd;

import chapter7.PixelQuantization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PixelQuantizationUnitTest {
    @Test
    void testThatCanQuantizePixel(){
        PixelQuantization pixelQuantization = new PixelQuantization();
        int [] pixels = {20,78,45,35,98,59,1};
        int [] newPixels = {10,70,50,30,90,50,10};
        assertArrayEquals(newPixels, pixelQuantization.quantize(pixels));
    }
}
