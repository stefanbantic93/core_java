package com.academy.seven.demo;

/**
 * Kada koristimo String-ove uvijek trebamo koristiti String literal ?
 *
 * <p>
 *    String literal -> to znači da Stringove kreiramo kao proste tipove:
 *    <li>  String name = "Milica";  </li>
 *    <li>NE: String name = new String("Milica"); </li>
 * </p>
 */
public class StringDemo {
    public static void main(String[] args) {
        String name = "Milica"; // m1
        String name2 = new String("Milica"); // m2
        String name3 = "Milica"; // m1

        System.out.println(name.equals(name2));//  true
        System.out.println(name.equals(name3));//  true
        System.out.println(name == name2);// false
        System.out.println(name == name3); //  true
    }
}
