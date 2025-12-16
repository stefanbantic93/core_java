package com.academy.ten.animal;


/**
 * Koja je suština postojanja klase ?
 * <odgovor>
 *     Kreiranje varijable/objekta/instance po šablonu klase.
 * </odgovor>
 *
 * Možemo li kreirati Animal ?
 *  NEMA SMISLA.
 *  Čemu onda suština postojanja ANimal.
 *
 *  SUština postojanja ANimal klase nije da se po njenom šablonu kreiraju objekti.
 *  Suština postojanja abstract klase je da se nametne obrazac ponašanja svim klasama po čijem šablonu će
 *  se kreirati objekti.
 */
public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void playSound();

    public String getName() {
        return name;
    }
}
