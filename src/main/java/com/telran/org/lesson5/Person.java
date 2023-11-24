package com.telran.org.lesson5;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // a cherez override toString eto vidast kak proizoshla peredacha ssilochnix dannix (y nas object)
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    } // bez opredeleniya methoda to String nam vidast hashCode esli napisat ("System.out.println("Person name " + alex); v main class
}
