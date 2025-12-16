package com.academy.six.loop;

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
public class WhileDeadLoopDemo {
    public static void main(String[] args) {
        int tajniBroj = 23;
        while (true) {
            System.out.println();
            System.out.println("Unesi broj");
            int uneseniBroj = new Scanner(System.in).nextInt();
            if (uneseniBroj == tajniBroj) {
                System.out.println("Unijeli sta magični broj");
                break;
            } else {
                System.out.println("Niste pogodili, pokušajte ponovo..");
            }
        }
    }
}
