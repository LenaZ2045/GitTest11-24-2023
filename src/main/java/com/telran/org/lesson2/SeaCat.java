package com.telran.org.lesson2;

public class SeaCat extends BigCat {
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void voice() { // izmenyaem povedenie
        System.out.println("Hello!");
    }

    public SeaCat(int age) {
        super(age); // call constructor for Cat
    }
}
