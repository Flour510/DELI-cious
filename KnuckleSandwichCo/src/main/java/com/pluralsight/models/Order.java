package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private List<Sandwich> sandwiches;
    private List<Chips> chips;
    private List<Drink> drinks;
    private double total = 0;

    private List<Product> products;

    public Order()
    {
        products = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich)
    {
        products.add(sandwich);
    }

    public void addDrink(Drink drink)
    {
        products.add(drink);
    }

    public void addChips(Chips chips)
    {
        products.add(chips);
    }

    public double calculateTotal()
    {
        for(Product prod: products)
        {
            total += prod.calculatePrice();
        }
        return total;
    }

    public List<Product> displayOrderDetails()
    {
        return products;
    }
}
