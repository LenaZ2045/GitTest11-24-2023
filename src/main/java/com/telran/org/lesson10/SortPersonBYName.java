package com.telran.org.lesson10;

import java.util.Comparator;

public class SortPersonBYName implements Comparator<Person> { // ispolz class kot implementiryet komparator
    // method compare

    @Override
    public int compare(Person o1, Person o2) { // if it is == '+' then first object is more than second and second stand in front of first objet if == '-'then second obj is more than first and first stays in front of second if '0' they are equal
        return o1.getName().compareTo(o2.getName()); // returns numbers positive or negative
    } // for String is has the method compareTo which compares the String by alphabetical order
}
