package com.systech.pointofsale;

import java.util.Scanner;
import java.util.ArrayList;

public class pos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Admi123";
        int loginAttempts = 0;

        while (loginAttempts < 3) {
            System.out.println("SYSTECH POS SYSTEM");
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
                loginAttempts++;
            }
        }

        if (loginAttempts == 3) {
            System.out.println("Login attempts exceeded. Exiting program.");
            System.exit(1);
        }
    }
}