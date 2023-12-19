package com.telran.org.lesson22;

public class OnlyNUmberTwo<T extends Number, U extends Number> {

    private T numberOne;
    private U numberTwo;

    public OnlyNUmberTwo(T numberOne, U numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void printSum() {
//        System.out.println(numberOne, numberTwo); // ?
    }
}
