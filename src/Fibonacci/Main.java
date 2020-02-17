package Fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger findFibonacci(int N) {
        if (N == 0) {
            return BigInteger.valueOf(0);
        } else if (N == 1 || N == 2) {
            return BigInteger.valueOf(1);
        } else return findFibonacci(N - 1).add(findFibonacci(N - 2));
    }

    public static BigInteger[] fullFibonacchi(int N) {
        BigInteger[] f = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            f[i] = findFibonacci(i);
        }
        return f;
    }

    public static void printArray(BigInteger[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности:");
        int N = scanner.nextInt();
        printArray(fullFibonacchi(N));
    }
}
