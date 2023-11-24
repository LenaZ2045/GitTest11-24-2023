package com.telran.org.lesson3.party;

public class Man extends Guest implements DrinkAlcohol{

    public Man(String name, String gender, int age) {
        super(name, "M", age);
    }

    @Override
    public void drink() {
        System.out.println("I am "+ super.getName() + ", and I like to drink");
    }
}
