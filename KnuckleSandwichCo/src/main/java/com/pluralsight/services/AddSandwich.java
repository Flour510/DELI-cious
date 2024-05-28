package com.pluralsight.services;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddSandwich extends OrderScreen
{
        static Scanner userInput = new Scanner(System.in);

        public void display ()
        {
            try
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

            } catch (Exception ex) {
                System.out.println();
                System.out.println("Invalid Input. ");
            }

        }

        private void selectBread ()
        {
            System.out.println("Bread Options (White, Wheat, Rye, Wrap) ");
            System.out.println("Select your Bread Type: ");
            String breadType = userInput.nextLine(); // prompt the user for bread type
            System.out.println("_".repeat(70));
        }

        private void selectSize ()
        {
            System.out.println("Sandwich Size Options in Inches (4, 8, 12) ");
            System.out.println("Select your Sandwich Size: ");
            int sandwichSize = Integer.parseInt(userInput.nextLine()); // prompt the user for sandwich size
            System.out.println("_".repeat(70));
        }

        private void selectToppings () {
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

        private void selectToasted () {
            System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
            String toastedOption = userInput.nextLine(); // prompt the user for toasted option
            System.out.println("_".repeat(70));

            // prompt the user to make their next move
            // provides user with an option to start another sandwich order or to exit the application
            System.out.println();
            System.out.println("What do you want to do next? ");
            System.out.println();
            System.out.println("A - Start a New Sandwich Order ");
            System.out.println("B - Return to Place New Order Menu");
            System.out.println("C - Exit the App ");
            System.out.println();
            System.out.println("Enter your choice below: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            // process the users choice
            switch (choice.toUpperCase()) {
                case "A":
                    display();
                    break;
                case "B":
                    new OrderScreen();
                    break;
                case "C":
                    System.out.println();
                    System.out.println("Goodbye for now!");
                    System.out.println("👋");
                    System.exit(1); // can recycle this for all exits
                default:
                    System.out.println();
                    System.out.println("Invalid Selection. ");
                    break;
            }
        }
}
