package com.telran.org.lesson22;

import java.util.ArrayList;
import java.util.List;

public class TestGenericTwo {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Java");
        list.add(2); // list collection saves objects with different types of data

        Integer value = 2; // ne yavnoe privedenie tipa
        int vaalueInt = value;
        Object value1 = 2;
        int valuInt1 = (int) value1; // yavnoe privedenie tipa
        for(Object str : list) {
            System.out.println((String) str);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
//        stringList.add(2); // stage of compilation notifies about the mistake
    }
}
