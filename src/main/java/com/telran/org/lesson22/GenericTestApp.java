package com.telran.org.lesson22;

public class GenericTestApp {

    public static void main(String[] args) {
        System.out.println("Class with specific type of data");
        Test test = new Test("Hello");
        System.out.println(test.getObj());

        TestInteger testInteger = new TestInteger(5);
        System.out.println(testInteger.getObj());

        System.out.println("Universal class with its different type data-");
        GenericTest<String> objectStr = new GenericTest<>("Hello");
        System.out.println(objectStr.getObj());

        GenericTest<Integer> objectInt = new GenericTest<>(7);
        System.out.println(objectInt.getObj());

        GenericTest<Double> objectDouble = new GenericTest<>(3.5);
        System.out.println(objectDouble.getObj());

        System.out.println("Generic class with two types of data");
        GenericTestTwo<String, Integer> objectStringInteger = new GenericTestTwo<>("Hello", 6);
        objectStringInteger.print();
    }
}
