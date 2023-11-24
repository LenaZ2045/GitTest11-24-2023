package com.telran.org.lesson4;

public class ChildOne extends ParentMiddleChild{

    private ChildOne() {
        // ne sozdaetsa object za predelami danogo class if static used we do not need to create object
    }
    @Override
    public void printGreetings() {
        System.out.println("Hello, I am child one!"); // esli zakomentirovat etot method to sledyuschiy vazovetsya kototriy naxoditsa v klasse ParentMiddleChild see it
    }

    public static ChildOne create() {
        return new ChildOne();
    }
}
