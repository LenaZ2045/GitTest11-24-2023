package com.telran.org.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAppExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // massive array list interface
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.iterator(); //method iterator

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) { // proverka esli est sledyschi element
            String next = iterator.next(); // realizatciya method
            System.out.print(next + " ");
        }
        // -> A-> B-> C-> D-> E-> posle zavershaetsa pri pomodhi iteratora
//        String one = iterator.next(); // ne srabotaet tak kak posle cycle while A, B, C, D, E posle E nety drygogo elementa

        System.out.println();

        Iterator<String> iterator1 = list.iterator();
        System.out.println(iterator1.next()); // method next in implemented interface which is Iterator
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());

    }
}
