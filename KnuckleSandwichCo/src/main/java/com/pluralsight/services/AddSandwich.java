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
        System.out.println("Meat Topping Options (Steak, Ham, Salami, Roast Beef, Chicken, Bacon)");
        System.out.println("Select your Meats: ");
        String meatType = userInput.nextLine(); // prompt the user for meat type
        System.out.println("_".repeat(70));

        System.out.println("Cheese Topping Options (American, Provolone, Cheddar, Swiss)");
        System.out.println("Select your Cheese's: ");
        String cheeseType = userInput.nextLine(); // prompt the user for cheese type
        System.out.println("_".repeat(70));

        System.out.println("Regular Topping Options (Lettuce, Peppers, Onions, Tomatoes, Jalapenos,\nCucumbers, Pickles, Guacamole, Mushrooms)");
        System.out.println("Select your Toppings: ");
        String toppingsType = userInput.nextLine(); // prompt the user for toppings type
        System.out.println("_".repeat(70));

        System.out.println("Sauce Topping Options (Mayo, Mustard, Ketchup, Ranch, Thousand Island,\nVinaigrette)");
        System.out.println("Select your Sauces: ");
        String sauceType = userInput.nextLine(); // prompt the user for sauce type
        System.out.println("_".repeat(70));

        System.out.println("Sides Topping Options (Au Jus, Sauce)");
        System.out.println("Select your Sides: ");
        String sideType = userInput.nextLine(); // prompt the user for side type
        System.out.println("_".repeat(70));
    }

    private void selectToasted() {
        System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
        String toastedOption = userInput.nextLine(); // prompt the user for toasted option
        System.out.println("_".repeat(70));
    }


}
