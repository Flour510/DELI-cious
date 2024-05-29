package com.pluralsight.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddSandwich
{
        static Scanner userInput = new Scanner(System.in);

        public Sandwich display (Sandwich sandwich)
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

                String bread = selectBread();
                sandwich.setBreadType(bread);

                //Size sizeObject = new Size();
                //int sizeValue = selectSize();
                //sizeObject.setSize(sizeValue);

                selectSize(sandwich);
                selectToppings(sandwich);
                selectToasted(sandwich);

            } catch (Exception ex) {
                System.out.println();
                System.out.println("Invalid Input. ");
            }
            return sandwich;
        }

        private String selectBread ()
        {
            System.out.println("Bread Options (White, Wheat, Rye, Wrap) ");
            System.out.println("Select your Bread Type: ");
            String breadType = userInput.nextLine(); // prompt the user for bread type

            System.out.println("_".repeat(85));
            return breadType;
        }

        private int selectSize (Sandwich sandwich)
        {
            System.out.println("Sandwich Size Options in Inches (4' $5.50 | 8' $7.00 | 12' $8.50) ");
            System.out.println("Select your Sandwich Size: ");
            int sandwichSize = Integer.parseInt(userInput.nextLine()); // prompt the user for sandwich size

            sandwich.setSize(sandwichSize);
            System.out.println("_".repeat(85));
            return sandwichSize;
        }

        private void selectToppings (Sandwich sandwich) {
            int size = sandwich.getSize();
            // meat options
            System.out.println("Meat Topping Options (Steak, Ham, Salami, Roast Beef, Chicken, Bacon) ");
            System.out.println("Price of Meat Based on Sandwich Size in Inches (4' $1.00 | 8' $2.00 | 12' $3.00) ");
            System.out.println("Select your Meat's below: \uD83D\uDC47");
            System.out.println("Please separate your selections using commas: \uD83D\uDC47");
            String meatType = userInput.nextLine(); // prompt the user for meat type
            List<String> meatsArr = Arrays.stream(meatType.split(",")).toList();

            sandwich.setMeats(meatsArr);
//

            System.out.println("_".repeat(85));

            // cheese options
            System.out.println("Cheese Topping Options (American, Provolone, Cheddar, Swiss)");
            System.out.println("Price of Cheese Based on Sandwich Size in Inches (4' $.75 | 8' $1.50 | 12' $2.25) ");
            System.out.println("Select your Cheese's below: \uD83D\uDC47");
            System.out.println("Please separate your selections using commas: \uD83D\uDC47");
            String cheeseType = userInput.nextLine(); // prompt the user for cheese type
            List<String> cheesesArr = Arrays.stream(cheeseType.split(",")).toList();
            sandwich.setCheeses(cheesesArr);
            System.out.println("_".repeat(85));

            // regular topping options
            System.out.println("Regular Topping Options (Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers,\nPickles, Guacamole, Mushrooms)");
            System.out.println("(Regular Toppings Are Included in Sandwich Price) ");
            System.out.println("Select your Toppings: ");
            System.out.println("Please separate your selections using commas: \uD83D\uDC47");
            String toppingsType = userInput.nextLine(); // prompt the user for toppings type
            List<String> toppingsArr = Arrays.stream(toppingsType.split(",")).toList();
            sandwich.setRegToppings(toppingsArr);
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

        private void selectToasted (Sandwich sandwich) {
            System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
            String toastedOption = userInput.nextLine(); // prompt the user for toasted option
            sandwich.setToasted(toastedOption.equalsIgnoreCase("yes"));
            System.out.println();
            System.out.println("*".repeat(85));
            System.out.println();


        }
}
