package com.academy.eight.demo.oop;

public class Movie {

    private static int counter = 0;

    private String title;
    private String director;
    // 1-10
    private int evaluation;

    // 1-10
    public void setEvaluation(int ocjena) {
        if (ocjena <= 0) {
            this.evaluation = 1;
        } else if (ocjena > 10) {
            this.evaluation = 10;
        } else {
            this.evaluation = ocjena;
        }
    }

    public int getEvaluation() {
        return this.evaluation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
