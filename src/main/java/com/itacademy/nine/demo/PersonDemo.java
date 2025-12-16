package com.academy.nine.demo;

/**
 * Konstruktori i funkcije koje se isto zovu:
 * <li>1. preklapanje po tipu parametara</li>
 * <li>2. ili preklapanje po broju parametara</li>
 */
public class PersonDemo {
    public static void main(String[] args) {
        //name, surname, age
        //name, surname : definiram konstruktor sa parametrima
        Person person1 = new Person("Đorđe", "Knežević");
        System.out.println("Momenat rođenja: " + person1.getName() + " " + person1.getSurname());
        person1.setSurname("Ženino");
        System.out.println("Momenat rođenja: " + person1.getName() + " " + person1.getSurname());
        person1.setAge(60);

        Person person2 = new Person("Milica", "Ivan", 18);
        System.out.println("Momenat rođenja: " + person2.getName() + " " + person2.getSurname() + " age : " + person2.getAge());
        person2.setSurname("Ivan Mirković");
        person2.setAge(23);
        System.out.println("Momenat rođenja: " + person2.getName() + " " + person2.getSurname() + " age : " + person2.getAge());

        Person person3 = new Person("Kristijan", 24);
        System.out.println("Momenat rođenja: " + person3.getName() + " " + person3.getSurname() + " age : " + person3.getAge());


    }
}
