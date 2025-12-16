package com.academy.six._switch;

import java.time.LocalDate;
import java.time.Period;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1988, 9, 12);
        Period period = birthday.until(today);
        System.out.println(period.getYears());
    }
}
