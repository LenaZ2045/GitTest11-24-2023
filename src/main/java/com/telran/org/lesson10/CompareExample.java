package com.telran.org.lesson10;

public class CompareExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        boolean isEqual = a == b;

        int c = 7; // vse chto sozdano cherez NEW eto object
        Integer d = Integer.valueOf(7); // new Integer(value: 7); because in last version Java.jdk.20 in library Integer is deprecated or deleted
        boolean isEqualsWithObject = c == d; // proizoshla raspakovka obertki

        System.out.println("Object and primitive c == d " + isEqualsWithObject);

//        Integer e = new Integer(100);
//        Integer w = new Integer(100); // when sravnivaem obkject will not give us true it is false as they are ssilki on object
//
//        System.out.println("Object == object " + (e == w)); // is FALSE
//
        Integer f = Integer.valueOf(100);
        Integer g = Integer.valueOf(100); // when sravnivaem object will give us true it is true as they are ssilki perevalued in stroki
        // -128 - 127 diapazon
        System.out.println("Object == object " + (f == g)); // is TRUE

    }
}
