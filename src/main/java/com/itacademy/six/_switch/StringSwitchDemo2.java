package com.academy.six._switch;

import java.util.Scanner;

/**
 * Java 1.7 uvodi novinu u kontekstu switch konstrukcije.
 * Ranije u starim verzijam prije 7 je switch primao samo int value.
 * <p>
 * Java 7 uvodi to da kao ulazni parametar u switch može ići i String.
 * </p>
 * ZADATAK:
 * Korisnik unosi tekstualnu vrijednost dakle tipa String.
 * Ukoliko je ispravno unio ime dana u sedmici na Njemačkom dobiće redni broj dana u sedmici.
 * <p>
 * Example:
 * String dayName = "Montag";
 * int weekDayNumber = 1;
 * <p>
 * String dayName = "Dienstag";
 * int weekDayNumber = 2;
 * <p>
 * weekDayNumber = f(dayName) -> y = f(x)
 */
public class StringSwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Bitte schreiben Sie Tagname");
        String dayName = new Scanner(System.in).nextLine();
        int weekDayNumber = switch (dayName) {
            case "Montag" -> 1;
            case "Dienstag" -> 2;
            case "Mittwoch" -> 3;
            case "Donnerstag" -> 4;
            case "Freitag" -> 5;
            case "Samstag" -> 6;
            case "Sonntag" -> 7;
            default -> 0;
        };
        String message = "Za uneseni dan na njemačkom '%s' redni broj dana je '%s'".formatted(dayName, weekDayNumber);
        System.out.println(message);
    }
}
