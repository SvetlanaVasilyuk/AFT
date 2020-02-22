package Homework_5_1_VendingMachine2;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    private int cash;

    private void printMenu() {
        System.out.println("Добро пожаловать! Ознакомьтесь с меню:");
        for (Drink d : Drink.values()) {
            System.out.println("Номер напитка: " + (d.ordinal() + 1) + "  Название: " + d.getName() + "  Цена: " + d.getPrice());
        }
        System.out.println();
    }

    private void addCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите наличные: ");
        this.cash += scanner.nextInt();
        System.out.println("Всего внесено наличных: " + this.cash);
        System.out.println();
    }

    private void giveDrinkToUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер выбранного напитка:");
        int number = scanner.nextInt();
        System.out.println();
        if (number > Drink.values().length || number < 1) {
            System.out.println("Введен некорректный номер напитка. Пожалуйста, попробуйте снова.");
            giveDrinkToUser();
        } else if (Drink.values()[number - 1].getPrice() > this.cash) {
            System.out.println("Недостаточно средств.");
            addCash();
            giveDrinkToUser();
        } else {
            System.out.print("Пожалуйста, заберите ваш напиток " + Drink.values()[number - 1].getName());
            int change = this.cash - Drink.values()[number - 1].getPrice();
            if (change > 0) {
                System.out.print(" и сдачу в размере " + change);
            }
            System.out.println();
            System.out.println();
        }
        this.cash = 0;
    }

    public void runVendingMachine() {
        printMenu();
        addCash();
        giveDrinkToUser();
    }
}
