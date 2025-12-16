package com.academy.four.operator;

import java.util.Scanner;

// instanceOf -> klase i objekte
public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("Kolko je 2 + 2 ? ");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTačnosti = result == 4;
        // "Tačno"  ili "Netačno" JDK 7  ? ternarni if condition
        String message = uslovTačnosti ? "Tačno" : "Netačno";
//        if (uslovTačnosti) {
//            message = "Tačno";
//        } else {
//            message = "Netačno";
//        }
        System.out.println(message);
    }
}
