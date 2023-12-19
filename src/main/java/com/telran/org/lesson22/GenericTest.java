package com.telran.org.lesson22;

public class GenericTest<T> {

    private T obj;

    private String name;

    GenericTest(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj; // zdes mi cozdali universalniy class kotoriy rabotaet s lyubimi tipami dannix
    }
}
