package com.telran.org.lesson11;

public interface MyDeque {

    void AddToHead(Integer element);

    void addToTail(Integer element);

    boolean isEmpty();

    Integer removeHead();

    Integer removeTail();

    Integer peekHead();

    Integer peekTail();
}
