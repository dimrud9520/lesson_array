package org.example;

public class Shop {
    private String shopName;

    private String[] products;

    public Shop(String shopName, String[] products) {
        this.shopName = shopName;
        this.products = products;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
}
