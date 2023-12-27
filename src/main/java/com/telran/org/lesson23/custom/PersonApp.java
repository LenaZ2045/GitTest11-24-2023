package com.telran.org.lesson23.custom;

import com.telran.org.lesson23.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonApp {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("alex"));


        int key = 5;
        try {
            checkPerson(map, key);
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(map.get(key));
    }

    private static void checkPerson(Map<Integer, Person> map, int key) {
        if (!map.containsKey(key)) {
            throw new PersonNotFoundException("Person with id " + key + " not found");
        }
    }
}
