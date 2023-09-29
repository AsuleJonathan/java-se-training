package com.systech.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

import com.systech.pointofsale.Login;

public class Restaurant {
  Scanner scanner = new Scanner(System.in);

  static boolean keepShowingMenu = true;
  static ArrayList<String> customerOrder = new ArrayList<>();


  public void displayMenu() {
      System.out.println("------------------------------------------------------");
      System.out.println("SYSTECH RESTAURANT");
      System.out.println("\nDRINKS");
      System.out.println("--------------");
      System.out.println("1. CHAI----------------------------------------------15");
      System.out.println("2. ANDAZI--------------------------------------------10");
      System.out.println("3. TOSTI---------------------------------------------12");
      System.out.println("\nMEALS");
      System.out.println("--------------");
      System.out.println("4. NDENGU AND ACCOMPLISHMENTS------------------------15");
      System.out.println("5. BEANS AND ACCOMPLISHMENTS-------------------------10");
      System.out.println("6. PILAU VEG-----------------------------------------12");
      System.out.println("7. QUIT");


  }
  public void makeAnotherOrder(Menu order){
      System.out.println("Do you want another meal/drink? Y or N: ");
      String proceedOrdering = scanner.next();

      if(proceedOrdering.equalsIgnoreCase("N")) {
        payment(order);
      }

  }

  public void payment(Menu order) {
      int totalOrder = order.calculateTotalOrderCost();
      int balance = 0;
      System.out.println("Pay now For: ");

      for(String orderItem: customerOrder) {
        System.out.println(orderItem);
      }
      System.out.println("********************************************************");
      System.out.println("Total:  ----------------------------------------------" + totalOrder);
      System.out.println("Total bill amount: " + totalOrder);
      System.out.println("Enter amount to pay: ");
      int amount = scanner.nextInt();
      if(amount > totalOrder) {
        balance  = amount - totalOrder;
      }
      System.out.println("Your balance is -------------------------------------" + balance);


      System.out.println("DIG IN!!!! :)");
      keepShowingMenu = false;

  }

    public static void main(String[] args) {
      Restaurant app = new Restaurant();
      Menu order = new Menu();


      boolean isLoggedIn = Login.login();

      if(isLoggedIn) {
         System.out.println("WELCOME!!!");

        while(keepShowingMenu) {
            app.displayMenu();
            System.out.println("Choose your Drink/Meal-One item at a time");
            try {
              System.out.println("Enter your Meal/Drink option: ");
              int option = app.scanner.nextInt();
              app.scanner.nextLine();                 

              if(option == 1 ) {
                  order.setChai(15);
                  customerOrder.add("Chai -------------------------------------------------15");
                  app.makeAnotherOrder(order);  
              } else if(option == 2) {
                  order.setAndazi(10);
                  customerOrder.add("Andazi -----------------------------------------------10");
                  app.makeAnotherOrder(order);
              }else if(option == 3) {
                  order.setTosti(12);
                  customerOrder.add("Tosti ------------------------------------------------12");
                  app.makeAnotherOrder(order);
              }else if(option == 4) {
                  order.setNdenguAndAccompishments(70);
                  customerOrder.add("Ndengu and accomplishment ----------------------------70");
                  app.makeAnotherOrder(order);
              }else if(option == 5) {
                  order.setBeansAndAccompishments(70);
                  customerOrder.add("Beans and accomplishment -----------------------------70");
                  app.makeAnotherOrder(order);
              }else if(option == 6) {
                  order.setPilauVeg(90);
                  customerOrder.add("Pilau Veg --------------------------------------------90");
                  app.makeAnotherOrder(order);
              }else if(option == 7) {
                System.out.println("Thank you and come again ");
                keepShowingMenu = false;
              }else {
                System.out.println("please choose a valid option");
              }
          
      } catch (Exception e) { 
          app.scanner.nextLine();
          System.out.println("Invalid option - Integers only... try again");  
      }
  
        }
      }else {
        System.out.println("Attempt Limit Exeeded");
    }
        
  
    }
    
}
