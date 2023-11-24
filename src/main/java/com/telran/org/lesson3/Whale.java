package com.telran.org.lesson3;

public class Whale extends SeaAnimal implements Flyable, Eatable{ // implemented abstract methods from classes EarthAnimal and SeaAnimal

    private boolean tail;

    public Whale(String name) {
        super(name);
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean eat(String plants) {
        return false;
    }

    @Override
    public void see() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("I am a whale and I can fly");
    }

    @Override
    public boolean canEat() {
        return false;
    }
}
