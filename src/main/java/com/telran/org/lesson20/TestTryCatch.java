package com.telran.org.lesson20;

public class TestTryCatch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        // try - catch - finally
        // try - catch (is popular)
        // try - finally (is used sometimes as variation with this block try)
        try {
            System.out.println(array[7]);
        } catch (Exception e) {
            System.out.println("Handle exception in catch block");
        } finally {
            System.out.println("Code execution from finally block");
        }

        System.out.println("Hello");
        checkArray(array);

        System.out.println(getInt());
    }


    private static void checkArray(int[] array) {
        try {
            System.out.println(array[7]);
//            System.exit(0); // standard exit executes and after nothing is working
            return;
        } catch (Exception e) {
            System.out.println("Handle exception in catch block in method");
            return;
        } finally {
            System.out.println("Code execution from finally block in method");
        }
    }

    private static int getInt() {
        try {
            return 5;
        } catch (Exception e) {
            return 10;
        } finally {
            return 7; // block finally will execute always as it is priority block
        }
    }
}