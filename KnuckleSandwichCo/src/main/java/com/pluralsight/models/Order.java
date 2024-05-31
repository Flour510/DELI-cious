package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // private fields to store a list of components in the order (sandwiches, chips, drinks and
    // total price of the order)
    private List<Sandwich> sandwiches;
    private List<Chips> chips;
    private List<Drink> drinks;
    private double total = 0;

    // private field to store all products in the order
    private List<Product> products;

    public Order() {
        products = new ArrayList<>(); // initialize the products list as an ArrayList
    }

    public void addSandwich(Sandwich sandwich) {
        products.add(sandwich); // adds the sandwich to the products list
    }

    public void addDrink(Drink drink) {
        products.add(drink); // adds the drink to the products list
    }

    public void addChips(Chips chips) {
        products.add(chips); // add the chips to the products list
    }

    public double calculateTotal() {
        for (Product prod : products) // iterates through each product in the order
        {
            total += prod.calculatePrice(); // calculate the price of each product and adds it to the total
        }
        return total;
    }

    // method to display the details of the order
    public List<Product> displayOrderDetails() {
        return products; // return list of products in the order

    }
}
