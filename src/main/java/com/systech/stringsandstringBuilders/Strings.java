package com.systech.stringsandstringBuilders;

import java.util.logging.Logger;

public class Strings {
    private static final Logger LOGGER = Logger.getLogger(Strings.class.getName());

    public static void main(String[] args) {

        String message = "Hello";
      
        message.concat(" world!"); 
      
        message =  message.concat(" Programmer!"); 
        LOGGER.info(message);
        
        String sb = new String("Hello, world");
        String sa = "Hello, world";
        boolean equals = sa.equals(sb);
        boolean equals2 = sa == sb;

        LOGGER.info(""+equals);
        LOGGER.info(""+equals2);
    }

}