package org.example;

public class Main {
    public static void main(String[] args) {
        String[] products = new String[]{
                "Кофе:2", "Соль:13", "Сахар:3"
        };
        Shop lentaShop = new Shop("Lenta", products);


        int[] arrPrice = getArrPrice(lentaShop);
        String[] arrProductsName = getProductsName(lentaShop);

        for (int i = 0; i < products.length; i++) {
            System.out.println("Наименование продукта: " + arrProductsName[i]);
            System.out.println("Цена продукта: " + arrPrice[i]);
        }

        /*
        Наименование продукта: Кофе
        Цена продукта: 2
        Наименование продукта: Соль
        Цена продукта: 13
        Наименование продукта: Сахар
        Цена продукта: 3
         */
    }

    public static int[] getArrPrice(Shop shop) {


        return null;
    }

    public static String[] getProductsName(Shop shop) {
        return null;
    }
}