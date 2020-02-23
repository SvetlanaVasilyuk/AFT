package Homework_6_2_Basket;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyBasket myBasket = new MyBasket();
        myBasket.addProduct("Шампунь", 2);
        myBasket.addProduct("Гель для душа", 4);
        myBasket.addProduct("Дезодорант", 1);
        System.out.println("Перечень товаров в корзине: " + myBasket.getProducts().toString());
        System.out.println("Количество товара Гель для душа в корзине: " + myBasket.getProductQuantity("Гель для душа"));
        myBasket.removeProduct("Гель для душа");
        myBasket.addProduct("Мыло", 5);
        myBasket.updateProductQuantity("Дезодорант", 3);

        System.out.println("В корзине находятся:");
        for (String p : myBasket.getProducts()) {
            System.out.println("Товар: " + p + " Количество: " + myBasket.getProductQuantity(p));
        }

        myBasket.clear();
        System.out.println("Перечень товаров в корзине: " + myBasket.getProducts().toString());
    }
}
