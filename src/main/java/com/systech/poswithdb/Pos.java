package com.systech.poswithdb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import com.systech.part3.logging.CustomFormatter;
import com.systech.util.Login;


public class Pos {
    static Scanner scanner = new Scanner(System.in);

    private static final Logger LOGGER = Logger.getLogger(Pos.class.getName());
    private static Connection connection;
    
    public static int totalPayment;
    static int noOfItemsToPurchase = 0;
    static List<Item> items = new ArrayList<>();
    static boolean isCustomerShopping = true;
    static boolean isPaymentMade = false;

    int change;
    int amountPaidByCustomer = 0;

     



     private void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pointofsale", "asule", "asule");   
            Statement statement =  connection.createStatement();
            String createTasksTable = "CREATE TABLE (item_id INT AUTO_INCREMENT PRIMARY KEY,itemCode INT, quantity INT,unitPrice INT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;";
            int updateStatus =  statement.executeUpdate(createTasksTable);
            LOGGER.info("Update status= " + updateStatus);

        }  catch (ClassNotFoundException e) {
            LOGGER.severe("Unable to obtain class for jdbc driver: " + e.getMessage());
        }  catch (SQLException e) {
            LOGGER.severe("Database operation failure: " + e.getMessage());
        }

     }


     public void displayMenu() {
        System.out.println("-----------------------------------");
        System.out.println("-----     SYSTEM POS SYSTEM    ----");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");  
    }

    private void addItems() {
        try {
            String insertQuery = "insert into items (itemCode, quantity, unitPrice)values(?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            System.out.print("Enter the number of items to purchase: ");
            int noOfItemsToPurchase = scanner.nextInt();
             scanner.nextLine();

        for (int i = 0; i < noOfItemsToPurchase; i++) {
            System.out.print("Enter the Item Code: ");
            int itemCode = scanner.nextInt();
    
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt(); 
    
            System.out.print("Enter the unit price: ");
            int unitPrice = scanner.nextInt();
            scanner.nextLine(); 
            totalPayment += (quantity * unitPrice); 

            // Add item to the items array
            Item item = new Item(itemCode, quantity, unitPrice);

            preparedStatement.setInt(1, item.getItemCode());
            preparedStatement.setInt(2, item.getQuantity());
            preparedStatement.setInt(3, item.getUnitPrice());

            int noOfRows = preparedStatement.executeUpdate();
            LOGGER.info("Number of Rows=" + noOfRows);
     

            // items[i] = s;
            // items.add(s);  //keep track of all added items       
        }

        } catch (Exception e) {
           
        }
    }

     public static void main(String[] args) {
         Pos app = new Pos();
         FileHandler fileHandler;
         try {
            // TODO - Method for filehandler.
            fileHandler = new FileHandler("posDatabaseLogs.txt", true);
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

            app.connectToDatabase();

            boolean isLoggedIn = Login.login();
            boolean keepShowingMenu = true;

            if (isLoggedIn) {
                System.out.println("WELCOME TO SYSTECH ");
    
                while (keepShowingMenu) {
                    app.displayMenu();
                
                    try {
                        System.out.println("Choose your option");
                        int option = app.scanner.nextInt();
                        app.scanner.nextLine();
    
                        if (option == 1 ) {
                            while(isCustomerShopping) {
                                app.addItems();
    
                                    System.out.println("Would you like to add more items?: Y/N");
                                    String continueShopping = app.scanner.next();
    
                                    if(continueShopping.equalsIgnoreCase("N")) {
                                        isCustomerShopping=false;
                                     }
                            }
                            System.out.println("Thank you for shopping with us - Proceed to payment/receipt printing.");
              
                        } else if (option == 2) {
                            // make payment
                           
                            
                        } else if (option == 3) {
                            if(isPaymentMade) {
                               /*display receipt then quit
                               add  quuit option*/
                                

                                keepShowingMenu = false;
                            } else {
                                System.out.println("pay first to get a receipt");
                            }
                              
                        } else {
                        }
                    } catch (Exception e) {
                        app.scanner.nextLine();
                        System.out.println("Invalid option... try numbers");
                    }
                }
            } else {
                System.out.println("Maximum attempts failed"); 
            }
            app.scanner.close();
            
         }  catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the Log file" + e.getMessage());
        }
        catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the Log file" + e.getMessage());
        }
        catch (Exception e) {
            LOGGER.severe("an error occurred: " + e.getMessage());
        }
        
     }
    
}