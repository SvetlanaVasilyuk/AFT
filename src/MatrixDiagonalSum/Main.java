package MatrixDiagonalSum;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] createRandomMatrix(int N) {
        int[][] matrix = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int findMatrixDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i] + matrix[i][matrix.length - i - 1];
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int N = scanner.nextInt();
        int[][] matrix = createRandomMatrix(N);
        printMatrix(matrix);
        System.out.println("Сумма элементов диагонали данной матрицы равна " + findMatrixDiagonalSum(matrix));
    }
}