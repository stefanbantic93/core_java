package com.academy.nine.demo;

public class Person {
    private String name;
    private String surname;
    private int age;

    //new Person("Kristijan", "Birkić")  - overloading po broju parametara
    public Person(String ime, String prezime){
        this.name = ime;
        this.surname = prezime;
    }

//    public Person(String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }

    public Person(String ime, int age){
        this.name = ime;
        this.age = age;
    }

    public Person(String ime, String prezime, int age){
        this.name = ime;
        this.surname = prezime;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
