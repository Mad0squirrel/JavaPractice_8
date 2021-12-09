package com.company;

public class Bed extends Furniture {

    protected int personCount;

    public Bed(String model, String material, String color, double price, int personCount) {
        super(model, material, color, price);
        this.personCount = personCount;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public String toString() {
        return super.toString() +
                " person count = " + personCount +
                "}";
    }

}
