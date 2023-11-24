package com.telran.org.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstExampleOne {
    public static void main(String[] args) {

        List<String> stringListOne = new ArrayList<>();
        stringListOne.add("Red");
        stringListOne.add("White");
        System.out.println(stringListOne);

        List<String> stringListTwo = new ArrayList<>();
        stringListTwo.add("black");
        stringListTwo.add("Green");
        stringListTwo.add("Pink");
        stringListTwo.add("Red");
        System.out.println(stringListTwo);

        List<String> stringLIstThree = new ArrayList<>();
        stringLIstThree.addAll(stringListOne); // tak kak ssilochnie type dannix to mojem ob'edinit list
        stringLIstThree.addAll(stringListTwo);
        System.out.println(stringLIstThree);

    }
}
