package com.academy.ten.human;

import com.academy.ten.animal.Animal;
import com.academy.ten.animal.Cat;
import com.academy.ten.animal.Dog;

import java.time.LocalDate;
import java.time.Period;

/**
 *  -> ::   java.time
 *
 *  KOMPOZICIJE -> Person  HAS-A(sadrži) String/LocalDate
 *
 *  Open/Close...Mijenjam Person da bi omogućio Kristijanu da ima Mačku/Cat
 *  Nisam CLOSED for MODIFICATION
 */
public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private Animal animal;

    public Person(String _name, String surname, LocalDate birthday){
        this.name = _name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public void setName(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = this.birthday.until(now);
        int years = period.getYears();
        return years;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
