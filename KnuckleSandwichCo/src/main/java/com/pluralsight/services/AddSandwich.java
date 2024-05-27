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
        System.out.println("                         Create your Sandwich ");
        System.out.println();
        System.out.println("*".repeat(70));

        // Prompt the user for sandwich options
        selectBread();
        selectSize();
        selectToppings();
        selectToasted();
    }

    private void selectBread() {
        System.out.println("Select your Bread Type: ");
        System.out.println();
        System.out.println("1) White ");
        System.out.println("2) Wheat ");
        System.out.println("3) Rye ");
        System.out.println("4) Wrap ");
        System.out.println();
        int choice = Integer.parseInt(userInput.nextLine().trim());

        switch (choice) {
            case 1:
                addWhiteBread();
                break;
            case 2:
                addWheatBread();
                break;
            case 3:
                addRyeBread();
                break;
            case 4:
                addWrap();
                break;
            default:
                System.out.println();
                System.out.println("Invalid selection. ");
                System.exit(1);
        }
    }

    // bread options
    private void addWrap() {
    }

    private void addRyeBread() {
    }

    private void addWheatBread() {
    }

    private void addWhiteBread() {
    }

    // sandwich options
    private void selectSize() {
        System.out.println("Select your Sandwich Size: ");
    }

    private void selectToppings() {
        System.out.println("Select your Toppings: ");
    }

    private void selectToasted() {
        System.out.println("Would you like the Sandwich Toasted? (yes/no): ");
    }


}
