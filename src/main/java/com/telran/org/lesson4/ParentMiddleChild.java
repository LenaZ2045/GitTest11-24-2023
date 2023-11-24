package com.telran.org.lesson4;

public class ParentMiddleChild extends Parent {
    @Override
    public void printGreetings() {
        System.out.println("Hello I am middle child"); // esli zakomnetiryu etot method to sledyuschiy vizovetsa method v Parent
    }
}
