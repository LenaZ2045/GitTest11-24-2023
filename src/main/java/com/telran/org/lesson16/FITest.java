package com.telran.org.lesson16;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FITest {

    public static void main(String[] args) {
        // convert string to upper case
        String string = "good morning!";
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(string.toUpperCase());
            }
        };
        stringConsumer.accept(string);

        Function<String, String> stringFunction = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(stringFunction.apply(string));


        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return string.toUpperCase();
            }
        };
        System.out.println(stringSupplier.get());
    }
}