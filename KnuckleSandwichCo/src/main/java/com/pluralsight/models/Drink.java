package com.pluralsight.models;

public class Drink extends Product
{
    private String name;
    private String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Drink() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double calculatePrice() {

        switch (size.toLowerCase()){

            case "s":
                price = 2.00;
                return 2.00;
            case "m":
                price = 2.50;
                return 2.50;
            case "l":
                price = 3.00;
                return 3.00;
            default:
                System.out.println("Unable to read selection. ");

        }
        return 0;
    }

    @Override
    public String toString() {
        return "D R I N K ⬇\uFE0F" + "\n" + "Name = " + name + "\n" + "Size = " + size + "\n" + "Price = $ " + price + "\n";
    }
}
