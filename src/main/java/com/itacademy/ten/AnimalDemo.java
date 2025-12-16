package com.academy.ten;

import com.academy.ten.animal.Animal;
import com.academy.ten.animal.Cat;
import com.academy.ten.animal.Dog;

/**
 * TIP varijablom = vrijednošću;
 *
 * OOP principles:
 * <li>1. Enkapsulacija</li>
 * <li>2. Abstraction --> Animal</li>
 * <li>3. Inheritance </li>
 * <li>4. Polimorfizam -> polimorfizam je direktno posljedica naslijeđivanja</li>
 *
 *   poly -> množina
 *   morph -> oblik
 *
 *   množina oblika -> višeobličnost
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // TIP varijabla = podaci u varijabli;
        // animal je tipa : Dog, Animal
        Animal animal = new Dog("Lesi");
        animal.playSound();//Aw Aw

        //animal je tipa: Animal, Cat
        animal = new Cat("Cicko");
        animal.playSound();//Mjau Mjau Mjau
    }
}
