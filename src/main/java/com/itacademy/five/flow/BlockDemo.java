package com.academy.five.flow;

import java.util.Scanner;

/**
 * Kontrole toka
 * <p>
 * Složenija kontrola toka:
 * <li>1. if-else</li>
 * <li>2. if-then-else</li>
 * <li>3. switch</li>
 *
 *
 * KISS Keep It Simple Short
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki broj i provjeri da li si sretan ?!..");
        int number = new Scanner(System.in).nextInt();
        boolean happinessCondition = number <= 23;//false
        // if( izraz -> čija krajnja vrijednost mora biti true/false ili kako kažemo boolean tipa)
        if (happinessCondition) {
            System.out.println("Sretni ste ....");
        } else {
            System.out.println("Niste baš srećni..");
        }
    }
}
