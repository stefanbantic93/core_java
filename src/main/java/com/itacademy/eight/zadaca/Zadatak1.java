package com.academy.eight.zadaca;

public class Zadatak1 {
    public static void main(String[] args) {
        //String literal - preporučen način kreiranja String varijabli
        //String Pool JMM Java Memory Model
        String text = "Petar Pan je pojeo pet plavih šljiva";
        char[] arrayOfChars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            char slovo = arrayOfChars[i];
            if (slovo == 'p' || slovo == 'P') {
                counter++;
            }
        }

        String message = "Slovo p ili P se nalazi u datom tekstu '%s' puta".formatted(counter);
        System.out.println(message);
    }
}
