package com.telran.org.gittest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GitTest {
    public static void main(String[] args) {
        List<String> classmates = new ArrayList<>();
        classmates.add("Olga");
        classmates.add("Natasha");
        classmates.add("Eugene");
        classmates.add("Vladimir");
        classmates.add("Maria");

        System.out.println(classmates);
        Collections.sort(classmates);
        System.out.println("After Sorting :");
        for (String classmate : classmates) {
            System.out.print(" " + classmate);
        }
    }
}
