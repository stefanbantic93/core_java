package com.academy.five.flow;

import java.util.Scanner;

/**
 * ZADATAK:
 * Sedmica/Tjedan
 * 7 dana.
 * Želimo da korisnik programa unese redni broj dana u sedmici: 1-7
 * Pri tome će mu program ispisati kao rezultat ime dana
 * na Njemačkom  jeziku.
 * <p>
 * <p>
 * SWITCH konstrukcija se sastoji od nekoliko ključnih riječi:
 * <li>switch - case - break</li>
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji želite saznati ime na Njemačkom jeziku:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        //if(expression ili izraz čija je evaluirana vrijednost TIPA boolean ili true ili false)
        //u switch konstrukt ilazi ili int ili nešto što je konvertibilno u integer..JDK 1.7 (input i String)
        String dayName;
        switch (weekDayNumber) {
            case 1:
                //blok koda koji se izvršava kada je weekDayNumber=1
                dayName = "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Donnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samstag";
                break;
            case 7:
                dayName = "Sonntag";
                break;
            default:
                dayName = "Sedmica ima 7 dana i unesi broj između 1 i 7";
                break;
        }
        System.out.println(dayName);
    }
}
