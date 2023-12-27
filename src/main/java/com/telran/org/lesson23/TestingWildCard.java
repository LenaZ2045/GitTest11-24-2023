package com.telran.org.lesson23;

import java.util.Arrays;
import java.util.List;

public class TestingWildCard {
    public static void main(String[] args) {

        Student alex = new Student("Alex");
        Student oleg = new Student("Oleg");
        Person maxim = new Person("Maxim");

        List<Person> people = Arrays.asList(alex, oleg, maxim);

        List<Student> students = Arrays.asList(alex, oleg);

        checkAndAddPerson(people);

        checkPerson(students);
        addPerson(students);

    }

    // two position in the wild cards
    // ? extends SomeClass - inserts/accepts type of data which is inheritance-наследование class
    // ? super SomeClass - inserts type of data which is parent of the class
    // List<? extends Object> == == List<?> any type of variable starting from Object
    // PECS - Producer Extends Consumer Super

    private static void checkAndAddPerson(List<Person> people) {
        Student gena = new Student("Gena");
        people.add(gena);
        for (Person person : people) {
            System.out.println("check person" + person);
        }
    }


    // people - Producer. argument = producer and need to use extends
    private static void checkPerson(List<? extends Person> people) { // here we use wild card
        for (Person person : people) {
            System.out.println("check person" + person);
        }
    }

    // people - Consumer. argument = consumer and need to use super
    private static void addPerson(List<? super Student> people) { // if we have methods add and read we cannot use wild card
        Student petr = new Student("Petr");
        people.add(petr);
    }
}