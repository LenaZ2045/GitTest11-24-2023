package com.telran.org.lesson3.party;

public class Woman extends Guest implements LikeDance{

    public Woman(String name, String gender, int age) {
        super(name, "F", age);
    }

    @Override
    public void dance() {
        System.out.println("I am " + super.getName() + ", and I like to dance!");
    }
}
