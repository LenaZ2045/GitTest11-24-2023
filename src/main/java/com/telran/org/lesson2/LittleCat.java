package com.telran.org.lesson2;

public class LittleCat extends Cat{
    public LittleCat() { // chtob ne vvodit znachenie vozrasta nyjno cozdat pystoi konstruktor
    }

    public LittleCat(int age) { //cozdaem konstryktor vishe stoyaschego classa
        super(age);
    }

    public void jump() {
        System.out.println("I can jump");
    }
}
