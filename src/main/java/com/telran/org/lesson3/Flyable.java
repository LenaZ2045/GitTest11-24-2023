package com.telran.org.lesson3;

public interface Flyable { // eto polnost'yu abstract class implementiryet

//    s pomoschiuy interface mi svyazivayem ne rodstvennie classes

    String name = null;

    void fly(); // oni abstractniye i publichnie

    default void canFly() {
        System.out.println("");
    }
}
