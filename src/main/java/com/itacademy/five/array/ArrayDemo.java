package com.academy.five.array;

/**
 * Tipovi podataka:
 * <li>1. PROSTI: byte, short, int, long, float, double, char, boolean</li>
 * <li>2. SLOŽENI ili OBJECT </li>
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 26;
        System.out.println(number);
        //Ukoliko želim varijablu koja može upamtiti i 23 i 26 vrijednost - niz kao TIP
        /**
         * 2 načina kreiranja nizova u Javi
         * <p>
         *     Hoću da kreiram varijablu koja može primiti i broj 23 i broj 26.
         *     Ukupno 2 broja cijela.
         * </p>
         */
        //1. zauzimam prostor od 2 x 32-bit
        int[] numbers = new int[2];
        //2. ubacili na indekse ili pozicije u nizu dvije vrijednosti
        numbers[0] = 23;
        numbers[1] = 26;
        //numbers[2] = 39; ArrayIndexOutOfBoundsException - Exception Error
        System.out.println("Element at index 0 = " + numbers[0]);
        System.out.println("Element at index 1 = " + numbers[1]);
        //System.out.println("Element at index 2 = " + numbers[2]);ArrayIndexOutOfBoundsException - Exception Error

        /**
         * Drugi način koji se koristi SAMO kada su vam unaprijed POZNATI svi brojevi izgleda ovako.
         */
        //1. i jedini korak: 4x 32-bit -> 0 -> 23; 1 -> 26; 2 -> 39; 3 -> 45
        int[] numbers2 = {23, 26, 39, 45};
    }
}
