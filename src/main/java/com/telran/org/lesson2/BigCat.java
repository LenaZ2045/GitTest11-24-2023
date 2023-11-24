package com.telran.org.lesson2;

public class BigCat extends Cat{ // pricvoili hasledovanie
    private int height; // dobavili novoe povedenie

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigCat(int age) {
        super(age);
    }
}
