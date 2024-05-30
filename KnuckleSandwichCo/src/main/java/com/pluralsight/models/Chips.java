package com.pluralsight.models;

public class Chips extends Product
{
    private String type;

    public Chips(String type) {
        this.type = type;
        price = 1.50;
    }

    public Chips() {
        price = 1.50;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String toString() {
        return "C H I P S ⬇\uFE0F" + "\n" + "Type = " + type + "\n" + "Price = $ " + price + "\n";
    }
}
