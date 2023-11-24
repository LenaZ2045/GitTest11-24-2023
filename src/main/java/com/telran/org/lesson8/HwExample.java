package com.telran.org.lesson8;

import java.util.ArrayList;
import java.util.List;

public class HwExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        List<Integer> doubleValuesInList = getDoubleValuesInList(integerList);
        System.out.println(doubleValuesInList);

    }
    private static void getDoubleList(List<Integer> integerList) { // when we do not return from method we can write VOID
        for (int i = 0; i < integerList.size(); i++) {
           Integer integer = integerList.get(i);
           integerList.set(i, integer * 2); // this is the correct way to do
            System.out.println(integer * 2); // this is not how we should write
        }
    }
    private static List<Integer> getDoubleValuesInList(List<Integer> integerList) {
        List<Integer> doublelist = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            doublelist.add(integerList.get(i) * 2);
        }
        return doublelist;
    }
}
