package com.academy.three;

public class DecimalNumberDemo {
    public static void main(String[] args) {
        /*
        float
        32 bitni zapis u memoriji približno precizan 6 do 7 decimala.
        Nije za finansijske proračune.
        Step1: 3.4 kaže Java: "Ovo je 64-bitni decimalni broj i treba mi 64 bita"
        Step2: 64bit 3.4 ubaci u float
        Step3: ubaci u floatNumber
         */
        float floatNumber = (float) 3.4;
        /**
         * Step 1: 3.4F float 32 bit
         * Step 3: ubaci float vrijednost u float varijablu/memorijski prostor
         */
        float floatNumber2 = 3.4F;



        /**
         * double DEFAULT za decimalne brojeve
         * 3.4 -> Java ovo interpretira kao 64 bitni double broj
         */

        double doubleNumber = 3.4;

        double a = 0.1;
        double b = 0.2;
        double c = a + b; // 0.3

        System.out.println("0.1 + 0.2 = " + c);
        System.out.println("Da li je 0.1 + 0.2 = 0.3 ? Odgovor = " + (c == 0.3));

        /**
         * Zašto float i double jesu takvi kakvi jesu - neprecizni ?
         * Odgovor: oni koriste binarni floating point format
         * 0.1 BigDecimal
         * GUI
         */

    }
}
