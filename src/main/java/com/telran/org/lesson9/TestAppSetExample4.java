package com.telran.org.lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestAppSetExample4 {
    public static void main(String[] args) {
        List<String> str = List.of("one", "two", "one", "three", "four", "three");
        List<String> duplicateList = getDuplicateList(str);
        System.out.println("Duplicate objects :" + duplicateList);

    }

    private static List<String> getDuplicateList(List<String> stringList) {
        Set<String> uniqueset = new HashSet<>();
        List<String> duplicateList = new ArrayList<>();
        for ( String value : stringList) {
            if (!uniqueset.add(value)) {
                duplicateList.add(value);
            }
        }
        return duplicateList;
    }
}
