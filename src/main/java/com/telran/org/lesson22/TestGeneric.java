package com.telran.org.lesson22;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("I like ");
        Object o = list.get(0);
//        String text2 = list.get(0); // + "Generics!";
        String text1 = list.get(0) + "Generics!";
        String text3 = (String) list.get(0); // + "Generics!";


        System.out.println(text1);
        System.out.println(text3);
    }
}
