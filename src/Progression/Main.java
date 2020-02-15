package Progression;

import java.util.Scanner;

public class Main {

    public static void printAriphmeticProgression(double a, double b, int N){
        System.out.println("Ваша арифметическая прогрессия: ");
        for (int i=0; i<N; i++){
                System.out.printf("%.2f",a + (b *  i));
                if (i!=N-1){
                    System.out.print(", ");
                }
        }
        System.out.println();
    }

    public static void printGeometricProgression(double a, double b, int N){
        System.out.println("Ваша геометрическая прогрессия: ");
        for (int i=0; i<N; i++){
            System.out.printf("%.2f",a * Math.pow(b, i));
            if (i!=N-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Выберите прогрессию:");
        System.out.println("(1 - арифметическая, 2 - геометрическая)");
        int p = scanner.nextInt();
        System.out.println("Введите первый член прогрессии:");
        double a = scanner.nextDouble();
        System.out.println("Введите шаг прогрессии:");
        double b = scanner.nextDouble();
        System.out.println("Введите количество чисел в прогрессии:");
        int N = scanner.nextInt();

        switch (p) {
            case 1:
                printAriphmeticProgression(a, b, N);
                break;

            case 2:
                printGeometricProgression(a, b, N);
                break;
        }
    }
}
