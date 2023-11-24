package com.telran.org.lesson10;

import java.util.Comparator;

public class SortPersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) { // sorting by : who is less and : who is more by age of the objects
        return o1.getAge() - o2.getAge(); // in our example this method works by result of '+' '-' or '==' when positive then first object is larger than second, and it is switches them by putting smaller element in front of the larger element
    } // when b is more than a but less than c it means that a is less than c
}
