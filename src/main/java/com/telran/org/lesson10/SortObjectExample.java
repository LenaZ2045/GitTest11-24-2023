package com.telran.org.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortObjectExample {
    public static void main(String[] args) {
        Person personOne = new Person("ONe", 20);
        Person personTwo = new Person("Two", 25);
        Person personThree = new Person("Three", 15);

        List<Person> personList1 = new ArrayList<>();
        List<Person> personList = Arrays.asList(personOne, personTwo, personThree); // vspomogatelni arrays listkotori bydet sort

        for ( int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println();
        SortPersonByAge sortPersonByAge = new SortPersonByAge();
        Collections.sort(personList, new SortPersonByAge()); // new is object of the comparator and sortPersonByAge is variable
        Collections.sort(personList, sortPersonByAge); // another way how to write this expression on line 23

        for ( int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        Collections.sort(personList, new SortPersonBYName());
        System.out.println();

        for ( int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        List<Cat> cats = Arrays.asList(new Cat(), new Cat());
        Collections.sort(cats);

        System.out.println();
        for ( int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
