package com.telran.org.lesson9;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestAppSetExample1 {
    public static void main(String[] args) {
        //interface Set ->  interface SortedSet -> TreeSet eto (krasno cherno derevo balancing binary search)

        SortedSet<String> sortedSet = new TreeSet<>(); // we first did Set<String> sortedSet = new TreeSet
        // add - add element to set and has built in true or false
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("F");
        sortedSet.add("C");

        System.out.println(sortedSet);
        // last and first methods - get last and first elements from sorted set (use SortedSet)
        String last = sortedSet.last();
        System.out.println("last element is " + last); // or we may do instead of line 21 do as ("last element is " + sortedSet.last())
        System.out.println("first element is " + sortedSet.first()); // this method is constructed in Java library
        // contains - check that elements exist in set
        System.out.println("contains? element 'E' " + sortedSet.contains("E"));
        System.out.println("contains? element 'B' " + sortedSet.contains("B"));
        // remove - delete element from set
        sortedSet.remove("B");
        System.out.println(sortedSet);

        //  a
        //  /\
        //  b c
        //    /\f

        System.out.println("Iterate with for-each : "); // TREE-SET not able to insert meaning NULL
        for (String value : sortedSet) {
            System.out.println(" " + value);
        }

        System.out.println();
        // Example with own object need to make extra adding to methods to make it read in the TreeSet
        Person person = new Person("One");
        Person person1 = new Person("Two");
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person);
        personSet.add(person1);
        System.out.println(personSet);
    }
}
