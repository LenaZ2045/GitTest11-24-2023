package com.telran.org.lesson3;

public class Bird implements Flyable, Eatable{

    @Override
    public void fly() {
        System.out.println("I am a bird and I can fly");
    }

    @Override
    public boolean canEat() {
        return true;
    }
}
