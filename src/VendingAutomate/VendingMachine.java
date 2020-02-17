package VendingAutomate;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    private ArrayList <Drink> menu = new ArrayList<>();
    private int cash;

    private void setCash(int cash) {
        this.cash = cash;
    }

    public void addDrinkToMenu (String name, int price){
        this.menu.add(new Drink(price, name));
    }

    private void printMenu(){
        System.out.println("Добро пожаловать! Ознакомьтесь с меню:");
        for (int i=0; i<menu.size(); i++){
            System.out.println("Номер напитка: " + (i+1) + "  Название: " + this.menu.get(i).getName() + "  Цена: " + this.menu.get(i).getPrice());
        }
        System.out.println();
    }

    private void addCash(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите наличные: ");
        this.cash+=scanner.nextInt();
        System.out.println("Всего внесено наличных: " + this.cash);
        System.out.println();
    }

    private void giveDrinkToUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер выбранного напитка:");
        int number = scanner.nextInt();
        System.out.println();
        if (number>menu.size() || number<1){
            System.out.println("Введен некорректный номер напитка. Пожалуйста, попробуйте снова.");
            giveDrinkToUser();
        }
        else if (this.menu.get(number-1).getPrice()>this.cash){
            System.out.println("Недостаточно средств.");
            addCash();
            giveDrinkToUser();
        }
        else{
            System.out.print("Пожалуйста, заберите ваш напиток " + this.menu.get(number-1).getName());
            int change = this.cash - this.menu.get(number-1).getPrice();
            if (change > 0){
                System.out.print(" и сдачу в размере " + change);
            }
            System.out.println();
            System.out.println();
        }
        this.cash=0;
    }

    public void runVendingMachine(){
        printMenu();
        addCash();
        giveDrinkToUser();
    }
}
