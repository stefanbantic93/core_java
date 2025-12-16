package com.academy.eight.demo.oop;

public class MovieDemo {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "Kristijan";
        names[1] = "Birkić";

        Movie movie1 = new Movie();
        movie1.setDirector("Steven Spielberg");
        movie1.setTitle("Ajkula");
//        movie1.evaluation = 10;
        movie1.setEvaluation(1000);
        System.out.println(movie1.getTitle()+" ocijenjen " + movie1.getEvaluation());

        Movie movie2 = new Movie();
        movie2.setTitle("Spidermen");
        movie2.setDirector("Režiser");
//        movie2.evaluation = -10;
        movie2.setEvaluation(-10);
        System.out.println(movie2.getTitle() + " ocijenjen " + movie2.getEvaluation());
    }
}
