package com.telran.org.lesson20;

public class TestTryWR1 {
    public static void main(String[] args) {

        try (CustomReader reader = new CustomReader();) { // sample with implemented class from the Java library AutoCloseable
            int[] array = {12};
            System.out.println(array[5]);
            System.out.println("Hi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
