package domain;

import java.util.ArrayList;

public class Shop {
    ProductDB producten;
    public Shop() {

    }
    public ArrayList<Product> getProductenArray() {
        return producten.getProducten();
    }
    public void addProduct(Product product) {
        producten.addProduct(product);
    }

    public void showPrice(Product product, int nbOfDays) {
        return product.getCalculator().calculatePrice();
    }

    public void showProduct(Product product) {

    }
}
