package com.telran.org.lesson9;

import java.util.HashSet;
import java.util.Set;

public class TestAppSEtExample2 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(11);
        integerSet.add(4); // not going to add similar element

        System.out.println(integerSet); // hash may have situation where it might save in order but not a fact
        System.out.println("set size is " + integerSet.size());
        System.out.println("contains element '3' ? " + integerSet.contains(3));
        integerSet.remove(2);
        System.out.println("set size is " + integerSet.size());

        Person two = new Person("Two"); // creating new collection from object
        Person one = new Person("One");
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(two);
        personHashSet.add(one);
        System.out.println(personHashSet); // quick time of reach O(N)
    }
}
