package com.telran.org.lesson3.party;

public class GrandParent extends Guest implements LikeDance, DrinkAlcohol{
    public GrandParent(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void drink() {
        System.out.println("I am "+ super.getName() + ", and I like to drink");
    }

    @Override
    public void dance() {
        System.out.println("I am " + super.getName() + ", and I like to dance!");

    }
}
