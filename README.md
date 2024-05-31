# Welcome to Knuckle Sandwich Co. 🥪
In this repository you will find the code written in the Java language that builds a POS for a custom sandwich shop. According to these instructions, the appltication is to be built with these specifications in mind:

- Must make use of OOP concepts
- Must start the project by building a UML diagram
- Customers can order sandwiches in 3 sizes (4", 8" and 12")
- Topping are to be categorized as regular and premium
- Should be able to add drinks and chips
- Must display receipt and total cost to a CSV file when order is complete 

~ Workbook 8 - Capstone 2 (The Deli)

# UML Diagram 
I started with creating a UML diagram to map out what I will need to build my code.

![Screenshot 2024-05-30 at 5 24 09 PM](https://github.com/Flour510/DELI-cious/assets/99916123/15d30828-e8a6-4b5d-9671-229dbe2ee434)

# Screens
When you initially run the code, the terminal displays a greeting to the user. Followed by two choices. 

![Screenshot 2024-05-30 at 5 26 42 PM](https://github.com/Flour510/DELI-cious/assets/99916123/5624f624-8c9a-4f41-a5e6-45e818e390f3)

# New Order
If the user selects option 1 - New Order, they are taken to the Make A Selection screen where they are prompted to make a selection from 1 - 4 & 0. 

![Screenshot 2024-05-30 at 5 29 08 PM](https://github.com/Flour510/DELI-cious/assets/99916123/86dc7e0e-01d3-4803-be31-f2085558d0c8)

# Build Your Sandwich Screen
If the user enters option 1 - Add Sandwich, they are taken to the Build Your Sandwich screen where they are prompted a Price menu:

![Screenshot 2024-05-30 at 5 32 01 PM](https://github.com/Flour510/DELI-cious/assets/99916123/97f6ce2b-390b-49d5-8596-db13a59d5490)

The price menu displays information on Sandwich Size Options, Price of Premium Meat Options, Premium Cheese Options, and (Regular Toppings, Sauces, and Sides that are at no extra cost). Followed by step by step prompts for the user to customize their Sandwich:

![Screenshot 2024-05-30 at 5 38 01 PM](https://github.com/Flour510/DELI-cious/assets/99916123/07ed8545-e78e-4dd9-9f97-2657834b3c7a)

# Choose A Drink Screen
If the user enters option 2 - Add Drink, they are taken to the Choose A Drink screen where they are first prompted with a Price menu based on the Drink Size, followed by a "what to do next?" list of options:

![Screenshot 2024-05-30 at 5 43 05 PM](https://github.com/Flour510/DELI-cious/assets/99916123/346d8b61-daf0-4baa-9a6f-8e14ea9fa81d)

# Choose Your Chips Screen
If the user enters option 3 - Add Chips, they are taken to the Choose Your Chips screen where they are prompted with the Chip options, followed by a "what to do next?" list of options:

![Screenshot 2024-05-30 at 5 46 49 PM](https://github.com/Flour510/DELI-cious/assets/99916123/f17f798d-4adb-4683-92d6-cf8db6c6417a)

# Checkout Screen
When the user is done building their order and chooses option 4 - Checkout, they are displayed a Receipt screen that provides the user with a order summary, followed by their order Total:

![Screenshot 2024-05-30 at 5 59 26 PM](https://github.com/Flour510/DELI-cious/assets/99916123/0ae92b9a-8052-42d5-aefd-ecbe73db7c94)

# Interesting Piece of Code
The code I found particularly interesting was creating pushing the receipet to a CSV file. I could not for the life of me figure out how to implement this to my code, until I asked my instrutor. It was as simple as adding a FileWriter and FileReader in a try/catch and then adding a for loop inside of that. 

# Ability to Print Receipt to CSV File
![Screenshot 2024-05-30 at 6 13 11 PM](https://github.com/Flour510/DELI-cious/assets/99916123/aa4ea01e-9592-4e15-9041-0fde38508407)



