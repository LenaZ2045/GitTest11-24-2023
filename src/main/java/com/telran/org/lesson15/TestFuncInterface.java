package com.telran.org.lesson15;

public class TestFuncInterface {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        multiplier.multiply(10);

        // here we are calling interface and method AND Created class
        // how it is getting turned onto lambda virajenie
        Multiplier multiplier1 = value -> System.out.println("Result value * 5 = " + (value * 5)); // simplify it in one string line

        multiplier1.multiply(4);

        Multiplier multiplier2 = new Multiplier() { // laMBda virajenie "->" most important peremennaya and its inner realization
            @Override
            public void multiply(int value) { // and we can subtract lines which we do not need when creating laMBda LOOK MULTIPLIER2
                value *= 10;
                System.out.println("Result value * 10 = " + value);
            }
        };
        multiplier2.multiply(6);

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        Printer printer1 = () -> System.out.println("Hello");
    PrinterAddOn printerAddOn = (one, two) -> System.out.println(" " + one + " " + two);
    printerAddOn.print("Hello", "World");
    }

}
