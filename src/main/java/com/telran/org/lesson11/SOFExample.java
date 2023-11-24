package com.telran.org.lesson11;

public class SOFExample {
    /// print ///
    /// print ///
    /// print ///
    /// main /// main block memory = memory given for MAIN then on top main-memory for method print, method print is calling itself and another memory main method calls method print another block for memory
    private static int count = 0;
    public static void main(String[] args) {
        print(); //vizivaem beskonechno ERROR IN CONSOLE

        System.out.println(); // will not be working after method print() as method print will not end its process

    }
    public static void print() {
        System.out.println("count " + count++);
        print(); // this example will end the place for memory as it is un-ending call for count
    }
}
