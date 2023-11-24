package com.telran.org.lesson4;

import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input current day: ");
        String dayAsString = scanner.nextLine().toUpperCase();
        Day input = Day.valueOf(dayAsString);
        switch (input) {
            case FRIDAY:
                System.out.println("Hurray!!!");
            break;
            case MONDAY:
                System.out.println("Work Day");
            break;
            default:
                System.out.println("Another");
        }
//        Day[] values = Day.values();
//        for (Day value : values) {
//            System.out.println(value);
//        }
    }

    public static void printAllDays() {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }
    }

}
