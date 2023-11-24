package com.telran.org.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExampleThree {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);

        List<String> filterListBordSize = filterListByWordSize(stringList,5);
        System.out.println(filterListBordSize);

        String collect = collect(stringList);
        System.out.println(collect);

        List<String> collect1 = stringList.stream() // example stream api
                .filter(s -> s.length() < 5)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
    private static List<String> filterListByWordSize(List<String> stringList, int wordSize) {
        List<String> newList = new ArrayList<>();
        for (String valur : stringList) {
            if(valur.length() < wordSize) {
                newList.add(valur);
            }
        }
        return newList;
    }
    private static String collect(List<String> stringList) {
        String result = null; // String builder in next lessons
        for (int i=0; i<stringList.size(); i++) {
            String value = stringList.get(i);
            result = result + " " + value; // bad case (instead of creating variable value we may ask \+ stringList.get(i)\
        }
        return result;
    }
}
