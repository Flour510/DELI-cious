package com.pluralsight.models;

public class Chips extends Product
{
    private String type;

    // constructor with a parameter for type
    public Chips(String type) {
        this.type = type; // set the type of chips
        price = 1.50; // set the price of chips
    }

    public Chips() {
        price = 1.50; // default price of chips
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

    // override method to convert chips object to string
    @Override
    public String toString() {
        // returns a string representation of chips object including type and price
        return "C H I P S ⬇\uFE0F" + "\n" + "Type = " + type + "\n" + "Price = $ " + price + "\n";
    }
}
