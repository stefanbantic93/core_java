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
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj mjeseca:");
        int redniBrojMjeseca = new Scanner(System.in).nextInt();
        System.out.println("Unesite i godinu: ");
        int godina = new Scanner(System.in).nextInt();
        int brojDana;
        switch (redniBrojMjeseca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDana = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDana = 30;
                break;
            case 2:
                /**
                 * Sve prestupne godine djeljive su sa četiri ako nisu djeljive sa 100,
                 * kojima se dodaju one djeljive sa 400.
                 */
                if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                    brojDana = 29;
                } else {
                    brojDana = 28;
                }
                break;
            default:
                brojDana = 0;
                break;
        }
        System.out.println("Za uneseni mjesec " + redniBrojMjeseca + " i godinu " + godina + ", broj dana je jednak = " + brojDana);
    }
}
