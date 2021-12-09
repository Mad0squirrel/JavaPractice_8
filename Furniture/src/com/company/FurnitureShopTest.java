package com.company;

public class FurnitureShopTest {

    public static void main(String[] args) {

        FurnitureShop shop = new FurnitureShop(5);
        shop.add(new Chair("Стул", "пластмасса", "белый", 3600, false));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}
