package com.telran.org.lesson7;

import java.util.ArrayList;
import java.util.List;

public class IteratorAppExample5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        //1
        long start = System.currentTimeMillis(); // important to read condition instructions
        for (int i=0; i < integerList.size(); i++){
            Integer integer= integerList.get(i);
            System.out.print(" " + integer);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time for execute 'for' is " + (end - start));


        //2
        System.out.println(); // for arrays, it will work longer but for collections it works faster with cycle with iterator
        long start1 = System.currentTimeMillis(); // in our situation it is a collections form iterator
        for(Integer element : integerList) {
            System.out.print(" " + element);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time for execute 'forEach' is " + (end1 - start1));

    }
}
