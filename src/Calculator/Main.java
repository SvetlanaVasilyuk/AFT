package Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Демонстрация работы калькулятор для примитивов
        int n1=123;
        int n2=5;
        double d1=11.999;
        double d2=4.001;

        System.out.println(n1 + " + " + n2 + " = " + CalculatorForPrimitives.addition(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + CalculatorForPrimitives.substraction(n1, n2));
        System.out.println(n1 + " * " + n2 + " = " + CalculatorForPrimitives.multiplication(n1, n2));
        System.out.println(n1 + " / " + n2 + " = " + CalculatorForPrimitives.division(n1, n2));
        System.out.println(n1 + " % " + n2 + " = " + CalculatorForPrimitives.remainderOfDivision(n1, n2));

        System.out.println(d1 + " + " + d2 + " = " + CalculatorForPrimitives.addition(d1, d2));
        System.out.println(d1 + " - " + d2 + " = " + CalculatorForPrimitives.substraction(d1, d2));
        System.out.println(d1 + " * " + d2 + " = " + CalculatorForPrimitives.multiplication(d1, d2));
        System.out.println(d1 + " / " + d2 + " = " + CalculatorForPrimitives.division(d1, d2));
        System.out.println(d1 + " % " + d2 + " = " + CalculatorForPrimitives.remainderOfDivision(d1, d2));


        //Демонстрация работы калькулятора для больших чисел
        BigInteger bigInt1 = BigInteger.valueOf(2147483647);
        BigInteger bigInt2 = BigInteger.valueOf(15);
        BigDecimal bigDec1 = BigDecimal.valueOf(2147483646.9999);
        BigDecimal bigDec2 = BigDecimal.valueOf(15.0001);

        System.out.println(bigInt1 + " + " + bigInt2 + " = " + CalculatorForBigNumbers.addition(bigInt1, bigInt2));
        System.out.println(bigInt1 + " - " + bigInt2 + " = " + CalculatorForBigNumbers.subtraction(bigInt1, bigInt2));
        System.out.println(bigInt1 + " * " + bigInt2 + " = " + CalculatorForBigNumbers.multiplication(bigInt1, bigInt2));

        //Ниже от деления остается только целая часть - так реализовано в BigInteger. Не стала менять реализацию,
        // поскольку единственный вариант изменения, который я вижу - укладывать BigInteger в int, его в double, double в BigDecimal - но тогда все равно можем потерять часть числа при преобразовании в int.
        System.out.println(bigInt1 + " / " + bigInt2 + " = " + CalculatorForBigNumbers.division(bigInt1, bigInt2));
        System.out.println(bigInt1 + " % " + bigInt2 + " = " + CalculatorForBigNumbers.remainderOfDivision(bigInt1, bigInt2));

        System.out.println(bigDec1 + " + " + bigDec2 + " = " + CalculatorForBigNumbers.addition(bigDec1, bigDec2));
        System.out.println(bigDec1 + " - " + bigDec2 + " = " + CalculatorForBigNumbers.subtraction(bigDec1, bigDec2));
        System.out.println(bigDec1 + " * " + bigDec2 + " = " + CalculatorForBigNumbers.multiplication(bigDec1, bigDec2));
        System.out.println(bigDec1 + " / " + bigDec2 + " = " + CalculatorForBigNumbers.division(bigDec1, bigDec2));
        System.out.println(bigDec1 + " % " + bigDec2 + " = " + CalculatorForBigNumbers.remainderOfDivision(bigDec1, bigDec2));
    }
}
