package com.telran.org.lesson22;

public class GenericMethodTest {

    public static void main(String[] args) {

        String str = "Hello";
        String name = str.getClass().getName();
        System.out.println(name);

        Integer value = 6;
        System.out.println(value.getClass().getName());

        printClassName("Hello");

        printClassName(5);

        printClassName(1.0);

        printClassNameTwo("Hello Again!");
        printClassNameTwo(6);
        printClassNameTwo(1.5);
    }

    private static void printClassName (Object element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static <T> void printClassNameTwo (T element) { // generic method works with universal data types, and we have to add <T> to the signature of the method
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
