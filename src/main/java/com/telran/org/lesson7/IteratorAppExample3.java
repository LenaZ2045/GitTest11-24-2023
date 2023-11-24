package com.telran.org.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorAppExample3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // massive array list interface
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Iterator in forward direction");
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        System.out.println();
//        use list iterator when you need to make reverse perebor
        System.out.println("Iterator in backward direction"); //works with posledovatelnimi
        while (iterator.hasPrevious()) { // has method to ask for index to perform iteration
            System.out.print(" " + iterator.previous());
        }

        System.out.println();
        ListIterator<String> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            System.out.print(" " + reverse.previous());
        }
    }

}
