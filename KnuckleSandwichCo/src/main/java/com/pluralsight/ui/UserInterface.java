package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface
{
    static final Scanner userInput = new Scanner(System.in);

    public void display()
    {
        System.out.println();
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("           W e l c o m e   t o   K n u c k l e   S a n d w i c h    C o. ");
        System.out.println();
        System.out.println("                     \uD83E\uDD64 Serving East Oakland since 1996! \uD83E\uDD6A");
        System.out.println();
        System.out.println("*".repeat(85));

        while (true)
        {
            try
            {
                System.out.println();
                System.out.println("1) New Order ");
                System.out.println("0) Exit ");
                System.out.println();
                System.out.println("Make a selection: ");
                int choice = Integer.parseInt(userInput.nextLine().strip());
                System.out.println();

                switch (choice)
                {
                    case 1:
                        OrderScreen orderScreen = new OrderScreen(); // creates an instance of order class
                        orderScreen.display();
                        break;
                    case 0:
                        System.out.println("Goodbye for now❗\uFE0F \uD83D\uDC4B ");
                        System.exit(1);
                    default:
                        System.out.println("Invalid Input. ");
                }
            } catch (Exception e) {
                System.out.println("Invalid selection! ");
            }
        }
    }
}
