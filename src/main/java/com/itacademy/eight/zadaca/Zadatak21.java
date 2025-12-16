package com.academy.eight.zadaca;

import java.util.Scanner;

/**
 * Rješenje koje je case insensitive.
 * Pitanje:
 * Kako da napravimo da ovo rješenj bude neosjetljivo na velika i mala slova.
 * <p>
 * 32
 */
public class Zadatak21 {
    public static void main(String[] args) {
        //String literal - preporučen način kreiranja String varijabli
        //String Pool JMM Java Memory Model
        String text = "Petar Pan je pojeo pet plavih šljiva";
        System.out.println("Unesi slovo:");
        char slovo = new Scanner(System.in).nextLine().charAt(0);
        // ovo slovo može biti ili veliko ili malo
        // ja mogu provjeriti da li je veliko i pretvoriti ga u malo
        if (slovo >= 'A' && slovo <= 'Z') {
            slovo = (char) (slovo + 32);
        }
        char[] arrayOfChars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            char charInArray = arrayOfChars[i];
            if(charInArray >='A' && charInArray<='Z'){
                charInArray = (char) (charInArray + 32);
            }
            if (charInArray == slovo) {
                counter++;
            }
        }

        String message = "Slovo '%s' se nalazi u datom tekstu '%s' puta".formatted(slovo, counter);
        System.out.println(message);
    }
}
