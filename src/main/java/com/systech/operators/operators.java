package com.systech.operators;

import java.util.logging.Logger;

public class operators {
    private static final Logger LOGGER = Logger.getLogger(operators.class.getName());

    public void arithmeticOperators() {

        int studentOneAge = 22;
        int studentTwoAge = 19;

       
        int totalClassAge = studentOneAge + studentTwoAge;
        LOGGER.info("Total class Age: " + totalClassAge);

      
        int ageDifference = studentOneAge - studentTwoAge;
        LOGGER.info("Age difference: " + ageDifference);

       
        int ageProduct = studentOneAge * studentTwoAge;
        LOGGER.info("Age product: " + ageProduct);


        int divisionResult = studentOneAge / studentTwoAge;
        LOGGER.info("Division: " + divisionResult);

        
        double divisionResultInDouble = (double) studentOneAge / studentTwoAge;
        LOGGER.info("Division with precision: " + divisionResultInDouble);

        int remainder = studentOneAge % studentTwoAge;
        LOGGER.info("Remainder: " + remainder);

    }

    public void assignmentOperators() {
     
        int quantity = 35;

        quantity += 10; 
        LOGGER.info("Quantity: " + quantity);

       quantity *= 100; 
        LOGGER.info("Quantity: " + quantity);
        quantity /= 20; 
        LOGGER.info("Quantity: " + quantity);
    }

    public void comparisonOperators() {
        int studentOneAge = 20;
        int studentTwoAge = 25;

        // equality operator
        boolean isStudentOneAgeEqualToStudentTwoAge = studentOneAge == studentTwoAge;
        LOGGER.info("isStudentOneAgeEqualToStudentTwoAge: " + isStudentOneAgeEqualToStudentTwoAge);

        // Inequality operator
        boolean isStudentOneAgeNotEqualToStudentTwoAge = studentOneAge != studentTwoAge;
        LOGGER.info("isStudentOneAgeNotEqualToStudentTwoAge: " + isStudentOneAgeNotEqualToStudentTwoAge);

        // less than operator
        boolean isStudentOneAgeLessThanStudentTwoAge = studentOneAge < studentTwoAge;
        LOGGER.info("isStudentOneAgeLessThanStudentTwoAge: " + isStudentOneAgeLessThanStudentTwoAge);

        // greater than operator
        boolean isStudentOneAgeGreaterThanStudentTwoAge = studentOneAge > studentTwoAge;
        LOGGER.info("isStudentOneAgeGreaterThanStudentTwoAge: " + isStudentOneAgeGreaterThanStudentTwoAge);
    }

    public void andLogicalOperators() {
        int studentOneAge = 20;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;
        // and operator
        if (isStudentOneAllowed && isStudentTwoAllowed) {
            LOGGER.info("All students allowed  for ID registration");
        } else {
            LOGGER.info("Not allowed  for ID registration");
        }

    }

    public void orLogicalOperators() {
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;
        // and operator
        if (isStudentOneAllowed || isStudentTwoAllowed) {
            LOGGER.info("Students allowed  for ID registration");
        } else {
            LOGGER.info("Not allowed  for ID registration");
        }

    }

    public void notLogicalOperators() {
        int studentOneAge = 17;
        int studentTwoAge = 25;
        boolean isStudentOneAllowed = studentOneAge >= 18;
        // and operator
        if (!isStudentOneAllowed) {
            LOGGER.info("Students allowed  for ID registration");
        } else {
            LOGGER.info("Not allowed  for ID registration");
        }
    
        // Do one for less than or equal to operator
         boolean isStudentOneAgeLessThanOrEqualToStudentTwoAge = studentOneAge <= studentTwoAge;
         LOGGER.info("isStudentOneAgeLessThanOrEqualToStudentTwoAge: " + isStudentOneAgeLessThanOrEqualToStudentTwoAge);
 
         // Do one for greater than or equal to operator
         boolean isStudentOneAgeGreaterThanOrEqualToStudentTwoAge = studentOneAge >= studentTwoAge;
         LOGGER.info("isStudentOneAgeGreaterThanOrEqualToStudentTwoAge: " + isStudentOneAgeGreaterThanOrEqualToStudentTwoAge);
     }



    public static void main(String[] args) {
        operators app = new operators();
        app.notLogicalOperators();
    }
}