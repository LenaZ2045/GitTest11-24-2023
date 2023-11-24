package com.telran.org.lesson4;

public class Parent {
    protected String name;
    public void printGreetings() {
        System.out.println("Hello, I am parent");
    }
    public final void printThanks() { // nikak nesmojem pereopredelit w/FINAL
        System.out.println("Thank you!");
    }
    protected void printWishes() {
        System.out.println("i wish you GOOD LUCK!!!");
    }
}
