package com.telran.org.lesson22;

public class OnlyNumbers<T extends Number> { //classes which only nasledyut class Number this is any types of number type data

    private T number;

    public OnlyNumbers(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println(number);
    } // here we ogranichili object with specific type of data
}

