package com.academy.three;

public class CjelobrojniTipoviDemo {
    public static void main(String[] args) {
        byte firstNumber = 127;
        System.out.println("Deklarisao si varijablu = " + firstNumber);
        short shortNumber = 32_767;
        System.out.println("Short number: " +shortNumber);
        // DEFAULT ili podrazumijevani cjelobrojni tip
        int thirdNumber = 127;//32 CPU i memorijski prostor
        System.out.println("Integer = " + thirdNumber);
        long longNumber = thirdNumber;//automatska konverzija tipa podatka
        int intNumber =(int) longNumber; // eksplicitnu konverziju
        System.out.println(intNumber);

        //TIP varijabla = VRIJEDNOST;
        // 1. evaluira se 34 ali kao int 2. automatska konverzija tipa u long 64 3. dodijeli se vrijedns
        long longNumber2 = 34;
        long longNumber3 = 34L;// 1. evaluira kao 64 bit long 2. dodijeli se vrijednost
    }
}
