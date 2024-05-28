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
                System.out.println("*".repeat(85));
                System.out.println();
                System.out.println("                                 Build Your Sandwich ");
                System.out.println();
                System.out.println("*".repeat(85));

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
            System.out.println("_".repeat(85));
        }

        private void selectSize ()
        {
            System.out.println("Sandwich Size Options in Inches (4' $5.50 | 8' $7.00 | 12' $8.50) ");
            System.out.println("Select your Sandwich Size: ");
            int sandwichSize = Integer.parseInt(userInput.nextLine()); // prompt the user for sandwich size
            System.out.println("_".repeat(85));
        }

        private void selectToppings () {
            // meat options
            System.out.println("Meat Topping Options (Steak, Ham, Salami, Roast Beef, Chicken, Bacon) ");
            System.out.println("Price of Meat Based on Sandwich Size in Inches (4' $1.00 | 8' $2.00 | 12' $3.00) ");
            System.out.println("Select your Meat's below: \uD83D\uDC47");
            String meatType = userInput.nextLine(); // prompt the user for meat type
            System.out.println("_".repeat(85));

            // extra meat options
            System.out.println("Price of Extra Meat Based on Sandwich Size in Inches (4' $.50 | 8' $1.00 | 12' $1.50) ");
            System.out.println("Add Extra Meat's? (yes/no) ");
            String extraMeatUserChoice =  userInput.nextLine(); // prompt the user if they want to add extra meat
            System.out.println("_".repeat(85));
            System.out.println("Select your Extra Meat's below: \uD83D\uDC47");
            String extraMeat = userInput.nextLine();
            System.out.println("_".repeat(85));

            // cheese options
            System.out.println("Cheese Topping Options (American, Provolone, Cheddar, Swiss)");
            System.out.println("Price of Cheese Based on Sandwich Size in Inches (4' $.75 | 8' $1.50 | 12' $2.25) ");
            System.out.println("Select your Cheese's below: \uD83D\uDC47");
            String cheeseType = userInput.nextLine(); // prompt the user for cheese type
            System.out.println("_".repeat(85));

            // extra cheese options
            System.out.println("Price of Extra Cheese Based on Sandwich Size in Inches (4' $.30 | 8' $.60 | 12' $.90) ");
            System.out.println("Add Extra Cheese's? (yes/no) ");
            String extraCheeseUserChoice =  userInput.nextLine(); // prompt the user if they want to add extra cheese's
            System.out.println("_".repeat(85));
            System.out.println("Select your Extra Cheese's below: \uD83D\uDC47");
            String extraCheese = userInput.nextLine();
            System.out.println("_".repeat(85));

            // regular topping options
            System.out.println("Regular Topping Options (Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers,\nPickles, Guacamole, Mushrooms)");
            System.out.println("(Regular Toppings Are Included in Sandwich Price) ");
            System.out.println("Select your Toppings: ");
            String toppingsType = userInput.nextLine(); // prompt the user for toppings type
            System.out.println("_".repeat(85));

            // sauce options
            System.out.println("Sauce Topping Options (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette)");
            System.out.println("(Sauce Toppings Are Included in Sandwich Price) ");
            System.out.println("Select your Sauces: ");
            String sauceType = userInput.nextLine(); // prompt the user for sauce type
            System.out.println("_".repeat(85));

            // side topping options
            System.out.println("Sides Topping Options (Au Jus, Secret Sauce)");
            System.out.println("(Side Toppings Are Included in Sandwich Price) ");
            System.out.println("Select your Sides: ");
            String sideType = userInput.nextLine(); // prompt the user for side type
            System.out.println("_".repeat(85));
        }

        private void selectToasted () {
            System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
            String toastedOption = userInput.nextLine(); // prompt the user for toasted option
            System.out.println();
            System.out.println("*".repeat(85));
            System.out.println();
            System.out.println("\uD83D\uDD25 E x c e l l e n t,  Y o u r   o r d e r   i s     b e i n g   p r e p a r e d! \uD83D\uDD25");
            System.out.println();
            System.out.println("*".repeat(85));

            // prompt the user to make their next move
            // provides user with an option to start another sandwich order or to exit the application
            System.out.println();
            System.out.println("What do you want to do next? ");
            System.out.println();
            System.out.println("A - Start a New Sandwich Order ");
            System.out.println("B - Return to Place New Order Menu");
            System.out.println("C - Exit the App ");
            System.out.println();
            System.out.println("Enter your choice below: \uD83D\uDC47");
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
