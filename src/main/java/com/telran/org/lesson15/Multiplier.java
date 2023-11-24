package com.telran.org.lesson15;

@FunctionalInterface
public interface Multiplier {

    // ONLY ONE ABSTRACT METHOD
    void multiply (int value); // FUNCTIONAL INTERFACE THIS IS INTERFACE WHICH HAS ONLY ONE METHOD WHICH WE CAN OVERRIDE

    default  void  printHello() { // can have any amount of default methods because it has body itself no need realization
        System.out.println("Hello");
    }

    static void printWelcome() { // can have any amount of static methods because it has body itself no need realization
        System.out.println("Welcome");
    }
}
