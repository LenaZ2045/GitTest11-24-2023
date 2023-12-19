package com.telran.org.lesson22;

import java.util.Comparator;

public class OnlyNumberTest {

    public static void main(String[] args) {
        OnlyNumbers<Integer> integerNUmber = new OnlyNumbers<>(1);
//        OnlyNumbers<String> stringWithNumber = new OnlyNumbers<String>("hello");
        OnlyNumbers numberOne = new OnlyNumbers(4);
        OnlyNumbers numberTwo = new OnlyNumbers(2L);
//        OnlyNumbers numberThree = new OnlyNumbers("Hi"); // compile error

//        Comparator<> // to see library Java class it has <T>
    }
}
