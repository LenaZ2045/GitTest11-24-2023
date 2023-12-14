package com.telran.org.lesson20;

public class CustomReader implements AutoCloseable{ // override method
    @Override
    public void close() throws Exception {
        System.out.println("Hello from close method");
    }
}
