package com.telran.org.lesson10;

import com.telran.org.lesson9.Person;

import java.util.HashSet;
import java.util.Set;

public class CompareObjectExample {

    public static void main(String[] args) {

        Cat catOne = new Cat();
        Cat catTwo = new Cat(); // if sravnit two objects with == is False

        boolean equals = catOne.equals(catTwo); // false because they have different hash numbers
        boolean equals1 = catOne.equals(catOne); // true
        // catTwo.equals(catOne);
        System.out.println(equals);
        System.out.println(equals1);

        Set<Cat> catSet = new HashSet<>(); // hash set code will compare if equals by strings same as works by comparing returned number if numbers are equals and then this objects are equal
        catSet.add(catOne);
        catSet.add(catTwo);
        System.out.println(catSet.equals(catSet));


    }

}
