package com.telran.org.lesson23.exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUncheckedHandle {

    public static void main(String[] args) {

        System.out.println("Start Code");
        mathOperation(0, 5);
        System.out.println("End Code");
        System.out.println("Input 1 or 2 to continue our application");
        int inputOption = getInputOption();
        if (inputOption == 1 || inputOption == 2) {
            System.out.println("Continue");
        } else {
            System.out.println("End of Application");
        }

    }

    private static void mathOperation(int x, int y) {
        try {
            int z = y / x;
            System.out.println("Dividing y/x = " + z);
        } catch (ArithmeticException exception) {
            System.out.println("Dividing by Zero? try another data");
        }
    }

    private static int getInputOption() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            return 0;
        }
    }
}
