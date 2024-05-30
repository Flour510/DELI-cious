package com.pluralsight.models;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddDrink extends OrderScreen
{
    static Scanner userInput = new Scanner(System.in);

    public void display (Drink drink)
    {
        try
        {
            // display the choose a drink screen
            System.out.println();
            System.out.println("                               \uD83E\uDD64 Choose A Drink \uD83D\uDCA6");
            System.out.println();
            System.out.println("                                   \uD83D\uDCB2 Prices ");
            System.out.println("                          -------------------------------");
            System.out.println("                                    Drink Size ");
            System.out.println("                           (S $2.00 | M $2.50 | L $3.00) ");
            System.out.println();
            System.out.println("*".repeat(85));

        } catch (Exception ex) {
            System.out.println();
            System.out.println("Invalid Input. ");
        }
        chooseADrink(drink);
    }

    private void chooseADrink (Drink drink)
    {
        System.out.println("Drink Options (Coke, Sprite, Orange Fanta, Lemonade) ");
        System.out.println("Select Drink Type: ");
        String drinkType = userInput.nextLine(); // prompt the user for drink type
        drink.setName(drinkType);
        System.out.println("_".repeat(85));
        System.out.println("Select Drink Size: ");
        String drinkSize = userInput.nextLine(); // prompt the user for drink size
        System.out.println();
        System.out.println("*".repeat(85));
        drink.setSize(drinkSize);
        System.out.println();
        System.out.println("    \uD83D\uDD25 R i g h t   o n!   W h a t   d o   y o u   w a n t   t o   d o   n e x t? ");
        System.out.println();
        System.out.println("*".repeat(85));
    }
}
