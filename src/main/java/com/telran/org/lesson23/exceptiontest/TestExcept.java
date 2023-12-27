package com.telran.org.lesson23.exceptiontest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestExcept {
    public static void main(String[] args) {
        // Test Throwable
        // Exceptions are:
        //1 - mistakes/Errors (we do not touch and do not work with
        //2 - Exceptions (we renew/refactoring, create, and generate
        // we are working only with the #2 ->exceptions

        //Checked exceptions - means read when compiling they are requiring refactoring USE ex: try catch
        //Unchecked - means unread we cannot check them we get to know about them when we run program, and they do not need refactoring while compiling ex: NullPointerException we only do here manual refactoring
        //User Exceptions - extends from RuntimeException we create them our own

        //Example checked exception (we see it right away)
        try {
            FileReader fileReader = new FileReader("//user/user/one.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("File Not Found");
//            exception.printStackTrace();
        }

        // Example unchecked exception (we do not see them but when running compilator will throw exception
        int x = 0;
        int y = 10;
// ex: unchecked exception with scanner
        Scanner scanner = new Scanner(System.in);
        int result = -1;
        while (result != 9) {
            result = scanner.nextInt();
            System.out.println(y / result);
        }
// ex: unchecked exception wth variables x, y
        mathOperation(x, y);
    }

    private static void mathOperation(int x, int y) {
        int z = y / x;
        System.out.println("Dividing y/x = " + z);
    }
}