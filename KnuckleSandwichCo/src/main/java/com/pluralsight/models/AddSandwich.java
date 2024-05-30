package com.pluralsight.models;

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
                System.out.println();
                System.out.println("                                 Build Your Sandwich ");
                System.out.println("                                   \uD83E\uDD56 \uD83E\uDD53 \uD83E\uDDC0 \uD83C\uDF45 \uD83E\uDD6C ");
                System.out.println();
                System.out.println("                                     \uD83D\uDCB2 Prices ");
                System.out.println("                           -------------------------------");
                System.out.println("                           Sandwich Size Options in Inches ");
                System.out.println("                          (4' $5.50 | 8' $7.00 | 12' $8.50) ");
                System.out.println();
                System.out.println("                     Price of Meat Based on Sandwich Size in Inches ");
                System.out.println("                           (4' $1.00 | 8' $2.00 | 12' $3.00) ");
                System.out.println();
                System.out.println("                    Price of Cheese Based on Sandwich Size in Inches ");
                System.out.println("                           (4' $.75 | 8' $1.50 | 12' $2.25) ");
                System.out.println();
                System.out.println("                    (Regular Toppings Are Included in Sandwich Price) ");
                System.out.println();
                System.out.println("                        (Sauces Are Included in Sandwich Price) ");
                System.out.println();
                System.out.println("                        (Sides Are Included in Sandwich Price) ");
                System.out.println();
                System.out.println("*".repeat(85));

                String bread = selectBread();
                sandwich.setBreadType(bread);

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
            System.out.println("Bread Options (White, Bolillo, Wheat, Rye, Wrap) ");
            System.out.println("Select Bread Type: \uD83D\uDC47");
            String breadType = userInput.nextLine(); // prompt the user for bread type
            System.out.println("_".repeat(85));
            return breadType;
        }

        private int selectSize (Sandwich sandwich)
        {
            System.out.println("Select your Sandwich Size: \uD83D\uDC47");
            int sandwichSize = Integer.parseInt(userInput.nextLine()); // prompt the user for sandwich size

            sandwich.setSize(sandwichSize);
            System.out.println("_".repeat(85));
            return sandwichSize;
        }

        private void selectToppings (Sandwich sandwich) {
            int size = sandwich.getSize();
            // meat options
            System.out.println("Meat Options (Asada, Ham, Steak, Salami, Roast Beef, Chicken, Bacon) ");
            System.out.println("Select Meat's below (Please separate your selections using commas & no spaces): \uD83D\uDC47 ");
            String meatType = userInput.nextLine(); // prompt the user for meat type

            List<String> meatsArr = Arrays.stream(meatType.split(",")).toList();
            sandwich.setMeats(meatsArr);
            System.out.println("_".repeat(85));

            // cheese options
            System.out.println("Cheese Options (Queso Fresco, American, Provolone, Cheddar, Swiss)");
            System.out.println("Select Cheese's below (Please separate your selections using commas & no spaces): \uD83D\uDC47");
            String cheeseType = userInput.nextLine(); // prompt the user for cheese type

            List<String> cheesesArr = Arrays.stream(cheeseType.split(",")).toList();
            sandwich.setCheeses(cheesesArr);
            System.out.println("_".repeat(85));

            // regular topping options
            System.out.println("Regular Topping Options (Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers,\nPickles, Guacamole, Mushrooms)");
            System.out.println("Select Toppings below (Please separate your selections using commas & no spaces): \uD83D\uDC47");
            String toppingsType = userInput.nextLine(); // prompt the user for toppings type

            List<String> toppingsArr = Arrays.stream(toppingsType.split(",")).toList();
            sandwich.setRegToppings(toppingsArr);
            System.out.println("_".repeat(85));

            // sauce options
            System.out.println("Sauce Options (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette)");
            System.out.println("Select Sauces: \uD83D\uDC47");
            String sauceType = userInput.nextLine(); // prompt the user for sauce type
            System.out.println("_".repeat(85));

            // side topping options
            System.out.println("Side Options (Au Jus, Secret Sauce)");
            System.out.println("Select Sides: \uD83D\uDC47");
            String sideType = userInput.nextLine(); // prompt the user for side type
            System.out.println("_".repeat(85));
        }

        private void selectToasted (Sandwich sandwich) {
            System.out.println("Sandwich Toasted? (yes/no): \uD83D\uDC47");
            String toastedOption = userInput.nextLine(); // prompt the user for toasted option

            sandwich.setToasted(toastedOption.equalsIgnoreCase("yes"));
            System.out.println();
            System.out.println("*".repeat(85));
            System.out.println();
            System.out.println("   \uD83D\uDD25 E x c e l l e n t!   W h a t   d o   y o u   w a n t   t o   d o   n e x t? ");
            System.out.println();
            System.out.println("*".repeat(85));
        }
}
