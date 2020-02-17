package VendingAutomate;

public class Drink {
    private final int price;
    private String name;

    public Drink(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
