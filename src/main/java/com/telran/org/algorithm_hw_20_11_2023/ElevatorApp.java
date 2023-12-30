package com.telran.org.algorithm_hw_20_11_2023;

public class ElevatorApp {
    public static void main(String[] args) {

        Elevator elevator1 = new Elevator(0, true);
        Elevator elevator2 = new Elevator(8, true);

        elevator1.addRequest(8);
        elevator2.addRequest(15);
        System.out.println(elevator1);
        System.out.println(elevator2);


        elevator1.move();
        elevator2.move();
        System.out.println(elevator1);
        System.out.println(elevator2);
        elevator1.getStops();
        System.out.println(elevator1);
        elevator2.getStops();
        System.out.println(elevator2);
    }
}
