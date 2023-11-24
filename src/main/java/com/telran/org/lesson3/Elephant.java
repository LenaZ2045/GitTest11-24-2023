package com.telran.org.lesson3;

public class Elephant extends EarthAnimal{
    public Elephant(String name) {
        super(name);
    } // implemented abstract methods form classes SeaAnimal and EarthAnimal


    @Override
    public boolean eat(String plants) {
        return false;
    }

    @Override
    public void see() {

    }

    @Override
    public void move() {

    }
}
