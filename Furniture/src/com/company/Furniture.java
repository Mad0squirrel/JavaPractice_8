package com.company;

public abstract class Furniture {

    protected String model;
    protected String material;
    protected String color;
    protected double price;

    public Furniture(String model, String material, String color, double price) {
        this.model = model;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "model = " + model +
                ", material = " + material +
                ", color = " + color +
                ", price = " + price;
    }


}
