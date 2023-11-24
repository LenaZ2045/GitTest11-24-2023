package com.telran.org.algorithm_hw_13_10_2023;

class Fibonacci {
    static double FibonacciIteration(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        for (i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return 0;
    }

    static double FibonacciRecursion(int count) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            FibonacciRecursion(count - 1);
        }
        return n3;
    }

    public static void main(String args[]) {

        int n = 10;
        int count = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 );
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(" Fibonacci Iteration " + FibonacciIteration(n));

        System.out.println();
        System.out.print(n1 + " " + n2);
        FibonacciRecursion(count - 2);
        System.out.print(" Fibonacci Recursion " + FibonacciRecursion(count));
    }
}