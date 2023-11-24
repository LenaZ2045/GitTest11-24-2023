package com.telran.org.lesson7;

import java.util.ArrayList;
import java.util.List;

public class IteratorAppExample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // massive array list interface
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (String element : list) {
            System.out.print(" " + element);
        }

        System.out.println();
        list.forEach(element -> {
            System.out.print(" " + element);
        }); //list.forEach(System.out.::print);
    }

}
