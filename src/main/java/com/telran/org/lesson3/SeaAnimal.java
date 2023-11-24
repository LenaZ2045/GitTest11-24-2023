package com.telran.org.lesson3;

public abstract class SeaAnimal extends Animal { // abstract class ne imeet realizatcii eto pravilo

    public SeaAnimal(String name) {
        super(name);
    }

    public abstract void swim(); // abstract method
}
