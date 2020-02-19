package BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void standartBubbleSort(int array[]) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void modifiedBubbleSort(int array[]) {
        int iter=0;
            for (int j = 0; j < array.length-1; j++) {
                int k=j+1;
                int r= array[j] - array[k];
                for (int m=k; m<array.length; m++){
                    if (array[j] - array[m] > r) {
                        k = m;
                        r = array[j] - array[m];
                    }
                    iter++;
                }
                int tmp = array [j];
                array[j] = array [k];
                array[k] = tmp;
            }
        System.out.println("Количество итераций цикла: " + iter);
    }

    public static int[] fullArray(int N) {
        int[] array = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = fullArray(10000);

        long startTime = System.currentTimeMillis();
        standartBubbleSort(array);
        long spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array));
        System.out.println("Сортировка стандартным методом произвелась за " + spentTime + " миллисекунд");

        int[] array2 = fullArray(10000);

        startTime = System.currentTimeMillis();
        modifiedBubbleSort(array2);
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println(Arrays.toString(array2));
        System.out.println("Сортировка модифицированным методом произвелась за " + spentTime + " миллисекунд");

    }
}
