package com.academy.nine.oop;

/**
 * abstract -> ne možete kreirati objekat/instancu po šablonu ove klase.
 * <p>
 *     Čemu služi klasa po čijem šablonu ne možemo kreirati objekat ?
 *
 *     Apstraktne klase služe da nametnu neki šablon ponašanja klasama koje će naslijediti ovu klasu.
 * </p>
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
