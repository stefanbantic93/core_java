package com.academy.seven.demo;

import java.util.Scanner;

/**
 * Program:
 * Imaš niz brojeva: { 32, 87, 3, 589 },
 * { 12, 1076, 2000, 8 },
 * { 622, 127, 77, 955 }
 * Želim da pustimo korisnika da unosi neki broj.
 * <p>
 * Program izbaci sljedeću poruku:
 * <li>1. ukoliko se uneseni broj nalazi u postavljenom 2d nizu ispis je "SRETAN POKUŠAJ broj se nalazi na [i] [j] u nizu" </li>
 * <li>2. ukoliko se uneseni broj NE nalazi u postavljenom nizu ispis je "NESRETAN POKUŠAJ"</li>
 * </p>
 * KISS Keep It Simple Short
 * Keep It Stupid Short
 */
public class BreakWithLabelDemo {
    public static void main(String[] args) {
        //niz nizova -> kod kojeg su svi elementi iste dužine : pravilni niz / nazupčene
        int[][] arrayOfNumbers = {
                {32, 87, 3, 589}, //i = 0  -> j = 0, 1, 2, 3
                // [0, 0]= 32, [0, 1] = 87, [0, 2] = 3, [0, 3] = 589
                {12, 1076, 2000, 8},
                //[1, 0]
                {622, 127, 77, 955}
        };
        System.out.println("Unesi cijeli broj i okušaj sreću");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message = "NESRETAN POKUŠAJ";

//        for (int k = 0; k < arrayOfNumbers.length; k++) {
        MILICA:
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            //i=0 RED  j = 0, 1, 2, 3 KOLONE
            //i=1 RED  j = 0, 1, 2, 3
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                int numberInArray = arrayOfNumbers[i][j];//32, 87, 3
                if (numberInArray == enteredNumber) {
                    message = "SRETAN POKUŠAJ broj se nalazi na [ " + i + " ] [ " + j + " ]";
                    break MILICA;
                }
            }
        }
//        }
        System.out.println(message);
    }
}
