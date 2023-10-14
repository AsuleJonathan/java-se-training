package com.systech.part4.utildate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class WorkingWithNewAndDateTime {
    public static void main(String[] args) {
        // workingWithLocalDate();
        // workingWithLocalDateTime();
        workingWithLocalTime();

        Period p = Period.ofYears(10);
        Period pm = Period.ofMonths(5);

        Duration nineHours = Duration.ofHours(9);
        System.out.println("nineHours : " + nineHours);
        System.out.println("End time: " + LocalTime.now().plus(nineHours));
        System.out.println(p);
        System.out.println(pm);
        LocalDate localDate = LocalDate.now();
        System.out.println("10 years from  now: " + localDate.plus(p));
        System.out.println( "5 months from now: " + localDate.plus(pm));
        
    }

    private static void workingWithLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime startTime = LocalTime.of(8, 0, 0);
        LocalTime endTime = startTime.plusHours(2).plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        System.out.println(formatter.format((endTime)));
    }
}