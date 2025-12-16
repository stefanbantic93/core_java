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
 * <li>switch - case</li>
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji želite saznati ime na Njemačkom jeziku:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        //if(expression ili izraz čija je evaluirana vrijednost TIPA boolean ili true ili false)
        //u switch konstrukt ilazi ili int ili nešto što je konvertibilno u integer..JDK 1.7 (input i String)
        // dayName = f(weekDayNumber) -> y = f(x)
        //Java 12  ->    ključnu riječ "yield"
        //TIP imeVarijable = VRIJEDNOST;  dayName = f(weekDayNumber)
        //Java 17 : Pattern Matching zajedno sa instanceOf ..switch nad tipovima
        String dayName = switch (weekDayNumber) {
            case 1 -> {
                System.out.println("Ponedeljak");
                //yieald -> znači proizvedi rezultat
                yield "Montag";
            }
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Sedmica ima 7 dana i unesi broj između 1 i 7";
        };
        System.out.println(dayName);

        //yield -> donesi ili daj ili izdaj rezulta ili proizvedi rezultat
    }
}
