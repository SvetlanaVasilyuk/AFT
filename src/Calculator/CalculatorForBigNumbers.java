package Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculatorForBigNumbers {

    public static BigInteger addition (BigInteger n1, BigInteger n2){
        return n1.add(n2);
    }

    public static BigDecimal addition (BigDecimal n1, BigDecimal n2){
        return n1.add(n2);
    }

    public static BigInteger subtraction (BigInteger n1, BigInteger n2){
        return n1.subtract(n2);
    }

    public static BigDecimal subtraction (BigDecimal n1, BigDecimal n2){
        return n1.subtract(n2);
    }

    public static BigInteger multiplication (BigInteger n1, BigInteger n2){
        return n1.multiply(n2);
    }

    public static BigDecimal multiplication (BigDecimal n1, BigDecimal n2){
        return n1.multiply(n2);
    }

    public static BigInteger division (BigInteger n1, BigInteger n2){
            return n1.divide(n2);
    }

    public static BigDecimal division (BigDecimal n1, BigDecimal n2){
        return n1.divide(n2, 3);
    }

    public static BigInteger remainderOfDivision (BigInteger n1, BigInteger n2){
        return n1.remainder(n2);
    }

    public static BigDecimal remainderOfDivision (BigDecimal n1, BigDecimal n2){
        return n1.remainder(n2);
    }

}
