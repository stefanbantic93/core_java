package com.academy.eight.zadaca;

import java.util.Scanner;

/**
 * Rješenje koje je case sensitive.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        //String literal - preporučen način kreiranja String varijabli
        //String Pool JMM Java Memory Model
        String text = "Petar Pan je pojeo pet plavih šljiva";
        System.out.println("Unesi slovo:");
        char slovo = new Scanner(System.in).nextLine().charAt(0);

        char[] arrayOfChars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            char charInArray = arrayOfChars[i];
            if (charInArray == slovo) {
                counter++;
            }
        }

        String message = "Slovo '%s' se nalazi u datom tekstu '%s' puta".formatted(slovo, counter);
        System.out.println(message);
    }
}
