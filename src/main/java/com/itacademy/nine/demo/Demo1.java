package com.academy.nine.demo;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Brojač = " + Movie.getCounter()); // counter = 0
        Movie movie1 = new Movie();
        System.out.println("Brojač = " + movie1.getCounter());
        System.out.println("Brojač = " + Movie.getCounter());
        movie1.setName("Prohujalo s vihorom");
        movie1.setDirector("Victor Fleming");
        movie1.setEvaluation(-100);
        System.out.println(movie1.getName() + " -> " + movie1.getEvaluation());
        Movie movie2 = new Movie();
        System.out.println("Brojač = " + movie1.getCounter()); // 1 ili 2
        System.out.println("Brojač = " + movie2.getCounter()); // 2
        System.out.println("Brojač = " + Movie.getCounter()); // 2
        movie2.setName("Spiderman");
        movie2.setDirector("Sam Raimi");
        movie2.setEvaluation(29);
        System.out.println(movie2.getName() + " " + movie2.getDirector() + "  -> " + movie2.getEvaluation());
    }
}
