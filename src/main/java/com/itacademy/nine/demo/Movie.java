package com.academy.nine.demo;

/**
 * Klasa se koristi kao TIP podatka po čijem šablonu možemo kreirati varijable složenog tipa Movie.
 * <p>
 * Movie m1 = new Movie()
 * m1.name =
 * m1.director=
 * m1.evaluation=
 * m1.setEva
 * Movie m2 = new Movie()
 * <p>
 *     Klasa može imati:
 *
 *     <li>1. POLJA/FIELDS/PROPERTIES
 *          1.1 instancna ili pripadaju objektu ..ne možete kreirati polje name ako nema movie1
 *          1.2 static polja
 *        </li>
 *        <li>2. METODE ili FUNKCIJE
 *           1.1 pripadati objektu odnosno pozivati se nad objektom movie1.setEvaluation(10);
 *           1.2 static -> MAIN ..za njihov poziv preduvjet nije postojanje objekta.
 *        </li>
 *        <li>
 *            3. KONSTRUKTOR - konstruiše objekta..samo vezan za objekat ili varijablu koju konstruiše
 *        </li>
 * </p>
 */
public class Movie {

    private static int counter = 0;

    private String name;
    private String director;
    private int evaluation;

    //KONSTRUKTOR
    public Movie(){
        counter++;
    }


    /**
     * <li>parametar -> može poprimiti bilo koju int value npr. 1 - 1000000
     * <li> evaluation -> evaluacije imaju smisla od 1 do 10
     *
     * @param parametar
     */
    public void setEvaluation(int parametar) {
        if (parametar <= 0) {
            this.evaluation = 1;
        } else if (parametar >= 10) {
            this.evaluation = 10;
        } else {
            this.evaluation = parametar;
        }
    }

    /**
     * Koji je preduvjet da pozovete ovu funkciju ?
     * <p>
     *
     * </p>
     *
     * @return evaluation
     */
    public int getEvaluation() {
        System.out.println("Pozvao me neko da vratim evaluaciju...i ja to radim");
        return evaluation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Movie.getCounter();
    public static int getCounter() {
        return counter;
    }
}
