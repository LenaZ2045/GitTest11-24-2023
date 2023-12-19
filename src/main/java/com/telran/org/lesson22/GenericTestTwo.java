package com.telran.org.lesson22;

public class GenericTestTwo<T, U> { // parametrizirovannie classes

    private T objectOne;
    private U objectTwo;

    public GenericTestTwo(T objectOne, U objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    public void print() {
        System.out.println(objectOne);
        System.out.println(objectTwo);
    }
}
