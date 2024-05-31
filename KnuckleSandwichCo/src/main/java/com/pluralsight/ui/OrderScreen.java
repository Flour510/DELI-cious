package com.pluralsight.ui;

import com.pluralsight.models.*;

import static com.pluralsight.ui.UserInterface.userInput;

public class OrderScreen
{
    public void display()
    {
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("                              ✨ Make A Selection  ");
        System.out.println();
        System.out.println("*".repeat(85));

        // creates an instance of the order class to manage the current order
        Order order = new Order();

        // continuously prompts the user for input until the order is completed or canceled
        while (true) {
            try {
                // menu
                System.out.println();
                System.out.println("1) Add Sandwich ");
                System.out.println("2) Add Drink ");
                System.out.println("3) Add Chips ");
                System.out.println("4) Checkout \uD83D\uDED2 ");
                System.out.println("0) Cancel Order ");
                System.out.println();
                System.out.println("Enter your choice below: \uD83D\uDC47");
                int choice = Integer.parseInt(userInput.nextLine().strip());
                System.out.println();
                System.out.println("*".repeat(85));

                switch (choice) {
                    case 1:
                        AddSandwich addSandwich = new AddSandwich(); // creates an instance of AddSandwich class
                        Sandwich sandwich = new Sandwich(); // create a new instance of sandwich class
                        addSandwich.display(sandwich); // displays options for adding a sandwich
                        order.addSandwich(sandwich); // adds to the order
                        order.displayOrderDetails();
                        break;
                    case 2:
                        AddDrink addDrink = new AddDrink();
                        Drink drink = new Drink();
                        addDrink.display(drink);
                        order.addDrink(drink);
                        break;
                    case 3:
                        AddChips addChips = new AddChips();
                        Chips chip = new Chips();
                        addChips.display(chip);
                        order.addChips(chip);
                        order.displayOrderDetails();
                        break;
                    case 4:
                        Checkout checkout = new Checkout();
                        checkout.display(order); // displays order summary to the checkout screen
                        checkout.createCsv(order); // pushes the order details to a csv file
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Order canceled. Goodbye for now❗\uFE0F \uD83D\uDC4B ");
                        System.exit(1);
                    default:
                        System.out.println("Invalid Input. ");
                }
            } catch (Exception e)
            {
                System.out.println("Invalid Input. ");
            }
        }
    }
}
