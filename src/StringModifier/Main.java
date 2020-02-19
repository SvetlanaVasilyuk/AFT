package StringModifier;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        //Чтобы не вводить с консоли, можно раскомментировать строку ниже
        //string="Слово бяка не должно появляться в культурной речи, поскольку бяка означает что-то очень нехорошее. Давайте откажемся от слова бяка!";

        String substring1 = "бяка";
        String substring2 = "вырезано цензурой";
        System.out.println(string.replaceAll(substring1, substring2));

    }
}