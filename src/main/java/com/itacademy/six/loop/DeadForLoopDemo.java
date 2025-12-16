package com.academy.six.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * Zadatak:
 * Program treba da pusti korisnika da unosi broj sve dok ne unese 23.
 * Npr.
 * Unesi broj
 * Unese korisnik 1 -> Unesi broj
 * Unese korisnik 16 -> Unesi broj
 * Unese korisnik 24 -> Unesi broj
 * Unese korisnik 23 -> Konačno si unio ispravan broj..
 */
public class DeadForLoopDemo {
    public static void main(String[] args) {
        int tajniBroj = 23;
        //for( ; ; ){
        // }
        for (; ; ) {
            System.out.println();
            System.out.println("Unesi broj");
            int unosKorisnika = new Scanner(System.in).nextInt();
            int razlika = unosKorisnika - tajniBroj;
            if (razlika == 0) {
                System.out.println("Unijeli ste magičan broj");
                break;
            } else if (razlika <= 5) {
                System.out.println("Jako ste blizu..ali niste ipak pogodili");
            } else if (razlika <= 10) {
                System.out.println("Blizu ste..ali niste još uvijek pogodili");
            } else {
                System.out.println("Niste pogodili..");
            }


        }
    }
}
