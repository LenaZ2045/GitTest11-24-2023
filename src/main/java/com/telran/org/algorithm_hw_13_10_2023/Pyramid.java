package com.telran.org.algorithm_hw_13_10_2023;

public class Pyramid {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;

        String o = "orange";
        String b = "blue";
        String y = "yellow";

        System.out.println("at the start " + p1 + " pyramid: (" + o + b + y + ") " + p2 + " pyramid: (...) " + p3 + " pyramid: (...)");
        System.out.println("step ONE " + p1 + " pyramid: (. " + b + y + ") " + p2 + " pyramid: (...) " + p3 + " pyramid: (.. " + o + ")");
        System.out.println("step TWO " + p1 + " pyramid: (.. " + y + ") " + p2 + " pyramid: (.. " + b + ") " + p3 + " pyramid: (.. " + o + ")");
        System.out.println("step THREE " + p1 + " pyramid: (.. " + y + ") " + p2 + " pyramid: (. " + o + b + ") " + p3 + " pyramid: (...)");
        System.out.println("step FOUR " + p1 + " pyramid: (...) " + p2 + " pyramid: (. " + o + b + " )" + p3 + " pyramid: (.. " + y + ")");
        System.out.println("step FIVE " + p1 + " pyramid: (.. " + o + ") " + p2 + " pyramid: (.. " + b + ")" + p3 + " pyramid: (.. " + y + ")");
        System.out.println("step SIX " + p1 + " pyramid: (.. " + o + ") " + p2 + " pyramid: (...) " + p3 + " pyramid: (. " +b + y + ")");
        System.out.println("step SEVEN " + p1 + " pyramid: (...) " + p2 + " pyramid: (.. " + o + ") " + p3 + " pyramid: (. " +b + y + ")");
        System.out.println("at the EIGHT " + p1 + " pyramid: (...) " + p2 + " pyramid: (...) " + p3 + " pyramid: ("+ o +b + y + ")");
        System.out.println("YOU are winner!!! " + " +" + 1500 + " points");

    }
}
