package com.pluralsight.models;

import com.pluralsight.ui.OrderScreen;

import java.util.Scanner;

public class AddChips extends OrderScreen
{
    static Scanner userInput = new Scanner(System.in);

    public void display (Chips chip)
    {
        try
        {
            // display the add chips screen
            System.out.println();
            System.out.println("                                 Choose Your Chips ");
            System.out.println("                                 (All Chips $1.50) ");
            System.out.println();
            System.out.println("*".repeat(85));

        } catch (Exception ex) {
            System.out.println();
            System.out.println("Invalid Input. ");
        }
        chooseChips(chip);
    }

    private void chooseChips (Chips chips)
    {
        System.out.println();
        System.out.println("Chip Options (Hot Cheetos, Doritos, Lays, Lays BBQ) ");
        System.out.println("Select Chip Type: ");
        String chipType = userInput.nextLine(); // prompt the user for chip type
        chips.setType(chipType);
        System.out.println();
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("\uD83D\uDD25 L o o k i n g   g o o d!   W h a t   d o   y o u   w a n t   t o   d o   n e x t? ");
        System.out.println();
        System.out.println("*".repeat(85));
    }
}
