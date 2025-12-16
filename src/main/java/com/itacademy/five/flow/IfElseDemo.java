package com.academy.five.flow;

import java.util.Scanner;

/**
 * Postavka zadatka.
 * Potrebno je napraviti program koji će profi olakšati ocjenjivanje.
 * Profa će fokusirati na evaluaciju vašeg rada i zbir poena.
 * Profa će definirati score(ostvareni broj poena).
 * Dakle, profesor će programu dati INPUT o broju ostvarenih poena na ispitu.
 * Ono što program mora izračunati jeste grade(OCJENA na osnovu ostvarenih poena).
 * Ocjene moraju biti definirane na sljedeći način:
 * <li>A 10 </li>
 * <li>B  9 </li>
 * <li>C  8</li>
 * <li>D  7</li>
 * <li>F  6</li>
 */
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj ostvarenih poena: ");
        int score = new Scanner(System.in).nextInt();
        char grade; //varijabla koja će definirati ocjenu na osnovu score
        // grade = f(score)  -> y = f(x)
        // if-then-else
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Ocjena na ispitu je = " + grade);
    }
}
