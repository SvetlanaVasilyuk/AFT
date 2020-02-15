package LeapYear;

import java.util.Scanner;

public class Main {

    public static void defineLeapYearV1(int year){
        if (year%400==0 || year%4==0 && year%100!=0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineLeapYearV2(int year){
        if (year%4==0 || year%150==0) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        year=scanner.nextInt();
        // Ниже способ определения реального високосного года
        System.out.print("На самом деле, ");
        defineLeapYearV1(year);

        //Ниже способ определения "фиктивного" високосного года, согласно условию задачи из домашнего задания
        System.out.print("При этом по условию задачи из ДЗ, ");
        defineLeapYearV2(year);
    }
}
