package com.academy.six._switch;

import java.util.Scanner;

/**
 * <li>1. switch-case-break</li>
 * <li>2. switch-case</li>
 * <li>3. switch sa spojenim casevoima</li>
 * <p>
 * ZADATAK:
 * Korisnik unosi:
 * 1. redniBrojMjeseca u godini
 * 2. godinu 2000
 * <p>
 * Program izračuna koliko mjesec ima dana.
 * Mogući izlazi iz programa ili rezultati:
 * 1. 31
 * 2. 30
 * 3. 28
 * 4. 29
 * <p>
 * brojDanaUMjesecu = f(redniBrojMjeseca, godina)  -> y = f(x1, x2)
 * </p>
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj mjeseca:");
        int redniBrojMjeseca = new Scanner(System.in).nextInt();
        System.out.println("Unesite i godinu: ");
        int godina = new Scanner(System.in).nextInt();
        //Stil Java 12 yield( daj neki rezultat)
        int brojDana = switch (redniBrojMjeseca) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean prestupna = (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
                yield prestupna ? 29 : 28;
            }
            default -> 0;
        };
        System.out.println("Za uneseni mjesec " + redniBrojMjeseca + " i godinu " + godina + ", broj dana je jednak = " + brojDana);
    }
}
