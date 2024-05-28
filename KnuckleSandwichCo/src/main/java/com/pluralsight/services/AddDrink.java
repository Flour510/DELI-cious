package com.pluralsight.services;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddDrink extends OrderScreen
{
    static Scanner userInput = new Scanner(System.in);

    public void display ()
    {
        try
        {
            // display the choose a drink screen
            System.out.println();
            System.out.println("*".repeat(85));
            System.out.println();
            System.out.println("                                  Choose A Drink ");
            System.out.println();
            System.out.println("*".repeat(85));

        } catch (Exception ex) {
            System.out.println();
            System.out.println("Invalid Input. ");
        }

        chooseADrink();
    }

    private void chooseADrink ()
    {
        System.out.println("Drink Options (Coke, Sprite, Orange Fanta, Lemonade) ");
        System.out.println("Select Drink Type: ");
        String drinkType = userInput.nextLine(); // prompt the user for drink type
        System.out.println("_".repeat(85));
        System.out.println("Drink Size (S $2.00 | M $2.50 | L $3.00) ");
        System.out.println("Select Drink Size: ");
        String drinkSize = userInput.nextLine(); // prompt the user for drink size
        System.out.println("_".repeat(85));

        // prompt the user to make their next move
        // provides user with an option to add another drink or to exit the application
        System.out.println();
        System.out.println("What do you want to do next? ");
        System.out.println();
        System.out.println("A - Add Another Drink ");
        System.out.println("B - Return to Place New Order Menu");
        System.out.println("C - Exit the App ");
        System.out.println();
        System.out.println("Enter your choice below: \uD83D\uDC47");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println();

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
