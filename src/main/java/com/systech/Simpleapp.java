package com.systech;
import java.util.Scanner;

public class Simpleapp {
    
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Write the first string:");
            String first = reader.nextLine();
            System.out.println("Write the second string:");
            String second = reader.nextLine();
            System.out.println("Write the third string:");
            String third = reader.nextLine();

            System.out.println("Last string you wrote was " + third + ", which ");
            System.out.println("was preceded by " + second+ ".");
            System.out.println("The first string was " + first + ".");

            System.out.println("All together: " + first + second + third);
        }
    }
}

