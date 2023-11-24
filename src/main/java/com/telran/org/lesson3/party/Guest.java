package com.telran.org.lesson3.party;

public abstract class Guest {

    public String getName() {
        return name;
    }

    private String name;
    private String gender;
    private int age;

    public Guest(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printGreetings() {
        System.out.println("Hello I am " + name);
    }
}
