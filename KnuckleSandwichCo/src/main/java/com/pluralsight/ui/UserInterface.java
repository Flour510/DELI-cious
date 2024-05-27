package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface
{
    static final Scanner userInput = new Scanner(System.in);

    public void display()
    {
        // greeting
        System.out.println();
        System.out.println("                   Welcome to Knuckle Sandwich Co. ");
        System.out.println("               \uD83E\uDD64 Serving the Bay Area since 1996! \uD83E\uDD6A");
        System.out.println("*".repeat(70));

        while (true)
        {
            try
            {
                // home screen
                System.out.println();
                System.out.println("                                Home ");
                System.out.println();
                System.out.println("*".repeat(70));

                // home options
                System.out.println();
                System.out.println("1) New Order ");
                System.out.println("0) Exit ");
                System.out.println();
                System.out.println("Make a selection below: ");
                int choice = Integer.parseInt(userInput.nextLine().strip());
                System.out.println();

                switch (choice)
                {
                    case 1:
                        OrderScreen orderScreen = new OrderScreen();
                        orderScreen.display();
                        break;
                    case 0:
                        System.out.println("Goodbye for now❗\uFE0F \uD83D\uDC4B ");
                        System.exit(1);
                    default:
                        System.out.println("Invalid Input.");

                }
            } catch (Exception e) {
                System.out.println("Invalid selection! ");
            }
        }

    }

}
