package com.systech.pointofsale;

import java.util.Scanner;

import com.systech.util.Login;

import java.util.ArrayList;



public class Pos {
        private static ArrayList <Item> listOfItemsPurchased = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static boolean keepShopping = true;


    public static void main(String[] args) {
        Pos app = new Pos();
        boolean isLoggedIn = Login.login();
        boolean keepShowingMenu = true;
    

    if (isLoggedIn){
        while (keepShowingMenu) {
            app.displayOutput();
            try {
                System.out.println("Choose your option");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1 ) {
                    while(keepShopping) {
                        app.addItem();
                        }
                    } else if (option == 2) {
                   app.makePayment();
                        // make payment
                    } else if (option == 3) {
                        app.displayReceipt();
                           // display receipt then quit
                            keepShowingMenu = false;
                    }
                    else {
                        System.out.println("Invalid option... try again");
                    }
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Invalid option - Integers only... try again");
                }

        }
    }
      
      
        
}
public void displayOutput() {
    System.out.println("*******************");
    System.out.println("SYSTECH POS SYSTEM");
    System.out.println("__________________");
    System.out.println("1. ADD ITEM");
    System.out.println("2. MAKE PAYMENT");
    System.out.println("3. DISPLAY RECEIPT");

}

public void addItem() {
    System.out.println("Input Item Code:");
     String itemCode = scanner.nextLine();

    System.out.println("Input Quantity:");
    int quantity = scanner.nextInt();

    System.out.println("Input price per item");
    double pricePerItem = scanner.nextDouble();

    double totalValue = quantity * pricePerItem;
    listOfItemsPurchased.add(new Item(itemCode, quantity, pricePerItem, totalValue));

    scanner.nextLine();

    System.out.println("Item added successfully! ");

    System.out.println("To add another item type Y add if not type N to exit");
    String addItem = scanner.nextLine();
    if (addItem.equalsIgnoreCase("add")) {
        return;
    }
    else{
        keepShopping = false;
    }
}

public void makePayment() {
    System.out.println("Item Code      Quantity      Unit Price      Total Value");
    double total = 0.0;

    for (Item item : listOfItemsPurchased) {
        System.out.println(item.getItemCode() + "\t\t" + item.getQuantity() + "\t\t" + item.getpricePerItem()
                + "\t\t" + item.getTotalValue());
        total += item.getTotalValue();
    }

    System.out.println("***********************************");
    System.out.println("Total:\t\t\t\t" + total);

    System.out.println("Enter the amount given by Customer:");
    double amountGiven = scanner.nextDouble();

    double change = amountGiven - total;
    System.out.println("Change:\t\t\t\t" + change);
}

private void displayReceipt() {
    System.out.println("Item Code      Quantity      Unit Price      Total Value");
    for (Item item : listOfItemsPurchased) {
        System.out.println(item.getItemCode() + "\t\t" + item.getQuantity() + "\t\t" + item.getpricePerItem()
                + "\t\t" + item.getTotalValue());
    }

    System.out.println("*********************************************************");
    double total = 0.0;
    for (Item item : listOfItemsPurchased) {
        total += item.getTotalValue();
    }
    System.out.println("Total:\t\t\t\t" + total);

        System.out.println("**********************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH SYSTECH");
        System.out.println("WE HOPE TO SEE YOU AGAIN");
        System.out.println("**********************************************************");
        listOfItemsPurchased.clear();
        System.exit(0);

    }
}
