package com.academy.ten.human;

import java.time.LocalDate;

public class Student extends Person {

    private String indexNumber;

    public Student(String _name, String surname, LocalDate birthday, String indexNumber) {
        super(_name, surname, birthday);
        this.indexNumber = indexNumber;
    }


    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
