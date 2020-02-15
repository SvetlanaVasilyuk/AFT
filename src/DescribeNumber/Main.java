package DescribeNumber;

import java.util.Scanner;

public class Main {

    public static void describeNumber(int a){
        System.out.print("Число " + a + " является ");
        if (a>0) {
            System.out.print("положительным и ");
        }
        else if (a<0) {
            System.out.print("отрицательным и ");
        }
        else {
            System.out.print("нулевым и ");
        }

        if (a%2==0) {
            System.out.println("четным");
        }
        else {
            System.out.println("нечетным");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        describeNumber(a);
    }
}
