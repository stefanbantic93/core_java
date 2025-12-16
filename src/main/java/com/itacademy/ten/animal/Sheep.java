package com.academy.ten.animal;

public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Meeee m - e -e -e ");
    }
}
