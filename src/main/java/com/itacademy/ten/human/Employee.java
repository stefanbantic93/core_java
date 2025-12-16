package com.academy.ten.human;

import java.time.LocalDate;

public class Employee extends Person {
    private double salaryAmount;

    public Employee(String _name, String surname, LocalDate birthday, double salaryAmount) {
        super(_name, surname, birthday);
        this.salaryAmount = salaryAmount;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
