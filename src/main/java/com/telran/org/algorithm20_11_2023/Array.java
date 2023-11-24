package com.telran.org.algorithm20_11_2023;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 1, 2, 3, 0, 1, 2, 3, 0, 0, 0, 0, 1, 1};
        moveZeroToEnd(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(moveZeroToEnd(array)));


    }

    public static int[] moveZeroToEnd(int[] array) {
        int[] result = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[count++] = array[i];
                System.out.println(result);
            } else {
                count++;
                System.out.println(count);
            }
        }
        return result;
    }
}

