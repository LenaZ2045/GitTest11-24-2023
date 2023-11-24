package com.telran.org.lesson15;

import java.util.function.Supplier;

public class TesSupplier {
    // supplier type is used for generation for the meanings it gets something show type which needs to be returned
    public static void main(String[] args) {
        Supplier<Double> randomValue = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        Supplier<Double> randomValueByLambda = () -> Math.random();

        Double aDouble = randomValue.get();
        System.out.println(aDouble);

        System.out.println(randomValueByLambda.get());

    }
}
