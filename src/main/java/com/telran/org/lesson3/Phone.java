package com.telran.org.lesson3;

public abstract class Phone { // ne mojem sozdavat object classa tak kak eto abstract class ne vsegda soderjit abstract methods

    public void call() {
        System.out.println("Call to number");

    }

//    public void receiveCall() {
//        System.out.println("Receive call");
//    }

    public abstract void receiveCall(); // abstract method bez realizatcii

}
