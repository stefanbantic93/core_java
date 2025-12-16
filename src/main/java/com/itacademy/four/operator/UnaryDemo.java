package com.academy.four.operator;

/**
 * 1. + -> Unarni plus operator ; indicira da se radi o pozitivnom broju
 * 2. - -> Unarni minus operator
 * 3.  ++ -> Inkrement
 *     3.1 pre inkrement
 *     3.2 post inkrement
 * 4, --
 *    4.1 pre
 *    4.2 post
 *
 *  5. invertor / komplement
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number++);//1. pošalji u konzolu (23) -> 2. nakon slanja u konzolu uvećaj za 1 = 24
        System.out.println(++number);//1. uvećaj za 1 = 25 2. pošalji u konzolu 25

        int broj = 24;
        System.out.println(broj--); // 24  -> 23
        System.out.println(--broj); // 22 -> 22

        boolean success = true;
        System.out.println(!success);
    }
}
