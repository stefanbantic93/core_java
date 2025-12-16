package com.academy.four.operator;

import java.util.Scanner;

/**
 * Operatori poređenja;
 * 1. ==  equal to
 * 2. != not equal
 * 3. > greater than
 * 4. < less than
 * 5. >=
 * 6. <=
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2) {
            System.out.println("Brojevi su jednaki");
        }
        if (number1 != number2) {
            System.out.println("Brojevi su različiti");
        }
        if (number1 > number2) {
            System.out.println("Prvi broj je veći od drugog");
        }
        if (number1 >= number2) {
            System.out.println("Prvi broj je veći ili bar jednak drugom");
        }
        if (number1 < number2) {
            System.out.println("Prvi broj je manji od drugog");
        }
        if (number1 <= number2) {
            System.out.println("Prvi broj je manji ili bar jednak drugom");
        }
    }
}
