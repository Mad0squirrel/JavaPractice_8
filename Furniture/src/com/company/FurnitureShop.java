package com.company;

public class FurnitureShop {

    protected Furniture[] goods;

    public FurnitureShop(int count) {
        goods = new Furniture[count];
        for (int i = 0; i < count; ) {
            goods[i++] = new Chair("Стул", "металл", "белый", 4200, false);
            if (i >= count) break;
            goods[i++] = new Bed("Кровать", "древесина: дуб", "тёмно-коричневый", 19780, 2);
        }
    }

    public Furniture[] getGoods() {
        return goods;
    }

    public void add(Furniture f) {
        Furniture[] tmp = new Furniture[goods.length + 1];
        System.arraycopy(goods, 0, tmp, 0, goods.length);
        tmp[goods.length] = f;
        goods = tmp;
    }

    public Furniture buy(int number) {
        Furniture f = goods[number];
        Furniture[] tmp = new Furniture[goods.length - 1];
        for (int i = 0; i < goods.length; i++) {
            if (i < number) tmp[i] = goods[i];
            if (i > number) tmp[i - 1] = goods[i];
        }
        goods = tmp;
        return f;
    }

    public String getPrices() {
        String res = "Магазин продаёт следующие товары:\n\n";
        for (Furniture f : goods) {
            res += f.toString() + "\n";
        }
        return res;
    }

}
