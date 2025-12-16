package com.academy.eight.zadaca;

public class Zadatak11 {
    public static void main(String[] args) {
        //String literal - preporučen način kreiranja String varijabli
        //String Pool JMM Java Memory Model
        String text = "Petar Pan je pojeo pet plavih šljiva";
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char slovo = text.charAt(i);
            if (slovo == 'p' || slovo == 'P') {
                counter++;
            }
        }
        String message = "Slovo p ili P se nalazi u datom tekstu '%s' puta".formatted(counter);
        System.out.println(message);
    }
}
