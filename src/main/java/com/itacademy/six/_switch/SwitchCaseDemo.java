package com.academy.six._switch;

import java.util.Scanner;

/**
 * <li>1. switch-case-break</li>
 * <li>2. switch-case</li>
 *
 * <p>
 * Zadatak:
 * Pravimo program koji će omogućiti korisniku da isto tako unese redni broj dana u sedmici.
 * Npr. korisnik unese 3
 * Program ispiše : Mittwoch, Donnerstag, Freitag, Samstag, Sonntag
 * <p>
 * Npr. korisnik unese 6
 * Program ispiše : Samstag, Sonntag
 * <p>
 * Korisnik unosi redni broj dana u sedmici, a program ispiše preostale dane na Njemačkom.
 * </p>
 *
 *
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmici: ");
        int dayWeekNumber = new Scanner(System.in).nextInt();
        String preostaliDani = "";
        switch (dayWeekNumber) {
            case 1:
                preostaliDani = preostaliDani + " Montag";
            case 2:
                preostaliDani = preostaliDani + " Dienstag";
            case 3:
                preostaliDani = preostaliDani + " Mittwoch";
            case 4:
                preostaliDani = preostaliDani + " Donnerstag";
            case 5:
                preostaliDani = preostaliDani + " Freitag";
            case 6:
                preostaliDani = preostaliDani + " Samstag";
            case 7:
                preostaliDani = preostaliDani + " Sonntag";
                break;
            default:
                System.out.println("Sedmica ima 7 dana i zato i jeste sedmica");
        }
        System.out.println(preostaliDani);
    }
}
