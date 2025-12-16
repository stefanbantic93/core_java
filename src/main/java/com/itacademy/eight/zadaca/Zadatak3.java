package com.academy.eight.zadaca;

public class Zadatak3 {
    public static void main(String[] args) {
        String sentence = "Pogledaj kroz prozor i vidjet ćeš da pada snijeg";
        String word = "proz";

        char[] nizSlovaRecenice = sentence.toCharArray();
        char[] nizSlovaRijeci = word.toCharArray();
        boolean rijecSadrzana = false;
        KRISTIJAN:
        for(int i = 0; i<nizSlovaRecenice.length; i++){


            for(int j = 0; j<nizSlovaRijeci.length; j++){
                //i = n
                //j = 0 -> 1 -> 2
                int indeksSlovaRečenice = i +j;
                char slovoRečenice = nizSlovaRecenice[indeksSlovaRečenice];
                char slovoRiječi = nizSlovaRijeci[j];
                if(slovoRiječi != slovoRečenice){
                    continue KRISTIJAN;
                }
            }
            /**
             * Kada će se izbršiti blok koda ispod: rijecSadrzana = true; i break; ?
             * ODGOVOR:
             * <p>
             *     Kada se provrti cijela unutarnja petlja koja se odnosi na riječ AND nikada se ne desi continue KRISTIJAN;
             * </p>
             */
            rijecSadrzana = true;
            break;
        }
        System.out.println(rijecSadrzana ? "Riječ sadržana" : "Nije sadržana");
    }
}
