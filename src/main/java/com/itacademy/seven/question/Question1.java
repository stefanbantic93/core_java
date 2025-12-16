package com.academy.seven.question;

import java.util.Scanner;

/**
 * Od JDK 1.7 u switch konstrukciju je moguće kao INPUT poslati String.
 * Zašto ?
 * equals & hashCode
 *
 */
public class Question1 {
    public static void main(String[] args) {
        //String & SWITCH

        System.out.println("Bitte schreiben Sie Tagname");
        String dayName = new Scanner(System.in).nextLine();
        int hashCode = dayName.hashCode();
        int weekDayNumber;
        switch (dayName) {
            case "Montag":
                weekDayNumber = 1;
                break;
            case "Dienstag":
                weekDayNumber = 2;
                break;
            case "Mittwoch":
                weekDayNumber = 3;
                break;
            case "Donnerstag":
                weekDayNumber = 4;
                break;
            case "Freitag":
                weekDayNumber = 5;
                break;
            case "Samstag":
                weekDayNumber = 6;
                break;
            case "Sonntag":
                weekDayNumber = 7;
                break;
            default:
                weekDayNumber = 0;
                break;

        }

//        String message = " Za uneseni dan na njemačkom " + dayName + " redni broj dana je " + weekDayNumber;
        String message = "Za uneseni dan na njemačkom '%s' redni broj dana je '%s'".formatted(dayName, weekDayNumber);
        System.out.println(message);
    }
}
