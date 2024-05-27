package com.pluralsight.services;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddSandwich extends OrderScreen
{
    static Scanner userInput = new Scanner(System.in);

    public void display()
    {
        // display the add sandwich screen
        System.out.println();
        System.out.println("*".repeat(70));
        System.out.println();
        System.out.println("                        Create your Sandwich ");
        System.out.println();
        System.out.println("*".repeat(70));

        selectBread();
        selectSize();
        selectToppings();
        selectToasted();
    }

    private void selectBread() {
        System.out.println("Bread Options (White, Wheat, Rye, Wrap) ");
        System.out.println("Select your Bread Type: ");
        String breadType = userInput.nextLine(); // prompt the user for bread type
        System.out.println("_".repeat(70));
    }

    private void selectSize() {
        System.out.println("Sandwich Size Options in Inches (4, 8, 12) ");
        System.out.println("Select your Sandwich Size: ");
        int sandwichSize = Integer.parseInt(userInput.nextLine()); // prompt the user for sandwich size
        System.out.println("_".repeat(70));
    }

    private void selectToppings() {
        System.out.println("Topping Options: ");
        System.out.println("Meats - ");
        System.out.println("(Steak, Ham, Salami, Roast Beef, Chicken, Bacon)");
        System.out.println("Select your Meats: ");

        System.out.println("Cheese's - ");
        System.out.println("(American, Provolone, Cheddar, Swiss)");
        System.out.println("Select your Cheese's: ");

        System.out.println("Regular Toppings - ");
        System.out.println("(Lettuce, Peppers, Onions, Tomatoes, Jalapenos, \n Cucumbers, Pickles, Guacamole, Mushrooms)");
        System.out.println("Select your Toppings: ");

        System.out.println("Sauces - ");
        System.out.println("(Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette)");
        System.out.println("Select your Sauces: ");

        System.out.println("Sides - ");
        System.out.println("(Au Jus, Sauce)");
        System.out.println("Select your Sides: ");

        System.out.println();
    }

    private void selectToasted() {
        System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
    }


}
