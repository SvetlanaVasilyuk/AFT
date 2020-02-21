package BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static int iterQuickSort = 0; // не придумала, как положить этот счетчик внутрь метода быстрой сортировки из-за рекурсии, поэтому вынесла за рамки метода

    // Метод для перемены местами элементов массива
    public static void swap(int array[], int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }


    //Обычная сортировка пузырьком без модификаций
    public static void standartBubbleSort(int array[]) {
        int iter = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
                iter++;
            }
        }
        System.out.println("Количество итераций цикла в сортировке standartBubbleSort: " + iter);
    }

    // Мой модифицированный метод сортировки пузырьком №1. Не дает выигрыша по итерациям, зато дает выигрыш по времени
    public static void modifiedBubbleSort1(int array[]) {
        int iter = 0;
        for (int j = 0; j < array.length - 1; j++) {
            int k = j + 1;
            int r = array[j] - array[k];
            for (int m = k; m < array.length; m++) {
                if (array[j] - array[m] > r) {
                    k = m;
                    r = array[j] - array[m];
                }
                iter++;
            }
            if (array[j] > array[k]) {
                swap(array, j, k);
            }
        }
        System.out.println("Количество итераций цикла в сортировке modifiedBubbleSort1: " + iter);
    }

    // Мой модифицированный метод сортировки пузырьком №2. Дает выигрыш и по итерациям, и по времени. Хотя от сортировки пузырьком тут особенно ничего и не осталось.
    public static void modifiedBubbleSort2(int array[]) {
        //System.out.println(Arrays.toString(array));
        int iter = 0;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] > array[array.length - i - 1]) {
                swap(array, i, array.length - i - 1);
            }

            int min = i;
            int max = array.length - i - 1;
            for (int j = i; j < array.length - i - 1 && i != array.length / 2; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
                if (array[j] < array[min]) {
                    min = j;
                }
                iter++;
            }
            swap(array, i, min);
            swap(array, array.length - i - 1, max);
            //System.out.println(Arrays.toString(array));

        }
        System.out.println("Количество итераций цикла в сортировке modifiedBubbleSort2: " + iter);
    }

    // Это просто быстрая сортировка. Сама не придумала, взяла из интернета и подкорректировала.
    public static void quickSort(int array[], int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int med = array[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (array[leftMarker] < med) {
                leftMarker++;
                iterQuickSort++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (array[rightMarker] > med) {
                rightMarker--;
                iterQuickSort++;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    swap(array, leftMarker, rightMarker);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
            iterQuickSort++;
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
    }

    // Метод для заполнения массива рандомными числами
    public static int[] fullArray(int N) {
        int[] array = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public static void main(String[] args) {

        int N = 1000;

        int[] array = fullArray(N);

        long startTime = System.currentTimeMillis();
        standartBubbleSort(array);
        long spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array));
        System.out.println("Сортировка стандартным методом произвелась за " + spentTime + " миллисекунд");
        System.out.println();

        int[] array2 = fullArray(N);

        startTime = System.currentTimeMillis();
        modifiedBubbleSort1(array2);
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array2));
        System.out.println("Сортировка модифицированным методом 1 произвелась за " + spentTime + " миллисекунд");
        System.out.println();

        int[] array3 = fullArray(N);

        startTime = System.currentTimeMillis();
        modifiedBubbleSort2(array3);
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array3));
        System.out.println("Сортировка модифицированным методом 2 произвелась за " + spentTime + " миллисекунд");
        System.out.println();

        int[] array4 = fullArray(N);

        startTime = System.currentTimeMillis();
        quickSort(array4, 0, array4.length - 1);
        System.out.println("Количество итераций цикла в сортировке quickSort: " + iterQuickSort);
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array4));
        System.out.println("Быстрая сортировка произвелась за " + spentTime + " миллисекунд");

    }
}
