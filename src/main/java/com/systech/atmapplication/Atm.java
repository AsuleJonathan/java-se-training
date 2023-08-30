package com.systech.atmapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
 public static void main(String[] args) throws InterruptedException {

        
 
/* constants */
    Scanner sc = new Scanner(System.in);
    final String PASSWORD = "Admin123";
    double balance = 1000.0;
    int attempts = 3;
    boolean b = true;
 
    

/* compares and then decrements */
    while (attempts > 0 ){
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (password.equals(PASSWORD)){
/* Boolean b for option 5 */ 
        while (true) {
            
       
        System.out.println("****************");
        System.out.println();
        System.out.println("ATM SIMULATOR");
        System.out.println();

        System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        System.out.println();
        System.out.println("ATM SERVICES");
        System.out.println();
        System.out.println("_______________");
        System.out.println();
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Transfer Cash");
        System.out.println("5. Quit");
        System.out.println("_______________" );

        System.out.print("Please Choose Your Transaction: ");
    try {
           int option = sc.nextInt();
        sc.nextLine();
        if (option == 1) {
            System.out.println("Your balance is: Ksh " + balance);
           Thread.sleep(3000); 
            
        } else if (option == 2) {
            System.out.print("Enter the Deposit amount: ");
            int amount = sc.nextInt();

            balance = balance + amount;
            System.out.println("Your new balance is: " + balance);
            Thread.sleep(3000);
        } else if (option == 3) {
            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();

            if( (balance - amount) < 0) {
              System.out.print("Your amount is low for the transaction \n");
             } else {

            /* withdrawCharges = withdrawCharges +  ( 2% of amount); */
            balance = balance - amount - ( 2.0/100 * amount);
            System.out.println("Your new balance is: " + balance);
            Thread.sleep(3000);
             }

           
        } else if (option == 4) {
             System.out.print("Enter the amount to be transfered: ");
            int amount = sc.nextInt();
            balance = balance - amount;
            System.out.println("Your new balance is: " + balance);
            Thread.sleep(3000);
            
        } else if (option == 5) {
            System.out.println("------------Receipt--------------");
            System.out.println("*********************************");
            break;

            
        } else {
            System.out.println("Option Not Recognized.");
        }
 
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("invalid please enter a valid option");
            sc.nextLine();
        }
        
 }
 break;
        }
    else { System.out.println("Incorrect. Number of attempts remaining: " + attempts);        
    }

        }
        sc.close();
    }
}



