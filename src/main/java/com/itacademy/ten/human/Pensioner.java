package com.academy.ten.human;

import java.time.LocalDate;

public class Pensioner extends Person {

    private double pensionAmount;

    public Pensioner(String _name, String surname, LocalDate birthday, double pensionAmount) {
        super(_name, surname, birthday);
        this.pensionAmount = pensionAmount;
    }


    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
