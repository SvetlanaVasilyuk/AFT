package Homework_5_1_VendingMachine2;

public enum Drink {
    COCACOLA("Кока-Кола 0.33л", 60),
    AQUAMINERALE("Аква Минерале 0.33л", 55),
    DOBRYJUICE("Сок Добрый 0.25л", 40);

    private String name;
    private int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
