package com.academy.ten;

import com.academy.ten.animal.Animal;
import com.academy.ten.animal.Dog;
import com.academy.ten.human.Person;

import java.time.LocalDate;

/**
 * TIP varijablom = vrijednošću;
 *
 * OOP principles:
 * <li>1. Enkapsulacija</li>
 */
public class Demo {
    public static void main(String[] args) {
        //STATIC
        LocalDate personBirthday = LocalDate.of(2000, 1, 1);
        Person person = new Person("Milica", "Ivan", personBirthday);
        //setName -> je funkcija za čiji poziv je preduvjet postojanje objekta..instancna ili objektna

        System.out.println(LocalDate.now());
//        Person p2 = new Person();
        //p2.setName();
        System.out.println(person.getName()+ " age = " + person.getAge());

//        Animal animal = new Animal("Hrčak");
        Dog dog = new Dog("Lesi");
        dog.playSound();
    }
}
