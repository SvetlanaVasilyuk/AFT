package Homework_6_2_Basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MyBasket implements Basket {
    HashMap<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        for (String product : basket.keySet()) {
            products.add(product);
        }
        return products;
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}
