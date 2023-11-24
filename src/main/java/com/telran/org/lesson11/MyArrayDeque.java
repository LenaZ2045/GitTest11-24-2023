package com.telran.org.lesson11;

public class MyArrayDeque implements MyDeque{

    private static final int DEFAULT_CAPACITY = 10; // if need to enter number in constructor use the number by capacity
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    public MyArrayDeque() {
        elements = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public void AddToHead(Integer element) {

    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Integer removeHead() {
        return null;
    }

    @Override
    public Integer removeTail() {
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peekTail() {
        return null;
    }
    // bio directional and method to grow inert array
    public void grow(){
        //element * 1.5
    }
}
