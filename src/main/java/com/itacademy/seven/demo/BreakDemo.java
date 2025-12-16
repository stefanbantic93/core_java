package com.academy.seven.demo;

import java.util.Scanner;

/**
 * Program:
 * Imaš niz brojeva: 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127
 * Želim da pustiš korisnika da unosi neki broj.
 * <p>
 * Program izbaci "SRETAN POKUŠAJ" ili "NESRETAN POKUŠAJ".
 * <li>1. ukoliko se uneseni broj nalazi u postavljenom nizu ispis je "SRETAN POKUŠAJ" </li>
 * <li>2. ukoliko se uneseni broj NE nalazi u postavljenom nizu ispis je "NESRETAN POKUŠAJ"</li>
 * </p>
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        System.out.println("Unesi cijeli broj i okušaj sreću");
        int enteredNumber = new Scanner(System.in).nextInt();
        //switch sa yield (void ka nekoj konkretnoj vrijednosti)
        String message = switch (enteredNumber){
            case 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 -> "SRETAN POKUŠAJ";
            default -> "NESRETAN POKUŠAJ";
        };
//        switch (enteredNumber){
//            case 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127:
//                message="SRETAN POKUŠAJ";
//                break;
//            default:
//                message = "NESRETAN POKUŠAJ";
//                break;
//        }
        System.out.println(message);
    }
}
