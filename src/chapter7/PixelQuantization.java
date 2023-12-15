package chapter7;

public class PixelQuantization {

    public int[] quantize(int[] pixels) {
        for (int row = 0; row < pixels.length; row++) {
            if(pixels[row]>=0 && pixels[row] <= 20) pixels[row] = 10;
            else if (pixels[row]>=21 && pixels[row] <= 40) pixels[row] = 30;
            else if (pixels[row]>=41 && pixels[row] <= 60) pixels[row] = 50;
            else if (pixels[row]>=61 && pixels[row] <= 80) pixels[row] = 70;
            else if (pixels[row]>=81 && pixels[row] <= 100) pixels[row] = 90;
            else if (pixels[row]>=101 && pixels[row] <= 120) pixels[row] = 110;
            else if (pixels[row]>=121 && pixels[row] <= 140) pixels[row] = 130;
            else if (pixels[row]>=141 && pixels[row] <= 160) pixels[row] = 150;
            else if (pixels[row]>=161 && pixels[row] <= 180) pixels[row] = 170;
            else if (pixels[row]>=181) pixels[row] = 190;
        }
        return pixels;
    }
}
