package com.telran.org.lesson15;

public class MultiplierImpl implements Multiplier{ // this class may be ignored and deleted
    @Override
    public void multiply(int value) {
        value *= 2;
        System.out.println("Result value * 2 = " + value);
    }
}
