package com.telran.org.lesson4;

import java.util.List;

public class Calculator { // rabota s polimarfizmom

    // static polimarfizm - eto peregryzka
    public static void main(String[] args) { // static polimarfizm
        System.out.println(mult(2, 2));
        System.out.println(mult(2.6, 2.9));
        System.out.println(mult(2, 3, 4));
//        List.of(1,2,3,4,5,6);


    }
    private static int mult(int a, int b) {
        return  a*b;
    }
    private static int mult(int a, int b, int c) {
        return a*b*c;
    }
    private static double mult(double a, double b) {
        return a*b;
    }
}

