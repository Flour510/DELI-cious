package com.pluralsight.services;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddChips extends OrderScreen
{
    static Scanner userInput = new Scanner(System.in);

    public void display ()
    {
        try
        {
            // display the add chips screen
            System.out.println();
            System.out.println("*".repeat(85));
            System.out.println();
            System.out.println("                                 Choose Your Chips ");
            System.out.println("                                 (All Chips $1.50) ");
            System.out.println();
            System.out.println("*".repeat(85));

        } catch (Exception ex) {
            System.out.println();
            System.out.println("Invalid Input. ");
        }

        chooseChips();
    }

    private void chooseChips ()
    {
        System.out.println("Chip Options (Hot Cheetos, Doritos, Lays, Lays BBQ) ");
        System.out.println("Select Chip Type: ");
        String chipType = userInput.nextLine(); // prompt the user for chip type
        System.out.println("_".repeat(85));

        // prompt the user to make their next move
        // provides user with an option to add more chips or to exit the application
        System.out.println();
        System.out.println("What do you want to do next? ");
        System.out.println();
        System.out.println("A - Add More Chips ");
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
