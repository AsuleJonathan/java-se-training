package com.systech.part2.staticclasses;

import static com.systech.part2.staticclasses.StringsUtils.trim;
public class StaticDemo {
    /*
     * public static void main(String[] args) {
     * 
     * }
     */

    /*
     * public static void main(String... args) {
     * 
     * }
     */
    static public void main(String... args) {
        int a=10;
        int b =40;
        System.out.println(MathUtils.Geometry.calculateArea(a, b));
        System.out.println(MathUtils.Geometry.calculatePerimeter(a, b));
        System.out.println(MathUtils.Calculator.sum(a, b));
        String name = " ";
        
        boolean nameEmptyOrNull = StringsUtils.isNullOrEmpty(name);

        System.out.println("nameEmptyOrNull = " + nameEmptyOrNull);

        String password = "   Admin@123   ";
        String confirmPassword = "Admin@123 ";

        if(StringsUtils.trim(password).equals(StringsUtils.trim(confirmPassword))){
            System.out.println("Passwords are equal");
        }
        String cardNumber = "1234567892456789";
        System.out.println(AtmUtils.maskCardNumber(cardNumber));//XXXXXXXXXXXX6789
        System.out.println(trim("  abc"));

    }

    
    

}
