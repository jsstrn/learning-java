import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double doubleValue = 0.012;
        double doubleSum = doubleValue + doubleValue + doubleValue;

        System.out.println(doubleSum);

        BigDecimal bigValue = BigDecimal.valueOf(doubleValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);

        System.out.println(bigSum);

        double doubleSumConverted = bigSum.doubleValue();

        System.out.println(doubleSumConverted);
    }
}
