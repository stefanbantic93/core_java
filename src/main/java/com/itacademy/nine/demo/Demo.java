package com.academy.nine.demo;

import java.util.stream.Stream;

/**
 * TIP_PODATKA varijabla = PODACI_KOJE_VARIJABLA_NOSI;
 *
 * <p>
 *     Tipovi:
 *      1. prosti
 *      2. složene tipove
 * </p>
 */
public class Demo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 13;
        System.out.println(number);

        //prvi složeni tip podatka
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 13;
        //Enhanced for loop
        for(int broj: numbers ){
            System.out.print(broj+" ");
        }
        System.out.println();
        /**
         * Dva ograničenja koja postavljaju nizovi:
         * <li>1. svi unutar niza moraju biti ISTOG tipa... int</li>
         * <li>2. fiksna dužina: Kolekcijama ćemo prevazići ovo drugo ograničenje</li>
         */
        // new Movie() -> java.land.Object
        /**
         * OOP:
         * <li>1. enkapsulacija
         *              MODIFIKATORI vidljivosti: private, package private(no key word), protected, public
         * </li>
         */
        //TIP_PODATAKA objekat = podatke;
        int brojac = Movie.getCounter();
        System.out.println("Brojač = " +brojac);
        Movie movie1 = new Movie();
        movie1.setName("Prohujalo s vihorom");
        movie1.setDirector("Victor Fleming");
//        movie1.evaluation = -1;
        movie1.setEvaluation(-100);
        System.out.println(movie1.getName() +  " -> " + movie1.getEvaluation());

        Movie movie2 = new Movie();
        movie2.setName("Spiderman");
        movie2.setDirector("Sam Raimi");
        movie2.setEvaluation(29);
        System.out.println(movie2.getName() + " " + movie2.getDirector() +"  -> " + movie2.getEvaluation());
        

        //
        Person p1 = new Person("Đorđe", "Knežević");
        System.out.println(p1.getName()+" " + p1.getSurname());
        p1.setSurname("Ženino");
        p1.setAge(60);
    }
}
