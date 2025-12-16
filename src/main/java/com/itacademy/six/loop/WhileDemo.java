package com.academy.six.loop;

/**
 * while -> sve dok je ispunjen uslov
 *
 * <p>
 * PETLJA = blok koda koji se ponavlja sve dok je zadovoljen uslov petlje.
 * <p>
 * while(expresion koji vrati true ili false){
 * //blok koda petlje
 * <p>
 * korak petlje
 * }
 * </p>
 * <p>
 * Tri termina:
 * 1. uslov petlje
 * 2. blok koda petlje
 * 3. korak petlje
 */
public class WhileDemo {
    public static void main(String[] args) {
        int number = 11;
        while (number > 0) {
            System.out.println(number);
            number = number - 2;
        }
        System.out.println("....itd");
    }
}
