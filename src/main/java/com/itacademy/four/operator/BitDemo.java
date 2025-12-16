package com.academy.four.operator;
//operatori na nivou bita-nemojte ih koristiti
public class BitDemo {
    public static void main(String[] args) {
        // 00000....11 -> 0b00100
        //                0b01000
        //                0b00010
        int number = 4;
        number = number>>2;
        System.out.println(number);
    }
}
