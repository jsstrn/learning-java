import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        // We encounter problems with floating points in Java
        double doubleValue = 0.012;
        double doubleSum = doubleValue + doubleValue + doubleValue;
        System.out.println(doubleSum);

        // Use BigDecimal when dealing with precision values
        BigDecimal bigValue = BigDecimal.valueOf(doubleValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum);

        // We can covert it back to double if need be
        double doubleSumConverted = bigSum.doubleValue();
        System.out.println(doubleSumConverted);
    }
}
