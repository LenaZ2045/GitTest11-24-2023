package com.telran.org.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PersonArrayListExample {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Alex");

        Person personTwo = new Person();
        personTwo.setName("Max");

        List<Person> personListOne = new ArrayList<>();
        personListOne.add(personOne);

        List<Person> personListTwo = new ArrayList<>();
        personListTwo.add(personTwo);

        List<Person> personList = new ArrayList<>();
        personList.addAll(personListOne);
        personList.addAll(personListTwo);
        System.out.println(personList);

        personListOne.remove(0); //personOne = null; memory garbage will work with this N-U-L-L
        personListTwo.remove(0);
        System.out.println(personListOne);
        System.out.println(personListTwo);
        System.out.println(personList);

        personOne.setName("New Name");
        System.out.println(personList);
    }
}
