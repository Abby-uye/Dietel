package ConceptPractise;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.5);
        System.out.printf("%s%20s%n","year","Amount on deposit");

        for (int index = 1; index <= 10; index++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(index));
            System.out.printf("%4d%20s%n", index, NumberFormat.getCurrencyInstance().format(amount));

        }

    }
}
