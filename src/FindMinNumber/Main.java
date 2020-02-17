package FindMinNumber;

import java.util.Scanner;

public class Main {

    public static double findMin(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        b = scanner.nextDouble();
        System.out.println("Минимальным из чисел является число " + findMin(a, b));
    }
}
