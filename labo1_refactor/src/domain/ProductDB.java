package domain;

import java.util.ArrayList;

public class ProductDB {
    private ArrayList<String> productTitles;
    private ArrayList<String> productTypes;
    private ArrayList<String> productIds;
    ArrayList<Product> producten;

    public void addProduct(Product product) {
        producten.add(product);
        productTitles.add(product.getTitel());
        productTypes.add(product.getType());
        productIds.add(product.getId());
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }
}
