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

    public Order() {
//        this.sandwiches = new ArrayList<>();
//        this.chips = new ArrayList<>();
//        this.drinks = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich)
    {
        products.add(sandwich);
    }


    // addChips
    public void addDrink(Drink drink)
    {
        products.add(drink);
    }

    // addDrink
    public void addChips(Chips chips)
    {
        products.add(chips);
    }

    public double calculateTotal() {

//        for (Sandwich sandwich : sandwiches) {
//            total += sandwich.getPrice();
//        }
//        for (Chips chip : chips) {
//            total += chip.getPrice();
//        }
//        for (Drink drink : drinks) {
//            total += drink.getPrice();
//        }

        for(Product prod: products){
            total += prod.calculatePrice();
            System.out.println(prod);
        }

        return total;
    }

    public List<Product> displayOrderDetails() {
//        for (Sandwich sandwich : sandwiches) {
//            System.out.println("Sandwich: " + sandwich.getBreadType() + " - $" + sandwich.calculatePrice());
//        }
//        for (Chips chip : chips) {
//            System.out.println("Chips: " + chip.getType() + " - $" + chip.calculatePrice());
//        }
//        for (Drink drink : drinks) {
//            System.out.println("Drink: " + drink.getName() + " - $" + drink.calculatePrice());
//        }
//        System.out.println("Total: $" + calculateTotal());

//        for(Product prod: products){
//            System.out.println(prod.toString() + "\n");
//        }

        return  products;
    }


  // original code, keep or throw?
  // private Sandwich sandwich;
  // private Chips chips;
  // private Drink drink;
  //
  // // constructor
  // public Order(Sandwich sandwich, Chips chips, Drink drink) {
  //     this.sandwich = sandwich;
  //     this.chips = chips;
  //     this.drink = drink;
  // }
  //
  // // methods
  // public double calculateTotal() {
  //     return sandwich.getPrice() + chips.getPrice() + drink.getPrice();
  // }
  //
  // public void displayOrderDetails() {
  //     System.out.println("Sandwich: " + sandwich.getBreadType() + " - $" + sandwich.getPrice());
  //     System.out.println("Chips: " + chips.getType() + " - $" + chips.getPrice());
  //     System.out.println("Drink: " + drink.getName() + " - $" + drink.getPrice());
  //     System.out.println("Total: $" + calculateTotal());
  // }


}
