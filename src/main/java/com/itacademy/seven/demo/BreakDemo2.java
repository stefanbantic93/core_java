package com.academy.seven.demo;

import java.util.Scanner;

/**
 * Program:
 * Imaš niz brojeva: 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127
 * Želim da pustiš korisnika da unosi neki broj.
 * <p>
 * Program izbaci sljedeću poruku:
 * <li>1. ukoliko se uneseni broj nalazi u postavljenom nizu ispis je "SRETAN POKUŠAJ broj se nalazi na [indexu]" </li>
 * <li>2. ukoliko se uneseni broj NE nalazi u postavljenom nizu ispis je "NESRETAN POKUŠAJ"</li>
 * </p>
 */
public class BreakDemo2 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        System.out.println("Unesi cijeli broj i okušaj sreću");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message = "NESRETAN POKUŠAJ";
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            //način da pristupim vrijednosti elementa na indeksu i
            int numberInArray = arrayOfNumbers[i];
            if (numberInArray == enteredNumber) {
                message = "SRETAN POKUŠAJ broj se nalazi na [" + i + "]";
                break;
            }
        }
        System.out.println(message);
    }
}
