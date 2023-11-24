package com.telran.org.lesson4;

public class ChildTwo extends Parent{
    public static final String HELLO = "Hello"; // konstanta HELLO

    @Override
    public void printGreetings() {
        System.out.println("Hello, I am child two!" + name);
    }

    public void printAll() {
        printGreetings();
        printThanks();
        printWishes();
    }
    public static void printHello() {
        System.out.println("Hello I am a child two");
    }
}
