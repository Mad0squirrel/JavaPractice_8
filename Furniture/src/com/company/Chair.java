package com.company;

public class Chair extends Furniture {

    protected boolean isCircle;

    public Chair(String model, String material, String color, double price, boolean isCircle) {
        super(model, material, color, price);
        this.isCircle = isCircle;
    }

    public boolean isCircle() {
        return isCircle;
    }

    public void setCircle(boolean isCircle) {
        this.isCircle = isCircle;
    }

    public String toString() {
        return super.toString() +
                ", is circle = " + isCircle +
                "}";
    }

}
