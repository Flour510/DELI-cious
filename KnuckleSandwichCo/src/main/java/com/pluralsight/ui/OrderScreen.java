package com.pluralsight.ui;

import com.pluralsight.models.*;

import static com.pluralsight.ui.UserInterface.userInput;

public class OrderScreen
{
    public void display()
    {
        Order order = new Order();
        while (true) {
            try {
                // print the place an order screen
                System.out.println("*".repeat(85));
                System.out.println();
                System.out.println("                                  Place New Order ");
                System.out.println();
                System.out.println("*".repeat(85));
                System.out.println("What do you want to do? ");
                System.out.println();
                System.out.println("1) Add Sandwich ");
                System.out.println("2) Add Drink ");
                System.out.println("3) Add Chips ");
                System.out.println("4) Checkout ");
                System.out.println("0) Cancel Order ");
                System.out.println();
                System.out.println("Enter your choice below: \uD83D\uDC47");
                int choice = Integer.parseInt(userInput.nextLine().strip());
                System.out.println();

                switch (choice) {
                    case 1:
                        AddSandwich addSandwich = new AddSandwich();
                       Sandwich sandwich = new Sandwich();
                      addSandwich.display(sandwich);
                        order.addSandwich(sandwich);
                        order.displayOrderDetails();
                        break;
                    case 2:
                        //create a drink objects
                        AddDrink addDrink = new AddDrink();
                        Drink drink = new Drink();
                        addDrink.display(drink);
                        // add the drink to the order just like a sandwich
                        order.addDrink(drink);
                        order.displayOrderDetails();
                        break;
                    case 3:
                        AddChips addChips = new AddChips();
                        Chips chip = new Chips();
                        addChips.display(chip);
                        // add the chips to the order
                        order.addChips(chip);
                        order.displayOrderDetails();
                        break;
                    case 4:
                        Checkout checkout = new Checkout();
                        checkout.display(order);
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Order canceled. Goodbye for now❗\uFE0F \uD83D\uDC4B ");
                        System.exit(1);
                    default:
                        System.out.println("Invalid Input.");
                }
            } catch (Exception e)
            {
                System.out.println("Invalid Input. ");
            }
        }
    }
}
