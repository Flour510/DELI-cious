package com.pluralsight.models;

// product class serves as a template for various types of products, therefore it has to
// be marked as abstract to prevent it from being instantiated directly. Instead, it
// defines a common structure and behavior that subclasses can inherit from.

public abstract class Product
{
    public double price;

    public abstract double calculatePrice();
}
