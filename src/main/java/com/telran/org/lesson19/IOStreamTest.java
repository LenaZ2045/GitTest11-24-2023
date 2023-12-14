package com.telran.org.lesson19;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class IOStreamTest {
    public static void main(String[] args) {
        // OutputStream, InputStream - byte stream
        // Reader, Writer - char stream

        //System out
        OutputStream out = System.out;
        System.out.println("Hello"); // standard stream for output
        System.out.print("Hello"); // different stream for output
        System.out.println();
        System.out.printf("%b%n", null); // format stream output

        int x = 100;
        System.out.printf("Print integer : x = %d\n", x); // %d\n full number
        float y = 3.14f;
        System.out.printf("Formatted float y = %.6f\n", y); // float number with six symbols after point %.6f\n

        Date date = new Date();
        System.out.printf("hours %tH : minutes %tM: seconds %tS", date, date, date); // date hours %tH date minutes %tM date seconds %tS

        // System in
        InputStream in = System.in; // standard stream for input
        Scanner scanner = new Scanner(in);

        // System err
        PrintStream err = System.err;
        System.err.println("Hello world");
    }
}
